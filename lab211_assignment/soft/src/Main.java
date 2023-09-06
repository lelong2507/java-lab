import common.Library;
import controller.SoftProgramming;
import model.Element;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSizeArray(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArr(library.createArray(element.getSizeArray()));
        new SoftProgramming(element).run();
    }
}
