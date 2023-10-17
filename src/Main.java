public class Main {
    public static void main(String[] args) {
        int number1 = 20;
        float number2 = 3.14f;
        String text = "heads";
        final String name = "Vlad";
        System.out.println(name + ", at the age of 20, finally realized that two heads are better than one");

        double someNumber1 = 3.14f;
        double someNumber2 = 905.6f;
        double result = someNumber1 + someNumber2;
        System.out.println("The result of the addition operation: " + result);
        result = someNumber1 - someNumber2;
        System.out.println("The result of the subtraction operation: " + result);
        result = someNumber1 * someNumber2;
        System.out.println("The result of the multiplication operation: " + result);
        result = someNumber2 / someNumber1;
        System.out.println("The result of the division operation: " + result);

        boolean check;
        int myNumber1 = 15;
        int myNumber2 = 20;
        if (myNumber1 == myNumber2) {
            check = true;
        } else {
            check = false;
        }

        if (myNumber1 > 20 || myNumber1 < 10) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        for (int i = 0; i < 11; i++) {
            switch (i) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    System.out.println("Unknown number");
            }
        }
        String txt = "I listened carefully and asked";
        String empty = "";
        if (!txt.equals(empty)) {
            System.out.println("\nI am a programmer");
        } else {
            System.out.println("I am still a programmer");
        }
    }
}
