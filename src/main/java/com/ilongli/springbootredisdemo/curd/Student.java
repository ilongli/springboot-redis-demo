package com.ilongli.springbootredisdemo.curd;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

/**
 * @author ilongli
 * @date 2022/12/20 15:14
 */
@RedisHash("Student")
@Data
@AllArgsConstructor
public class Student implements Serializable {

    public enum Gender {
        MALE, FEMALE
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;

}
