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

public class JsonCityNamesReader implements Reader {
    private static final Gson GSON = new Gson();
    Type REVIEW_TYPE = TypeToken.getParameterized(ArrayList.class, CityName.class).getType();

    @Override
    public List<String> read (String path) {

        List<CityName> result = new ArrayList<>();
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

        System.out.println(stringBuilder.toString());
        result = GSON.fromJson(stringBuilder.toString(), REVIEW_TYPE);

/*        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            JsonReader jsonReader = new JsonReader(new FileReader(path));
            System.out.println(jsonReader.toString());
            result = GSON.fromJson(reader, REVIEW_TYPE);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
        } catch (IOException e) {
            System.out.println("Файл не знайдено");
        }
*/

        for (CityName cityName : result) {
            System.out.println(cityName);
        }

        //TODO
        //1. Доделать класс CityNames
        //2. Стримом фильтрануть колекцию result
        //3.

        return null;
    }
}
