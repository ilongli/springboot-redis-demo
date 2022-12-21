package com.ilongli.springbootredisdemo;

import com.ilongli.springbootredisdemo.curd.Student;
import com.ilongli.springbootredisdemo.curd.StudentRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author ilongli
 * @date 2022/12/20 14:23
 */
@RestController
public class TestController {

    @Resource
    private RedisTemplate redisTemplate;

    @GetMapping("save")
    public String save(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
        return "ok";
    }


    @Resource
    private StudentRepository studentRepository;

    @GetMapping("crud/save")
    public String crudSave() {

        Student student = new Student("user001", "jack", Student.Gender.MALE, 1);

        studentRepository.save(student);

        return "ok";
    }

    @GetMapping("crud/find")
    public Student crudFindById(String id) {

        Optional<Student> student = studentRepository.findById(id);

        return student.get();
    }

}
