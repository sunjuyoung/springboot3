package com.example.lms.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseLine {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "purchase_line_seq")
    @SequenceGenerator(name = "purchase_line_seq", sequenceName = "purchase_line_seq", allocationSize = 1)
    @Column(name = "purchase_line_id")
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;

    private int orderPrice;
}
