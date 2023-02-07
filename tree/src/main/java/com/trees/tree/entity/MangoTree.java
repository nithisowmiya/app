package com.trees.tree.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mango")
public class MangoTree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String mangoName;
    @Column(name = "price")
    private String mangoPrice;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Mango1_id")
    private List<Mango1>Mango1;
}
