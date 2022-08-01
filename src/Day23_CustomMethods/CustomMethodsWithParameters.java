package Day23_CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(10);
        System.out.println("------------------");
        ageOfPerson(1974);
        System.out.println("------------------");
        task(1, 9);

    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("Your age is: " + age);
    }

    public static void task(int X, int Y) {
        for (int i = X; i <= Y; i++) {
            System.out.print(i+" ");
        }
    }

}
