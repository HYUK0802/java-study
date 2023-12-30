public class Star {
    public static void main(String[] args) {
        System.out.println("1번");
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("2번");

        for (int i = 0; i < 5; i++) {
            System.out.println("*");
        }
        System.out.println("3번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("4번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println("5번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println("6번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i+j+1);
            }
            System.out.println();
        }
        System.out.println("7번");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j < 10; j++) {
                System.out.print(j-i);
            }
            System.out.println();
        }
        System.out.println("8번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("9번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("10번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("11번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
