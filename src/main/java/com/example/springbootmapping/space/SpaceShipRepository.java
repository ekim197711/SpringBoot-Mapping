package com.example.springbootmapping.space;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpaceShipRepository extends JpaRepository<SpaceShipEntity, Integer> {

    @Query("SELECT S FROM SpaceShipEntity S")
    List<SpaceShipEntity> gimmeAllShips();

    @Query("SELECT new com.example.springbootmapping.space.SpaceShipDto(S.id, S.description, S.fuel, S.captain) " +
            "FROM SpaceShipEntity S")
    List<SpaceShipDto> gimmeAllShipDtos();

    List<SpaceShipEntity> findByFuelLessThan(Integer fuel);

    @Query("select count(s) from SpaceShipEntity s where s.description like concat('%', :description, '%')")
    long totalBlabla(@Param("description") String description);






}
