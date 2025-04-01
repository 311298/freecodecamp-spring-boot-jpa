package com.freecodecamp2.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name="AUTHOR_TBL")
public class Author {

    /*
    assigned to the primary key of the table
    */
    @Id
    /*
    tells to generate the automated value for the primary key
    optional value are generation type and generator function
    generation types are : AUTO, SEQUENCE, TABLE, UUID, IDENTITY
    */
    /*
    below is the example for the sequence type for strategy
    generator value inside the @GeneratedValue and name value inside
    @SequenceGenerator must be same, and same goes for another generator
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )
    @SequenceGenerator(
            name="author_sequence", // name of the sequence generator
            sequenceName = "author_sequence", // name of the database sequence
            allocationSize = 1 // increment value, by default 50
    )*/
    /* below is the example for the  table type for strategy */
    /*
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "author_id_gen"
    )
    @TableGenerator(
            name = "author_id_gen", // must remain same as generator value
            table = "id_generator", // table name for generator
            pkColumnName = "id_name", // column name for generator table ( holds key ) --> author
            valueColumnName = "id_value", // column name for generator table (holds value ) --> 0,1,2,3,...
            allocationSize = 1 // increment value, by default 50
    )
    */
    @GeneratedValue // by default strategy = GenerationType.AUTO
    private Integer id; // always Reference type because default value is null not 0

    @Column(
            name="f_name",
            length = 35
    )
    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private int age;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    @Column(
            insertable = false
    )
    private LocalDateTime lastModified;
}
