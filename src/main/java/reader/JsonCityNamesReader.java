package reader;

import cityName.CityName;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class JsonCityNamesReader implements Reader {
    private static final Gson GSON = new Gson();
    Type REVIEW_TYPE = TypeToken.getParameterized(ArrayList.class, CityName.class).getType();
    @Override
    public List<String> read (String path) {

        List<CityName> citiesNames = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        citiesNames = GSON.fromJson(stringBuilder.toString(), REVIEW_TYPE);


        List<String> result = citiesNames.stream()
                .map(CityName::getName)
                .toList();

        return result;
    }
}