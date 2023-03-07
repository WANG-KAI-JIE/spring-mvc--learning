package top.kjwang.entity;

import java.util.Date;

/**
 * @author kjwang
 * @Date 2023/3/7 15:55
 */
public class Person {
    private String name;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date birthDay;
}
