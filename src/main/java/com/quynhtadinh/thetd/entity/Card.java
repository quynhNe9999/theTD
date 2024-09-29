package com.quynhtadinh.thetd.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Table(name = "card")
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_number", nullable = false)
    private String cardNumber;

    @Column(name = "card_holder_name")
    private String cardHolderName;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "image") // Đường dẫn hoặc tên file hình ảnh của thẻ
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
