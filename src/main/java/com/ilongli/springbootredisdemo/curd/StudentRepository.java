package com.ilongli.springbootredisdemo.curd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * @author ilongli
 * @date 2022/12/20 15:16
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
