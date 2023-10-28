package model;

import java.util.Arrays;

public class Truck {
    private Garbage[] truckList;

    public Truck() {

    }

    public Truck(Garbage[] truckList) {
        this.truckList = truckList;
    }

    public Garbage[] getTruckList() {
        return truckList;
    }

    public void setTruckList(Garbage[] truckList) {
        this.truckList = truckList;
    }

    @Override
    public String toString() {
        return "CollectionTruck [truckList=" + Arrays.toString(truckList) + "]";
    }

}
