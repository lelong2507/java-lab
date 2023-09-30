package controller;

import java.util.*;

import model.EastAsiaCountry;
import view.Input;
import view.Menu;

public class ManageEastAsiaCountry extends Menu<EastAsiaCountry> {

    Algorithm alg;
    Set<EastAsiaCountry> eacList;
    Input in;

    public ManageEastAsiaCountry(String td, String[] mc) {
        super(td, mc);
        alg = new Algorithm();
        eacList = new TreeSet<>();
        in = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                add();
                break;
            case 2:
                displayAndSort();
                break;
            case 3:
                search();
                break;
            case 4:
                System.exit(0);
        }
    }

    // --------------- Add
    public void add() {
        // String countryCode, String countryName, float totalArea, String countryTerrain
        System.out.print("Country Code: ");
        String countryCode = in.inputString();
        System.out.print("Country Name: ");
        String countryName = in.inputString();
        System.out.print("Total Area: ");
        float totalArea = in.inputFloat();
        System.out.print("Country Country Terrain: ");
        String countryTerrain = in.inputString();
        EastAsiaCountry eastAsiaCountry = new EastAsiaCountry(countryCode,countryName,totalArea,countryTerrain);
        alg.addCountry(eastAsiaCountry);
    }
    
    // --------------- Display and sorted
    public void displayAndSort(){
        alg.display();
    }
    
    // --------------- search
    public void search(){
        System.out.print("Country Name: ");
        String countryName = in.inputString();
        alg.searchCountry(countryName);
    }

}
