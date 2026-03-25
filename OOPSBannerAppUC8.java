import java.util.HashMap;

public class OOPSBannerAppUC8 {

    // Function to render banner
    public static void renderBanner(String word, HashMap<Character, String[]> map) {

        int height = 5; // each character has 5 rows

        for (int i = 0; i < height; i++) {
            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                } else {
                    System.out.print("????? ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for O
        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for P
        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for S
        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Step 2: Call render function
        String word = "OOPS";
        renderBanner(word, charMap);
    }
}