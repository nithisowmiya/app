package com.library.example.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book2")
public class book2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bookId;
    @Column(name = "book2_name")
    private String book2Name;
    @ManyToOne(cascade = CascadeType.ALL)
    private librarys librarys;
}
