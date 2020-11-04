package com.aprecii.bestpizza.controller;


import com.bestpizzafacades.SearchPizzaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
@SpringBootApplication(scanBasePackages = "com.bestpizzafacades")
public class TypePizzasController {

    @Autowired
    private SearchPizzaFacade searchPizzaFacade;


    @GetMapping(value = "/all")
    public String getPizzas(final Model model){

        try {

            List<String> allPizzas =  searchPizzaFacade.getAllPizzas();;

            model.addAttribute("pizzas", allPizzas);

            System.out.println("Entrei no processo!!!! \n");

            allPizzas.forEach(pizza -> {
                System.out.println("Sabor = " + pizza + "\n");
            });

            return "pizzas";

        }catch (Exception e){
            System.out.println("Erro na busca das informações. MSG : "+ e.getMessage());
        }

        return "pizzas";
    }

}
