package com.example.spring.spring.entity;

import javax.persistence.Table;

import com.medical.video.entity.PasswordUtil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@lombok.Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="spring")
public class SpringEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int springId;
    @Column(name = "name")
    private String springName;
    @Column(name = "password")
    private String springPassword;
    
    public void setAndEncryptPassword(String password) {
		setSpringPassword(PasswordUtil.getEncryptedPassword(password));
	
	}
   
}


