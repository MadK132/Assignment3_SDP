import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characters = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + font + size;
        if (!characters.containsKey(key)) {
            characters.put(key, new Character(value, font, size));
        }
        return characters.get(key);
    }
}
