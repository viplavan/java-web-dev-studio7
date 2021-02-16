package org.launchcode.studio7;

public class DVD extends AbstractBaseDisc{

    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("Here's the DVD data");
    }
}
