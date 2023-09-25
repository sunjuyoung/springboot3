package com.example.lms.model;

import com.example.lms.model.common.BaseTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Attachment extends BaseTime {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "attachment_seq")
    @SequenceGenerator(name = "attachment_seq", sequenceName = "attachment_seq", allocationSize = 1)
    @Column(name = "attachment_id")
    private Long id;

    private String url;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

}
