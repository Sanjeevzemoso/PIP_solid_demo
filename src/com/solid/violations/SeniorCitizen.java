package com.solid.violations;

public class SeniorCitizen extends FormRegistartion {
    @Override
    public void submitAadharProof(String aadharNumber) {
        System.out.println("Aadhar proof is submitted"+aadharNumber);
    }

    @Override
    public void submitDOBProof(int age) {
        System.out.println("age is "+age);
    }

    @Override
    public void submitPensionProof() {
        System.out.println("pension proof recieved");
    }

    @Override
    public void submitForeignResidenceProof(long socialSecurityNumber) {
        System.out.println("social security principle recieved "+socialSecurityNumber);
    }
}
