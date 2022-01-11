package com.hismission.bean;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
@NoArgsConstructor
public class Parishnor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyyy")
    private Date dob;

    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyyy")
    private Date baptismDate;

    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyyy")
    private Date dod;

    @Column
    private String mobile;

    @Column
    private String adhar;

    @ManyToOne
    @JoinColumn(name = "parish_id", nullable = false)
    private Parish parish;

    @Column
    private boolean isActive;
}
