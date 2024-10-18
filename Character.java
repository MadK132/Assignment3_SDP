public class Character {
    private char value;   // Intrinsic state
    private String font;
    private int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void render(int x, int y) {   // Extrinsic state: position
        System.out.println("Rendering '" + value + "' at (" + x + ", " + y + ") in font " + font + " of size " + size);
    }
}
