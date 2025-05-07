package com.freecodecamp2.jpa.model.Embedded;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
@Table(name="_order")
public class Order {

    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address address;

    private String OrderInfo;

    private String anotherField; // for example’s sake only
}
