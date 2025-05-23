package com.freecodecamp2.jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder // for the builder design pattern
@SuperBuilder
@Entity
@Table(name="AUTHOR_TBL")
public class Author extends BaseEntity{

    /*
    assigned to the primary key of the table
    */
    //@Id // BASE CLASS
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
    //@GeneratedValue // by default strategy = GenerationType.AUTO // BASE CLASS
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

    @ManyToMany(mappedBy = "authors") // list of the authors
    private List<Course> courses;
}

/*
    relationship between the entity can establish using the @OneToOne,
    @OneToMany, @ManyToOne
    it makes the data consistent and increase the performance of the database
    performance
*/
