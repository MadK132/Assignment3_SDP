import java.util.HashMap;
import java.util.Map;

public class TextEditor {
    private CharacterFactory characterFactory;
    private Map<Integer, Character> document = new HashMap<>();

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public void insertCharacter(int position, char value, String font, int size) {
        Character character = characterFactory.getCharacter(value, font, size);
        document.put(position, character);
    }

    public void renderDocument() {
        for (Map.Entry<Integer, Character> entry : document.entrySet()) {
            entry.getValue().render(entry.getKey(), entry.getKey());
        }
    }
}
