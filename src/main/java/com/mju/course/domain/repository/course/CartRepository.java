package com.mju.course.domain.repository.course;

import com.mju.course.domain.model.course.Cart;
import com.mju.course.domain.model.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByCourseAndUserId(Course findCourse, String userId);
}
