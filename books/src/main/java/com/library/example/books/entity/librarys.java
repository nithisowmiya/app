package com.library.example.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "librarys")
public class librarys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int librarysId;
    @Column(name = "name")
    private String librarysName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "librarys_id")
    private List<book1> book1;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "librarys_id")
    private List<book2>book2;
}
