package com.mju.course.domain.repository.lecture;

import com.mju.course.domain.model.course.Curriculum;
import com.mju.course.domain.model.lecture.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long>, LectureRepositoryCustom {

    List<Lecture> findByCurriculum(Curriculum curriculum);

    Optional<Lecture> findByLectureSequence(int lecture_sequence);

    Optional<Lecture> findByCurriculumAndLectureSequence(Curriculum findCurriculum, int lecture_sequence);
}
