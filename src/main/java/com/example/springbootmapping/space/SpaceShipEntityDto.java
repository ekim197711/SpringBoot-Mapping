package com.example.springbootmapping.space;

import java.io.Serializable;

/**
 * A DTO for the {@link SpaceShipEntity} entity
 */
public record SpaceShipEntityDto(String description, String captain) implements Serializable {
}