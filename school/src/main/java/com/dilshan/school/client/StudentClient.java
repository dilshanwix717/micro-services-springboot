package com.dilshan.school.client;

import com.dilshan.school.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="student-service",url="${application.config.student-url}")
public interface StudentClient {
    @GetMapping("/schools/{school-id}")
    List<Student> FindAllStudentBySchool(@PathVariable("school-id") Integer schoolId);
}
