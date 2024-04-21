import com.learnwebservices.services.tempconverter.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        TempConverterEndpointService svc = new TempConverterEndpointService();
        TempConverterEndpoint port = svc.getTempConverterEndpointPort();
        CelsiusToFahrenheitRequest req = new CelsiusToFahrenheitRequest();
        System.out.println("Enter temperature in Celsius");
        Scanner sc = new Scanner(System.in);
        int cels = sc.nextInt();
        req.setTemperatureInCelsius(cels);
        CelsiusToFahrenheitResponse res = port.celsiusToFahrenheit(req);
        System.out.println("Temperature in Fahrenheit: "+ res.getTemperatureInFahrenheit());
    }
}