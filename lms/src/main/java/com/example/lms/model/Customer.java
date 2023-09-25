package com.example.lms.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "chapter_seq")
    @SequenceGenerator(name = "chapter_seq", sequenceName = "chapter_seq", allocationSize = 1)
    @Column(name = "chapter_id")
    private Long id;

    private String name;

    private String email;

    private String password;

    private String phone;

    private String address;


}
