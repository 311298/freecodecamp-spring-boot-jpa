package com.freecodecamp2.jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Section {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int sectionOrder;

    @ManyToOne
    @JoinColumn(
            name="course_id"
    )
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
