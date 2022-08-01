package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName="Chrome";
        String result="";

        if (browserName=="Opera"||browserName=="Chrome"||browserName=="Firefox"||browserName=="Safari"||browserName=="Edge"){

if(browserName=="Chrome"){
    result="Chrome browser is selected";
} else if (browserName=="Safari") {
    result="Safari browser is selected";
}else if (browserName=="Firefox") {
    result="Firefox browser is selected";
}else if (browserName=="Opera") {
    result="Opera browser is selected";
}else {
    result="Edge browser is selected";
}


        }else {
            result="Invalid name";
        }
        System.out.println(result);

    }
}
