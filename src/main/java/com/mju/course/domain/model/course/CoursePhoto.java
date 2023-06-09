package com.mju.course.domain.model.course;

import com.mju.course.domain.model.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class CoursePhoto extends BaseTimeEntity {

    @Id
    @Column(name = "course_photo_index")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="course_index")
    private Course course;

    @Column(name = "course_photo_key")
    private String coursePhotoKey;

}
