package com.iluwatar.abstractfactory;

public class KingDalton implements King {
    static final String DESCRIPTION = "Rei Legolas!";

    @Override
    public String getDescription() {
      return DESCRIPTION;
    }

}