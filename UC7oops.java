import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Pattern Map
    static Map<Character, CharacterPattern> characterPatternMap = new HashMap<>();

    // Initialize patterns
    static {
        characterPatternMap.put('O', new CharacterPattern('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        }));

        characterPatternMap.put('P', new CharacterPattern('P', new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        }));

        characterPatternMap.put('S', new CharacterPattern('S', new String[]{
                " *****  ",
                "*     * ",
                "*       ",
                " *****  ",
                "      * ",
                "*     * ",
                " *****  "
        }));
    }

    public static void main(String[] args) {

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = characterPatternMap.get(ch);
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}