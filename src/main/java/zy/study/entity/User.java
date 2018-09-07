package zy.study.entity;

import java.util.Date;

/**
 * user
 *
 * @author zhangyan
 * @create 2018-09-07 9:59
 */
public class User {

    private long   id;
    private String name;
    private Date   birthday;


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Date getBirthday() {
        return birthday;
    }


    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
