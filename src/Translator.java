import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<Integer, String> numericAlpha = new HashMap<>();

    Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < numericAlpha.size(); i++){
            numericAlpha.put(10,"tien");
        }
    }
}
