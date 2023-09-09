package lab211_assignment.soft;

import lab211_assignment.soft.common.Library;
import lab211_assignment.soft.controller.Programming;
import lab211_assignment.soft.model.Element;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.getSize_array()));
        new Programming(element).run();
    }
}
