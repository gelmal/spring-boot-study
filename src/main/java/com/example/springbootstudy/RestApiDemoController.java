package com.example.springbootstudy;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class RestApiDemoController {
    private final List<Coffee> coffees = new ArrayList<>();

    public RestApiDemoController() {
        coffees.addAll(List.of(
                new Coffee("Cafe cerez"),
                new Coffee("Cafe Ganador"),
                new Coffee("Cafe Lareno"),
                new Coffee("Cafe Tres Pontas")
        ));
    }

    @RequestMapping(value = "/coffees", method = RequestMethod.GET)
    Iterable<Coffee> getCoffees() {
        return coffees;
    }

    @GetMapping("/coffes/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id) {
        for(Coffee c: coffees) {
            if(c.getId().equals(id)) {
                return Optional.of(c); // Optional is not surely null, if it is null occur error
            }
        }

        return Optional.empty(); // Optional.empty;
    }

}
