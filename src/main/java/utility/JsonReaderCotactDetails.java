package utility;

import base.BaseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Set;

public class JsonReaderCotactDetails extends BaseClass {

    @DataProvider
    public static Object[] contactDetails() {
        String filePath = "src/main/java/testdata/contactdetails.json";
        JSONObject jsonObject = null;
        JSONParser jsonParser = new JSONParser();
        try {
            jsonObject = (JSONObject) jsonParser.parse(new FileReader(filePath));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Object[] data = new Object[1];
        HashMap<String, String> hashMap = new HashMap<>();
        if (jsonObject == null) {
            throw new RuntimeException();
        }
        Set<String> jsonObjKeys = jsonObject.keySet();
        for (String jsonObjKey : jsonObjKeys) {
            hashMap.put(jsonObjKey, (String) jsonObject.get(jsonObjKey));
        }

        data[0] = hashMap;

        return data;
    }
}