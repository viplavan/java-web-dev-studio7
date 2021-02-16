package org.launchcode.studio7;

public class CD extends AbstractBaseDisc{


    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 250 - 500 rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("Here is the CD data");
    }
}
