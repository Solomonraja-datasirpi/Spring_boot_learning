package com.example.namingconvention.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")

public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        //variables should start with a lowercase letter
        //start it with the lowercase letter followed by an uppercase letter such as firstName, lastName.
        private long id;
        @Column(name= "name")
        private String name;
        @Column(name = "email_id")
        private String emailId;
    }
