package model;

public class Dump {
    private Garbage[] garbageList;

    public Dump(Garbage[] garbageList) {
        this.garbageList = garbageList;
    }

    public Dump() {
    }

    public Garbage[] getGarbageList() {
        return garbageList;
    }

    public void setGarbageList(Garbage[] garbageList) {
        this.garbageList = garbageList;
    }

}
