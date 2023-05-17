package com.mju.course.application.course;

import com.mju.course.domain.model.other.Result.CommonResult;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CourseService {
    CommonResult readCourseList(String category, String order, List<String> skill, Pageable pageable);
    CommonResult readCourse(Long course_index, Long userId);

    CommonResult addCart(Long userId, Long course_index);
    CommonResult deleteCart(Long userId, Long course_index);
    CommonResult courseLike(Long userId, Long course_index);

    CommonResult searchCourse(String search);
}
