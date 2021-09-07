package com.iluwatar.abstractfactory;

public class KingDalton implements King {
    static final String DESCRIPTION = "Rei Dalton!";

    @Override
    public String getDescription() {
      return DESCRIPTION;
    }

}