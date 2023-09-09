package searching.controller;

import javax.swing.text.html.parser.Element;

import searching.common.*;
import searching.common.Library;

public class Programming extends Menu<String> {
    static String [] mChon = {"Searching", "Exit"};

    protected Library l;
    protected Algorithm algorithm;
    protected int [] arr;
    protected int sizeArray;
    public Programming(Element element){
        super("PROGRAMMING", mChon);
        l = new Library();
        algorithm = new Algorithm();
        arr = 
    }
}
