package com.example.springbootmapping.space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpaceShipEntityRepositoryTest {

    @Autowired
    SpaceShipRepository repository;

    @Test
    void shipsLessThan(){
        List<SpaceShipEntity> byFuelLessThan = repository.findByFuelLessThan(50);
        Assertions.assertEquals(2, byFuelLessThan.size());
        byFuelLessThan.forEach(System.out::println);
    }

    @Test
    void counttest(){
        long yellow = repository.totalBlabla("Yellow");
        Assertions.assertEquals(1, yellow);
    }



    @Test
    void gimmeAllShips() {
        List<SpaceShipEntity> spaceShipEntities = repository.gimmeAllShips();
        Assertions.assertTrue(spaceShipEntities.size() > 0);
    }

    @Test
    void gimmeAllShipDtos() {
        List<SpaceShipDto> spaceShipDto = repository.gimmeAllShipDtos();
        Assertions.assertNotNull(spaceShipDto);
        Assertions.assertTrue(spaceShipDto.size() > 0);
        spaceShipDto.forEach(System.out::println);
    }
}