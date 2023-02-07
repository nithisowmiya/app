package com.product.products.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "code")
	private String productCode;

	@Column(name = "description")
	private String produDescription;

	
	 @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "product_id")
	    private List<ProductDetails>productDetails;
}

