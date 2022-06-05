package com.solid.principles;

public class General implements RegistrationService {

    private String user;

    public General( String username ) {
        this.user = username;
    }
    @Override
    public String registerForNRI() {

        System.out.println("Hiii user "+user);
        System.out.println("Registering for NRI adult age above 15");
        System.out.println("Need to pay Charges");
        System.out.println("The passport is valid for 20 years ");
        System.out.println("You can regester through portal");
        System.out.println("\n");
        return "Nri";
    }

    @Override
    public String registerForNonNRI() {

        System.out.println("Registering for adult age above 15");
        System.out.println("The passport is valid for 20 years ");
        System.out.println("You can register here");
        System.out.println("https://passport.gov.in/nri/Online.do");
        System.out.println("\n");
        return "NonNri";

    }
}
