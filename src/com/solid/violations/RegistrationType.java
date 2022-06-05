package com.solid.violations;


class RegistrationType {
    public void registerforNRI(String medium) {
        if (medium.equals("Normal")) {
            System.out.println("Registering for NRI adult age above 15");
            System.out.println("Need to pay Charges");
            System.out.println("The passport is valid for 20 years ");
            System.out.println("You can regester through portal");
            System.out.println("\n");
        }
        if(medium.equals("Child")){
            System.out.println("Registering for NRI child age below 15");
            System.out.println("The passport is valid for 8 years ");
            System.out.println("You can register through portal");
            System.out.println("\n");
        }
        if(medium.equals("Senior citizen")) {
            System.out.print("Please visit this link for help : ");
            System.out.println("https://www.bankbazaar.com/passport/passport-for-senior-citizen.html");
            System.out.println("\n");
        }


    }

    public void registerForNonNRI(String medium){
        if (medium.equals("Normal")) {
            System.out.println("Registering for adult age above 15");
            System.out.println("The passport is valid for 20 years ");
            System.out.println("You can register here");
            System.out.println("https://passport.gov.in/nri/Online.do");
            System.out.println("\n");
        }
        if(medium.equals("Child")){
            System.out.println("Registering for child age below 15");
            System.out.println("The passport is valid for 8 years ");
            System.out.println("You can register through portal");
            System.out.println("\n");
        }

        if(medium.equals("Senior citizen")){
            System.out.print("Please visit this link for help : ");
            System.out.println("https://www.bankbazaar.com/passport/passport-for-senior-citizen.html");
            System.out.println("\n");
        }

    }


}


