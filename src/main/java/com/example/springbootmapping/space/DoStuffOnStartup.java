package com.example.springbootmapping.space;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class DoStuffOnStartup {
    private final SpaceShipRepository repository;

    @PostConstruct
    void beforeCreateShips(){
        repository.save(
                SpaceShipEntity.builder()
                        .captain("Mike")
                        .fuel(99)
                        .description("Pyramid Yellow").
                        build()
        );
        repository.save(
                SpaceShipEntity.builder()
                        .captain("susan")
                        .fuel(59)
                        .description("Box Blue").
                        build()
        );


        repository.save(
                SpaceShipEntity.builder()
                        .captain("Line")
                        .fuel(25)
                        .description("Round Black").
                        build()
        );
        repository.save(
                SpaceShipEntity.builder()
                        .captain("Henrik")
                        .fuel(17)
                        .description("Cool Green").
                        build()
        );
    }
}
