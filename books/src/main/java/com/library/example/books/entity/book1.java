package com.library.example.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book1")
public class book1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bookId;
    @Column(name = "book1_name")
    private String book1Name;
    @ManyToOne(cascade = CascadeType.ALL)
    private librarys librarys;

}
