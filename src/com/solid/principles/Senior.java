package com.solid.principles;

public class Senior implements RegistrationService{



    @Override
    public String registerForNRI() {

        System.out.print("Please visit this link for help : ");
        System.out.println("https://www.bankbazaar.com/passport/passport-for-senior-citizen.html");
        System.out.println("\n");
        return "NRI";



    }

    @Override
    public String registerForNonNRI() {

        System.out.print("Please visit this link for help : ");
        System.out.println("https://www.bankbazaar.com/passport/passport-for-senior-citizen.html");
        return "NonNri";
    }
}
