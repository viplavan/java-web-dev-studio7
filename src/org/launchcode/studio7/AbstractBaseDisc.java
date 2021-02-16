package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class AbstractBaseDisc implements CDDVDInterface{
    private String name;
    private int capacity;
    private int remainingCapacity;
    private String diskType;
    private int capacityUsed;
    private ArrayList<String> contents;

    public AbstractBaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        name = aName;
        capacity = maxCapacity;
        remainingCapacity = spaceLeft();
        diskType = aType;
        capacityUsed = checkCapacity(someUsedCapacity);
    }

    private int checkCapacity(int dataWritten) {
        if(capacity < dataWritten){
            return capacity;
        }
        return dataWritten;
    }

    private int spaceLeft(){
        return capacity - capacityUsed;
    }
    public String diskInfo(){
        String output = String.format("\nDisk Name: %s\nMax Capacity: %d" +
                "\nSpace Used: %d" +
                "\nAvailable Space: %d\n", name, capacity, capacityUsed, remainingCapacity);
        return output;
    }

    public String writeData(int dataSize){
        if(dataSize > remainingCapacity){
            return "Not enough disc space";
        }

        capacity += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc, Remaining space = " +remainingCapacity;
    }
}
