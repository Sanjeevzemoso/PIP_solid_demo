package com.solid.violations;

import com.solid.principles.Registration;
import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {


        System.out.println("*********** Single responsibility principle ******************");

        PassportServices passportServices = new PassportServices();
        passportServices.newRegister("ravi","ravi123","Road no 5");
        passportServices.login("sam ", "sam123");
        passportServices.payment();
        passportServices.verification();


        System.out.println("****************** open closed principle *************************");
        RegistrationType registrationType = new RegistrationType();
        registrationType.registerForNonNRI("Senior citizen");
        registrationType.registerforNRI("Child");


        System.out.println("*********************** Liskov substituiton principle ****************/");
            SeniorCitizen seniorCitizen = new SeniorCitizen();
            seniorCitizen.submitAadharProof("ASDFASFH45634323");

        System.out.println("********************* interface segregation principle *************/");
            DigitalUser digitalUser = new DigitalUser();
            digitalUser.postPoliceVerification();
            digitalUser.useMobileVerification(456456464);

        System.out.println("*************************** Dependency inversion principle **************/");
                CreditCard creditCard = new CreditCard();
                ShoppingMall shoppingMall=new ShoppingMall(creditCard);
                shoppingMall.doPurchaseSomething(5000);


    }
}
