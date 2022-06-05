package com.solid.principles;

public class PassportServices {

    private String uname;
    private String pass;
    private String add;

    public String newRegister( String username , String password , String address ) {
        this.uname = username;
        this.pass =  password;
        this.add =   address;
        System.out.println("Username : "+ username + " Password : " + password +" Address : " + address);
        System.out.println("\n");
        return uname;

    }

    public void login(String username , String password ) {
        int sum = 0 ;
        if (username.equals("sam")) {
            sum = sum+1;
        }
        if (password.equals("sam123")) {
            sum = sum + 1 ;
        }
        if( sum == 2 ){
            System.out.println("loggedin");
            sum = 0;
        }
        System.out.println("\n");
    }










    public static void main(String[] args) {
        System.out.println("*********singe resposibility principle ***********");
        System.out.println("\n\n\n");

        System.out.println("**** - violation----*****");


        PassportServices passportServices = new PassportServices();
        String userName = passportServices.newRegister("sam","sam123","Road no 2");
        passportServices.login("sam","sam123");

        Payment payment = new Payment();
        payment.payment();
        System.out.println("\n\n\n");

        System.out.println("*********** open  close principle ***************");
        System.out.println("\n\n\n");

        General ravi = new General(userName);
        String type = ravi.registerForNonNRI();
        System.out.println("\n\n\n");


        System.out.println("********************* Liskov substituion *****************");
        System.out.println("\n\n\n");

        Indian indian = new Indian(type);
        Boolean value1 = indian.submitAadharProof("ABD34564636FDHDD");
        Boolean value2 = indian.submitDOBProof(23);
        System.out.println("\n\n\n");

        if( value1 && value2 ){

            System.out.println("*****************  Interface segregation principle *************************");
            System.out.println("\n\n\n");

                DigitalUser raviVerify = new DigitalUser();
                raviVerify.useMobileVerification(770285);
                System.out.println("\n\n\n");

                System.out.println("****************** Dependency inversion principle **********************");
                System.out.println("\n\n\n");

                    BankCard bankCard=  new CreditCardClass();
                    ShoppingMallClass shoppingMallVar=new ShoppingMallClass(bankCard);
                    shoppingMallVar.doPurchaseSomething(5000);
                    System.out.println("\n\n\n");

        }
        else {
            System.out.println("Please give correct details");
        }


    }
}
