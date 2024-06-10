package com.renanBoettger.project.resources;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.renanBoettger.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Renan", "renan@gmail.com", "996688535", "0844844r");
        return ResponseEntity.ok().body(u);
    }
}
