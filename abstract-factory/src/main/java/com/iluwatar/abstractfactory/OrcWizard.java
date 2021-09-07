package com.iluwatar.abstractfactory;

public class OrcWizard implements Wizard {
	  static final String DESCRIPTION = "Contemplem Orc Feiticeiro!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

}