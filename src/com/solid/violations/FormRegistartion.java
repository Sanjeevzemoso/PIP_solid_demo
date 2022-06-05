package com.solid.violations;


abstract class FormRegistartion {

    public abstract void submitAadharProof(String aadharNumber);


    public abstract void submitDOBProof(int age);


    public abstract  void submitPensionProof();


    public abstract  void submitForeignResidenceProof( long socialSecurityNumber );
}


