package com.peace.CrudOperation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {


       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       @Column(name = "id",updatable = false)
       private Long id ;

       @Column(name = "name",columnDefinition = "varchar(20)")
       private String name  ;

       @Column(name = "surname",columnDefinition = "varchar(25)")
       private String surName ;


}
