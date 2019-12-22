package bm.app.controllers;

import bm.app.model.Food;
import bm.app.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoodController {

    @Autowired
    FoodRepository foodRepository;



    @RequestMapping("/landingpage")
    public String landingPage(){
        return "landingpage";
    }

    @RequestMapping(value = "added", method = RequestMethod.GET)
    public String addedPage(){
        return "added";
    }

    @RequestMapping(value = "/landingpage", method = RequestMethod.POST)
    public String dataSubmit(@RequestParam() String kindOfFoodParameter,
                             @RequestParam() String nameOfFoodParameter,
                             @RequestParam() int amountParameter,
                             @RequestParam() String ifHealthyParameter,
                             Model model){

        Food newFood = new Food(kindOfFoodParameter, nameOfFoodParameter, amountParameter, ifHealthyParameter);
        newFood.setKindOfFood(kindOfFoodParameter);
        newFood.setNameOfFood(nameOfFoodParameter);
        newFood.setAmount(amountParameter);
        newFood.setIfHealthy(ifHealthyParameter);
        foodRepository.addNewFood(newFood);
        model.addAttribute("kindResult", kindOfFoodParameter);
        model.addAttribute("nameResult", nameOfFoodParameter);
        model.addAttribute("amountResult", amountParameter);
        model.addAttribute("ifHealthyResult", ifHealthyParameter);
        return "added";


    }




}


