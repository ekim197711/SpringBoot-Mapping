package com.example.springbootmapping.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShipDto {
    private Integer id;
    private String description;
    private Integer fuel;
    private String captain;
}
