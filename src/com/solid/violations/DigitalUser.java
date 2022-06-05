package com.solid.violations;

public class DigitalUser implements Verification {
    @Override
    public void useMobileVerification(int mobileNumber) {
        System.out.println("Digital user can use this method");
    }

    @Override
    public void postPoliceVerification() {
        System.out.println("Digital user cannot use this method");
    }

    @Override
    public void useLocalPSVerification(String Address) {
        System.out.println("Digital user cannot use this method");
    }
}
