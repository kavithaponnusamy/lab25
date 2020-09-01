package co.grandcircus.lab25;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class WeatherController {
	
	@Autowired
	private ApiService apiServ;
	@RequestMapping("/")
	public String home() {

		return "redirect:/select";
	}

	@RequestMapping("/select")
	public String showInputForm() {

		return "select-form";
	}
	@RequestMapping("/result-page")
	public String weatherSubmit(@RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude,Model model) {
		Data result=apiServ.checkWeather(latitude,longitude);
		
		String cityName=apiServ.displayNameOfTheCity(latitude,longitude);
		Data temp=apiServ.displayTemperature(latitude, longitude);
		model.addAttribute("result",result);
		model.addAttribute("cityName",cityName);
		model.addAttribute("temp",temp);
		return "result-page";
	}
	

}
