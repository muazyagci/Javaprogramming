package day51_map;

public class TestEnum {
    public static void main(String[] args) {

       // String browser="Wooden Spoon";
        Browsers browsers=Browsers.SAFARI;
        switch (browsers){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;
            case EDGE:
                System.out.println("Edge is selected");
                break;
            case OPERA:
                System.out.println("Opera is selected");
                break;
            case CHROME:
                System.out.println("Chrome is selected");
        break;
            case SAFARI:
                System.out.println("Safari is selected");
        break;
            default:

        }
        System.out.println("-------------------------");

        Seasons seasons=Seasons.WINTER;





    }
}
