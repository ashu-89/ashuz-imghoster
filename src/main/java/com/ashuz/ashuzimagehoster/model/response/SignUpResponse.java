package com.ashuz.ashuzimagehoster.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class SignUpResponse {

    private UUID id;
    private String status;

}
