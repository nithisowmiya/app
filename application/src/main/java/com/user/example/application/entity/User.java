package com.user.example.application.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="applicatio")
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id")
	    private int id;

	    @Column(name = "user_name")
	    private String userName;

	    @Column(name ="dob")
	    private String dob;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "country")
	    private String country;
	}

