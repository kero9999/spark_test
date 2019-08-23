package com.kero99.wp;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author wp
 * @date 2019-08-23 15:35
 */
public class TbMail {
    private Long id;
    private String title;
    private String context;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date hdate;
    @JSONField(serialize=false)
    private TbUsers users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getHdate() {
        return hdate;
    }

    public void setHdate(Date hdate) {
        this.hdate = hdate;
    }

    public TbUsers getUsers() {
        return users;
    }

    public void setUsers(TbUsers users) {
        this.users = users;
    }
}
