package com.example.lms.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class MuxData {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "mux_data_seq")
    @SequenceGenerator(name = "mux_data_seq", sequenceName = "mux_data_seq", allocationSize = 1)
    @Column(name = "mux_data_id")
    private Long id;

    private String assetId;

    private String playbackId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

}
