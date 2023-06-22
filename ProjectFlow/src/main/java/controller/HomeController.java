package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	@GetMapping("/home")
	public static String showHomePage(@RequestParam(defaultValue="world") String name) {
		return "Helloooooooo, " + name + "!";
		
	}

}
