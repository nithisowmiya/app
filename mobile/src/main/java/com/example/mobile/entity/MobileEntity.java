package com.example.mobile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.Type;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mobile")
public class MobileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Type(type = "uuid-char")
	private UUID id;
	@Column(name = "name")
	private String mobname;
	@Column(name = "type")
	private String mobtype;
	@Column(name = "model")
	private String mobmodel;
}
