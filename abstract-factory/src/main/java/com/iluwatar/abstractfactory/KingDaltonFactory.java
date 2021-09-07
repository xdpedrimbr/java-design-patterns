package com.iluwatar.abstractfactory;

public class KingDaltonFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new CastleDalton();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new KingDalton();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new ArmyDalton();
	}

	@Override
	public Wizard createWizard() {
		// TODO Auto-generated method stub
		return new MageWizardDalton();
	}


}