package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("CD", 700, "CD-R", 350);
        cd.spinDisc();
        cd.readDisc();
        DVD dvd = new DVD("DVD", 4700,"DVD-R",1450);
        dvd.spinDisc();
        dvd.readDisc();
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(cd.writeData(325));
        System.out.println(dvd.writeData(5006));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());
    }
}
