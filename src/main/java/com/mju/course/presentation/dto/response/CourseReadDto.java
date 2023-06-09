package com.mju.course.presentation.dto.response;

import com.mju.course.domain.model.course.Cart;
import com.mju.course.domain.model.course.Course;
import com.mju.course.domain.model.course.CourseLike;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@AllArgsConstructor
@Builder
public class CourseReadDto {

    // 코스
    @Schema(description = "코스 인덱스", defaultValue = "2")
    private Long courseIndex;
    @Schema(description = "카테고리", defaultValue = "프로그래밍")
    private String category;
    @Schema(description = "코스 이름", defaultValue = "자바 기초")
    private String courseName;
    @Schema(description = "코스 가격", defaultValue = "100000")
    private Long price;
    @Schema(description = "코스 설명", defaultValue = "자바 기초")
    private String courseDescription;
    @Schema(description = "난이도", defaultValue = "2")
    private int difficulty;
    @Schema(description = "코스 생성 시간")
    private int courseTime;
    @Schema(description = "조회수", defaultValue = "2")
    private Long hits;
    @Schema(description = "코스 기본(타이틀) 사진 url")
    private String courseTitlePhotoUrl;

    @Schema(description = "커리 큘럼 수", defaultValue = "3")
    private int curriculumSum;

    @Schema(description = "스킬", defaultValue = "Java, Programming")
    private List<String> skillList;

    @Schema(description = "커리 큘럼 객체")
    private List<CurriculumReadDto> curriculumReadDtoList;

    @Schema(description = "코스 좋아요 수")
    private int courseLikeSum;

    @Schema(description = "장바구니에 담은 유저수")
    private int cartSum;

    @Schema(description = "유저가 좋아요 누른 코스인지 ", defaultValue = "false")
    private boolean userAddcourseLike;

    @Schema(description = "유저가 장바구니에 담은 코스인지", defaultValue = "false")
    private boolean userAddCart;

    private LecturerInfoDto lecturerInfoDto;

    public void addUserInfo(Optional<Cart> cart, Optional<CourseLike> like) {
        if(cart.isPresent()) userAddCart = true;
        if(like.isPresent()) userAddcourseLike = true;
    }

    public static CourseReadDto of(Course course, List<String> skillList, ArrayList<CurriculumReadDto> curriculumReadDtoList, LecturerInfoDto lecturerInfoDto){
        return CourseReadDto.builder()
                .courseIndex(course.getId())
                .category(course.getCategory())
                .courseName(course.getCourseName())
                .price(course.getPrice())
                .courseDescription(course.getCourseDescription())
                .difficulty(course.getDifficulty())
                .courseTime(course.getCourseTime())
                .courseTitlePhotoUrl("https://d19wla4ff811v8.cloudfront.net/" + course.getCourseTitlePhotoKey())
                .skillList(skillList)
                .curriculumSum(curriculumReadDtoList.size())
                .curriculumReadDtoList(curriculumReadDtoList)
                .hits(course.getHits())
                .courseLikeSum(course.getCourseLikeList().size())
                .cartSum(course.getCartList().size())
                .lecturerInfoDto(lecturerInfoDto)
                .build();
    }
}
