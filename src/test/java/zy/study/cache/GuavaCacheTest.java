package zy.study.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;
import zy.study.entity.User;

import java.util.Date;

import static org.testng.Assert.*;

public class GuavaCacheTest {

    @Test
    public void testGet() {

        Cache<Long, User> cache = CacheBuilder.newBuilder().maximumSize(100).build();

        String name = "tom";
        long id = 100L;

        User user = new User();
        user.setBirthday(new Date());
        user.setId(id);
        user.setName(name);


        cache.put(user.getId(), user);


        // guava cache 返回的对象就是存储进去的对象，存在数据被污染的可能
        Assert.assertSame(user, cache.getIfPresent(id));

        user.setName("mike");

        // 数据被污染
        Assert.assertNotEquals(name, cache.getIfPresent(id).getName());


    }
}