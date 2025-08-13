package org.example;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
public class Person {
    private String name;
    private double height;
    private double weight;
}
