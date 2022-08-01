package day37_Inheritance.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", "Black", 1000);

        Samsung samsung = new Samsung("galaxy s19", "6 inches", "White", 500);

        Nokia nokia = new Nokia("Brick", "4 inches", "Gray", 50);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(600296046);
        iphone.faceTime(075016443);
        iphone.faceTime("m.muazyagci@gmail.com");
        System.out.println("--------------------------");
        samsung.freeze();
        samsung.call(600296046);
        samsung.text(911);
        System.out.println("------------------------");
        nokia.selfDefence();
        nokia.call(600296046);
        nokia.text(622835210);
        System.out.println("-------------------------");
        System.out.println(Iphone.hasBattery);

        System.out.println(Samsung.hasBattery);

        System.out.println(Nokia.hasBattery);



    }
}
