package com.example.springbootmapping.space;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpaceShipRepository extends JpaRepository<SpaceShip, Integer> {

    @Query("SELECT S FROM SpaceShip S")
    List<SpaceShip> gimmeAllShips();

    @Query("SELECT new com.example.springbootmapping.space.SpaceShipDto(S.id, S.description, S.fuel, S.captain) " +
            "FROM SpaceShip S WHERE S.id = 1")
    SpaceShipDto gimmeOneShipDto();

    @Query("SELECT new com.example.springbootmapping.space.SpaceShipDto(S.id, S.description, S.fuel, S.captain) " +
            "FROM SpaceShip S")
    List<SpaceShipDto> gimmeAllShipDtos();



}
