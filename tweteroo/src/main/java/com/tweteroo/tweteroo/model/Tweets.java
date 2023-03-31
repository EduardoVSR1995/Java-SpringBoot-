package com.tweteroo.tweteroo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Tweets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;    

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column
    private String tweet; 
}
