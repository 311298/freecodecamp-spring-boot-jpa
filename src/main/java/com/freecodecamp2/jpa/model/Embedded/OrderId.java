package com.freecodecamp2.jpa.model.Embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable // annotation need to make it embeddable
public class OrderId implements Serializable {

    private String userName; // assuming the userName is unique

    private LocalDateTime orderDate;

}
