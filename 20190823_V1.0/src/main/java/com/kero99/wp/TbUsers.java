package com.kero99.wp;

import java.util.List;

/**
 * @author wp
 * @date 2019-08-23 15:24
 */
public class TbUsers {
    private Long id;
    private String name;
    private Integer age;
    private List<TbMail> mails;

    @Override
    public String toString() {
        return "TbUsers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mails=" + mails +
                '}';
    }

    public List<TbMail> getMails() {
        return mails;
    }

    public void setMails(List<TbMail> mails) {
        this.mails = mails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
