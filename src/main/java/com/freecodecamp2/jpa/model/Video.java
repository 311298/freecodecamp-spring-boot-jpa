package com.freecodecamp2.jpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
//@DiscriminatorValue("V")
//@PrimaryKeyJoinColumn(name="video_id")
@Polymorphism(type = PolymorphismType.EXPLICIT)
/*
    when we query the Resource class then we make queries for all the child classes
    in case for TABLE_PER_CLASS strategy
    in order to avoid it -> we use the @Polymorphism type = PolymorphismType.EXPLICIT
*/
public class Video extends Resource{
    private int length;
}
