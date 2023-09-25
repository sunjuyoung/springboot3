package com.example.lms.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Chapter {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "chapter_seq")
    @SequenceGenerator(name = "chapter_seq", sequenceName = "chapter_seq", allocationSize = 1)
    @Column(name = "chapter_id")
    private Long id;

    private String title;

    private String description;

    private String videoUrl;

    private int position;

    private boolean isPublished;

    private boolean isFree;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

}
