package com.hismission.bean;


import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Date dob;

    @Column
    private String mobile;

    @ManyToOne
    @JoinColumn(name = "parish_id", nullable = false)
    private Parish parish;

    @Column
    private boolean isActive;
}
