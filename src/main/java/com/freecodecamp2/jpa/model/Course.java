package com.freecodecamp2.jpa.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntity{

    private String name;

    private String description;

    @ManyToMany
    @JoinTable(
            name="authors_courses",
            joinColumns = {
                    @JoinColumn(name="course_id") // holds the information of primary key of owner
            },
            inverseJoinColumns = {
                    @JoinColumn(name="author_id") // holds the information of primary key of dependent entity class
            }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
/*
    here we consider the owner as the parent of the relationship between
    author and course therefore mappedby will be applied on the author class
*/