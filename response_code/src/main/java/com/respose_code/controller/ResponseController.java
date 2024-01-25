package com.respose_code.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResponseController {

    @GetMapping("/ok")
    public ResponseEntity<String> okstatus(){
        return new ResponseEntity<String>(HttpStatus.OK);
    }
    @GetMapping("/created")
    public ResponseEntity<String> createdstatus(){
        return new ResponseEntity<String>(HttpStatus.CREATED);
    }
    @GetMapping("/notfound")
    public ResponseEntity<String> notfoundstatus(){
        return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("/unauthorized")
    public ResponseEntity<String> unauthorizedstatus(){
        return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
    }
    @GetMapping("/badgateway")
    public ResponseEntity<String> badgatewaystatus(){
        return new ResponseEntity<String>(HttpStatus.BAD_GATEWAY);
    }

}
