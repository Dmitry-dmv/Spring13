package com.example.spring13.dto;

import lombok.Data;

/**
 * @author Dmitrii Chernykh
 */
@Data
public class UserDetails {

    private Integer id;
    private String name;
    private String Surname;


    public void add() {
        // TODO document why this method is empty
    }
}
