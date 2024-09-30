public class CarPattern {
    public static void main(String[] args) {
        int carWidth = 10;
        int carHeight = 4;

        for (int i = 1; i <= carHeight; i++) {
            for (int j = 1; j <= carWidth; j++) {
                if (i == 1 && (j == 4 || j == 7)) {
                    System.out.print("|");
                } else if (i == 2 && (j == 2 || j == 9)) {
                    System.out.print("|");
                } else if (i == 3 && j >= 2 && j <= 9) {
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= carWidth; j++) {
                if (i == 2 && j == 6) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
