package bm.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {


    @RequestMapping("/landingpage")
    public String landingPage(){
        return "landingpage";
    }
}
