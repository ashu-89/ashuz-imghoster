package com.ashuz.ashuzimagehoster.controller;

import com.ashuz.ashuzimagehoster.model.request.SignUpRequest;
import com.ashuz.ashuzimagehoster.model.response.SignUpResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    /*@RequestMapping(path = "/sign-up", method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SignUpResponse> signUp(@RequestBody SignUpRequest request){

    }*/

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(){
        return "H3ll0 W0r1d!";
    }
}
