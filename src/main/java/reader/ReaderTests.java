package reader;

import cityName.CityName;

import java.util.List;

public class ReaderTests {

    private static final String JSON_PATH = "d:\\Java\\IDEProjects\\TeamProject\\src\\main\\resources\\city.json";

    public static void main(String[] args) {

        Reader reader = new JsonCityNamesReader();

        List<String> CitiesNames = reader.read(JSON_PATH);

        for (String citiesName : CitiesNames) {
            System.out.println(citiesName);
        }

    }
}
