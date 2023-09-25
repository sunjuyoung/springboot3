package com.example.lms.model;

import com.example.lms.model.common.BaseTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString(exclude = {"id","customer"})
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Course extends BaseTime {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq", sequenceName = "course_seq", allocationSize = 1)
    @Column(name = "course_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    private String title;

    private String description;

    private String imageUrl;

    private int price;

    private boolean isPublished;





}
