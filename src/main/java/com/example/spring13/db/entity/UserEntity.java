package com.example.spring13.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Dmitrii Chernykh
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table( schema = "public",name = "my_user")
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
