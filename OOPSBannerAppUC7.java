import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC7 {

    public static void main(String[] args) {

        String text = "OOPS";

        Map<Character, String[]> patternMap = CharacterPatternMap.getPatternMap();

        int height = 7;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Character Pattern Class
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

    // Pattern Map Class
    static class CharacterPatternMap {

        public static Map<Character, String[]> getPatternMap() {

            Map<Character, String[]> map = new HashMap<>();

            map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            });

            map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
            });

            map.put('S', new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
            });

            return map;
        }
    }
}