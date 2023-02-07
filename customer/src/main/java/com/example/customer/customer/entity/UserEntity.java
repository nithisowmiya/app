package com.example.customer.customer.entity;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@lombok.Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;
    @Column(name = "name")
    private String userName;
    @Column(name = "password")
    private String userPassword;
    public void setAndEncryptPassword(String password) {
		setUserPassword(PasswordUtil.getEncryptedPassword(password));
}
	
}