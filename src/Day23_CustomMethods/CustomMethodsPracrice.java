package Day23_CustomMethods;

public class CustomMethodsPracrice {
    public static void main(String[] args) {
        HelloWorld5Times();
        System.out.println("------------------------------");

        HelloCydeo5Times();
        System.out.println("--------------------");
        evenNumbers();

    }

    public static void HelloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    public static void HelloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void evenNumbers() {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}

