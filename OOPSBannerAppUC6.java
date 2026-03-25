public class OOPSBannerAppUC6 {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Combine and print line by line
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }

    // Letter O
    public static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Letter P
    public static String[] getP() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Letter S
    public static String[] getS() {
        return new String[]{
            " ***** ",
            "*     ",
            "*     ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}