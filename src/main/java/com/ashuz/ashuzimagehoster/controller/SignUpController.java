package com.ashuz.ashuzimagehoster.controller;

import com.ashuz.ashuzimagehoster.entity.UserEntity;
import com.ashuz.ashuzimagehoster.model.request.SignUpRequest;
import com.ashuz.ashuzimagehoster.model.response.SignUpResponse;
import com.ashuz.ashuzimagehoster.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @RequestMapping(path = "/sign-up", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<SignUpResponse> signUp(@RequestBody SignUpRequest request){
        final UserEntity savedUser = signUpService.signUp(request);
        SignUpResponse signUpResponse = new SignUpResponse();
        signUpResponse.setId(savedUser.getId());
        signUpResponse.setStatus("USER SUCCESSFULLY REGISTERED");

        return new ResponseEntity<>(signUpResponse, HttpStatus.OK);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(){
        return "H3ll0 W0r1d!";
    }
}
