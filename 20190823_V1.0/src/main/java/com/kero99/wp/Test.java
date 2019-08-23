package com.kero99.wp;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wp
 * @date 2019-08-23 15:25
 */
public class Test {
    public static void main(String [] args){
        //Object  ==> JSON
//        int age = 17;
//        Date date = new Date();
//        List<TbUsers> list=new ArrayList<>();
//        for(long i=1;i<11;i++){
//            TbUsers users=new TbUsers();
//            users.setId(1000+i);
//            String name = "zhanghan"+i;
//            users.setName(name);
//            users.setAge(++age);
//            List<TbMail> mails = new ArrayList<>();
//            for(long j=1;j<16;j++){
//                TbMail mail = new TbMail();
//                mail.setId(i*100+j);
//                mail.setTitle(name+"的测试标题"+j);
//                mail.setContext(name+"的测试内容"+j);
//                mail.setHdate(date);
//                mail.setUsers(users);
//                mails.add(mail);
//            }
//            users.setMails(mails);
//
//
//            list.add(users);
//        }
//        String json = JSON.toJSONString(list);
//        System.out.println("json:"+json);
        //JSON  ==> Object




        String json ="{\"id\":1001,\"name\":\"zhangsan\",\"age\":18,\"sex\":\"男\"}";
        TbUsers users= JSON.parseObject(json,TbUsers.class);
        System.out.println("users:"+users);




























    }
}
