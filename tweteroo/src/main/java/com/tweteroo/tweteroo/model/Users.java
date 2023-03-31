package com.tweteroo.tweteroo.model;

import com.tweteroo.tweteroo.DTO.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Users {

    public Users( UserDTO request ){
        this.username = request.username();
        this.avatar = request.avatar();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)    
    private String username;
    
    @Column
    private String avatar;
}
