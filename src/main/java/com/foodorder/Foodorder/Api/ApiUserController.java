package com.foodorder.Foodorder.Api;

import com.foodorder.Foodorder.Payload.Response.BaseResponse;
import com.foodorder.Foodorder.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class ApiUserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ResponseEntity<?> getAllUser(){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(userService.getAllUser());
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
}
