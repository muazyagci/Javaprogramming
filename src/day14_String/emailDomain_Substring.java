package day14_String;

public class emailDomain_Substring {
    public static void main(String[] args) {
        String mail = "Cydeo.School@gmail.com";
        /*String domain=mail.substring(mail.indexOf("@")+1,mail.lastIndexOf("."));
        System.out.println("domain = " + domain);

         */
        int beginningindex = mail.indexOf("@");
        int endingindex = mail.lastIndexOf(".");
        String domain = mail.substring(beginningindex, endingindex);
        System.out.println(domain);

        System.out.println("------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0, 11);
        System.out.println(s1);

        String s2 = str1.substring(str1.indexOf(" J") + 1, str1.lastIndexOf(","));

        System.out.println(s2);

        String s3 = str1.substring(str1.indexOf("I"));
        System.out.println(s3);

    }
}
