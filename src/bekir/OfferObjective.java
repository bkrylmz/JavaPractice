package bekir;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjective {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setInfo("virginia", "amazon",
                "sdet", 110000, true,true, true, true );

       Offer offer2= new Offer();
       offer2.setInfo("Ca", "Sony","Qa", 25000, true, false, true,true);

       Offer offer3 = new Offer();
       offer3.setInfo("NewYork", "Samsung", "Dev", 120000,false,true, false, false);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);

        Offer[] myOffer = {offer1,offer2,offer3};
        System.out.println(Arrays.toString(myOffer));

        System.out.println("---------");

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffer));
        System.out.println(fullTimeOffers);

        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println("----");
        System.out.println(fullTimeOffers.size());


    }
}
