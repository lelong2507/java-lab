package letterCount.controller;

import lab211_assignment.letterCharacter.view.Menu;
import lab211_assignment.letterCharacter.view.Validation;
import letterCount.common.Algorithm;
import letterCount.model.Data;

public class MyProgram extends Menu<String> {

    protected Algorithm alg;
    protected Validation val;
    protected Data dt;
    public MyProgram(String title, String[] mc) {
        super(title, mc);
        alg = new Algorithm();
        val = new Validation();
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                countChar();
                break;
            case 2:
            System.exit(0);
        }
    }

    public void countChar(){
        String input = val.isValidInput();
        Data dt = new Data(input);
        alg.countString(input);
        alg.countCharDuplicate(input);
    }
}
