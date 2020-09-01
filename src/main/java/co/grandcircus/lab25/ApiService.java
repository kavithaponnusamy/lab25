package co.grandcircus.lab25;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ApiService {
	
	private RestTemplate rt;
	// initialization block that runs when a new instance of the class is created
	// loaded before the constructor
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Weather");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public Data checkWeather(Double latitude, Double longitude){
		
		//1. specify a URL
		String url="https://forecast.weather.gov/MapClick.php?lat={latitude}&lon={longitude}&FcstType=json";
		
		//2. call the API, response type to match entire JSON
		
		Forecast forecast=rt.getForObject(url, Forecast.class,latitude,longitude);
		
		//return 
		return forecast.getData();
	}
	public String displayNameOfTheCity(Double latitude, Double longitude) {
		String url="https://forecast.weather.gov/MapClick.php?lat={latitude}&lon={longitude}&FcstType=json";
		Forecast forecast=rt.getForObject(url, Forecast.class,latitude,longitude);
		return forecast.getProductionCenter();
	}
	public Data displayTemperature(Double latitude, Double longitude) {
		String url="https://forecast.weather.gov/MapClick.php?lat={latitude}&lon={longitude}&FcstType=json";
		Forecast forecast=rt.getForObject(url, Forecast.class,latitude,longitude);
		return forecast.getData();
	}

	
	

}
