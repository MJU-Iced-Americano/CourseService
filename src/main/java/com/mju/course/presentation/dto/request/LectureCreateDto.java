package com.mju.course.presentation.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LectureCreateDto {
    @Schema(description = "강의 이름", defaultValue = "프로젝트 생성")
    @NotNull @NotBlank
    private String lectureTitle;

    private String lectureDescription;

    private int lectureTime;
}
