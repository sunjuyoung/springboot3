package com.example.lms.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "purchase_seq")
    @SequenceGenerator(name = "purchase_seq", sequenceName = "purchase_seq", allocationSize = 1)
    @Column(name = "purchase_id")
    private Long id;


    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL)
    private List<PurchaseLine> purchaseLines = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;


}
