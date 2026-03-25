public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", "OOPS BANNER", " ", " ", "*"),
            String.join("", "*", " ", "LEARNING BY DOING", " ", "*"),
            String.join("", "*", " ", "UC5 IMPLEMENTATION", " ", "*"),
            String.join("", "*", " ", "USING STRING.JOIN", " ", "*"),
            String.join("", "*", " ", "JAVA CONCEPT", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}