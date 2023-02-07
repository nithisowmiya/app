package com.example.customer.customer.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;
@lombok.Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userse")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int customerId;
    @Column(name = "name")
    private String customerName;
    @Column(name = "password")
    private String customerPassword;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="user_id")
    private List<UserEntity> user;
}
