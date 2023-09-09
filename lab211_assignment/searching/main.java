package lab211_assignment.searching;

import lab211_assignment.searching.model.Element;

import lab211_assignment.searching.common.Library;
import lab211_assignment.searching.controller.SearchingProgram;

public class main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();

        element.setSizeArray(library.getInt("Enter number of array:", 1, 100));
        element.setArray(library.createArray(element.getSizeArray()));
        new SearchingProgram(element).run();
    }
}
