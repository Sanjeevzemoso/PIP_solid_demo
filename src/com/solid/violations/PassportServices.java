package com.solid.violations;

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

    public void verification(){
        System.out.println("welcome to verfication services ");
        System.out.println("your services will be  through phone and Physical police check");
        System.out.println("\n");
    }

    public  void payment( ){
        System.out.println("Please select mode of payment.....");
        System.out.println(" 1.Credit card  2.Debit Card ");
        System.out.println("\n");
    }

}
