package com.solid.principles;

public class Indian implements IndianFormsManager{

    private String type;

    public Indian(String type){
        this.type=type;
    }

    @Override
    public boolean submitAadharProof(String aadharNumber) {
        System.out.println(aadharNumber.length());
        if(aadharNumber.length() > 10 ) {
            System.out.println( "submitted aadhar with number ********" + aadharNumber.substring(aadharNumber.length()-4));
        }
        return true;
    }

    @Override
    public boolean submitDOBProof(int age) {
        if(age > 18 ) {
            System.out.println("Registered dob age :"+age);
            System.out.println("Please also submit pan card copy at the office");
        }
        else
        {
            System.out.println("Registered dob");
        }
        return true;
    }
}
