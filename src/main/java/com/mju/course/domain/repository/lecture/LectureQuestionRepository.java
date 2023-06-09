package com.mju.course.domain.repository.lecture;

import com.mju.course.domain.model.lecture.LectureQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureQuestionRepository extends JpaRepository<LectureQuestion, Long> {

}
