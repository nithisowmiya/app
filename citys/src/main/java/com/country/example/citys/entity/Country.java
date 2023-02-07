package com.country.example.citys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int country_id;
    @Column(name ="name")
    private String countryName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="city_id")
    private List<city> city;
}
