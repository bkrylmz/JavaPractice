package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();

        offer1.setInfo("VA","Amazon Inc.", "SDET", 110000, true, true, true, true );


        offer2.setInfo("CA","Sony Inc.", "QA", 120000, true, false, true, true );


        offer3.setInfo("FL","Apple Inc.", "QE", 125000, true, true, true, false );


        offer4.setInfo("TX","CapitalOne", "SM", 115000, false, false, true, true );


        offer5.setInfo("VA","Bank Of America", "BA", 130000, true, true, true, true );


        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
       localOffers.removeIf(p-> !p.location.equals("VA"));
        for (Offer each : localOffers) {
            System.out.println(each.companyName+ " : " +each.salary );
        }
        

        System.out.println(localOffers);

        ArrayList<Offer> offerWithBenefit = new ArrayList<>(Arrays.asList(myOffers));
        offerWithBenefit.removeIf(p-> !p.hasBenefit);

        System.out.println(offerWithBenefit.size());

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET"));

        System.out.println(sdetOffers);

        ArrayList<Offer> offerWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offerWith100K.removeIf(p-> p.salary < 100000);
        System.out.println(offerWith100K);



















    }
}
