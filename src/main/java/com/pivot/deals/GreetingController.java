package com.pivot.deals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/test")
    public String test(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        User user = new User(1, "tester");
        user.location = new Location(100.0, 100.0);

        Restaurant restaurant = new Restaurant(1, "Burger King", new Location(50.0, 50.0));

        Double distance = Location.haversine(user.location.getY(), user.location.getX(),
                restaurant.location.getY(), restaurant.location.getX());

        model.addAttribute("name", name);
        model.addAttribute("user", user.getUsername());
        model.addAttribute("restaurant", restaurant.getName());
        model.addAttribute("distance", distance);


        return "test";
    }
}
