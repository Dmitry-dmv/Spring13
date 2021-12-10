package com.example.spring13.Web;

import com.example.spring13.dto.UserDetails;
import com.example.spring13.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dmitrii Chernykh
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class Controller {


    private final UserService userService;



    @GetMapping("/{id}")
    public String getSomeData(@PathVariable Integer id) {
        return "Hello # " + id;
    }

    @GetMapping("/all")
    public List<UserDetails> getAll() {
        return userService.getAll();
    }

    @PostMapping("/register")
    public String getSomeOtherData(@RequestBody UserDetails userDetails) {
        log.info(userDetails.toString());
        userDetails.add();
        return "Ok!";
    }


}
