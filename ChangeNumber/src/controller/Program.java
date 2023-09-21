package ChangeNumber.src.controller;

import ChangeNumber.src.common.Algorithm;
import ChangeNumber.src.view.Menu;
import ChangeNumber.src.model.Number;

public class Program extends Menu<Number> {
    protected Algorithm alg;

    public Program(String td, String[] mc) {
        super(td, mc);
        alg = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                alg.inputBase();
                break;
            case 2:
                System.exit(0);
        }
    }

}
