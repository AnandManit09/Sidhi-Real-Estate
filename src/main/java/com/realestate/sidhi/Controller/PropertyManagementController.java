package com.realestate.sidhi.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController
@RequestMapping("/property")
public class PropertyManagementController {

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        String resp="Ping-pong, Application is running";
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
}
