package com.example.be2ndproject.shopping_mall.web.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyInfoResponse {
    private String name;
    private String email;
    private String phoneNum;
    private LocalDate birthDate;
    private LocalDateTime createdAt;
    private Boolean userStatus;
    private String profileImgUrl;
    private Integer businessNum;

}
