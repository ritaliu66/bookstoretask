package com.epam.bookstoreservice.dto.request;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@Builder
public class UserRequestDTO {

    private String username;

    private String password;

    private String phoneNumber;
}
