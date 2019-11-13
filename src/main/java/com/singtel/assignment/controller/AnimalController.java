package com.singtel.assignment.controller;


import com.singtel.assignment.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping("/animal/{behaviour}")
    public List<String> getAnimals(@PathVariable String behaviour) {
        System.out.println(behaviour);
        return animalService.getAnimals(behaviour)
                .map(c -> c.getClass().getName())
                .map(c -> c.substring(c.lastIndexOf('.') + 1))
                .collect(Collectors.toList());
    }
}
