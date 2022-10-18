package com.example.springbootmapping.space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpaceShipRepositoryTest {

    @Autowired
    SpaceShipRepository repository;




    @Test
    void gimmeAllShips() {
        List<SpaceShip> spaceShips = repository.gimmeAllShips();
        Assertions.assertTrue(spaceShips.size() > 0);
    }

    @Test
    void gimmeAllShipDtos() {
        List<SpaceShipDto> spaceShipDto = repository.gimmeAllShipDtos();
        Assertions.assertNotNull(spaceShipDto);
        Assertions.assertTrue(spaceShipDto.size() > 0);
        spaceShipDto.forEach(System.out::println);
    }
}