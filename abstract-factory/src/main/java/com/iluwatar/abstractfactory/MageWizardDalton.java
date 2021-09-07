package com.iluwatar.abstractfactory;

public class MageWizardDalton implements Wizard {
    static final String DESCRIPTION = "Contemplem o Mago Dalton";

    @Override
    public String getDescription() {
      return DESCRIPTION;
    }

}