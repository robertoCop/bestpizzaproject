package com.bestpizzafacades;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultSeachPizzasFacade implements SearchPizzaFacade {


    @Override
    public List<String> getAllPizzas() {

        List<String> pizzas = new ArrayList<String>();
        pizzas.add("Napolitada");
        pizzas.add("Muzzarela");
        pizzas.add("4 queijos");
        pizzas.add("Palmito");

        return pizzas;
    }
}
