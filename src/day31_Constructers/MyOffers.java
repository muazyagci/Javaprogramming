package day31_Constructers;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();

//constructor is also a method

        offer1.setInfo("Spain", "Seat", "QA Tester", 65420.87, true, true, false, true);
        offer2.setInfo("France", "Citroen", "QA Tester", 60420.87, true, false, true, false);
        offer3.setInfo("Spain", "MSI", "QA Tester", 80420.87, true, false, false, true);
        offer4.setInfo("Spain", "Lenovo", "QA Tester", 70420.87, true, true, true, false);
        offer5.setInfo("Spain", "Sabadell", "QA Tester", 50420.87, true, true, true, true);

        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer4 = " + offer4);
        System.out.println("offer5 = " + offer5);
        System.out.println();
        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p -> !p.isFullTime);//removes if the offer is not full time
        System.out.println(fullTimeOffers);
        System.out.println();
        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !(p.location.equals("Spain") || !p.location.equals("Turkey")));
        System.out.println(localOffers);
        System.out.println();
        ArrayList<Offer> withBenefitsOffers = new ArrayList<>(Arrays.asList(myOffers));
        withBenefitsOffers.removeIf(p -> p.hasBenefit == false);
        System.out.println(withBenefitsOffers);
        System.out.println("\n\n");

        System.out.println("Local Offers Details\n");
        System.out.println("Number of local offers " + localOffers.size()+"\n");
        for (Offer each : localOffers) {
            System.out.println(each.companyName + " : " + each.salary);
        }



    }
}
