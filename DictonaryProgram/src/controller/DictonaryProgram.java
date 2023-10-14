package controller;

import java.util.HashMap;

import model.Dictonary;
import view.Menu;
import view.Validation;

public class DictonaryProgram extends Menu<Dictonary> {
    private Dictonary dic;
    private DictonaryManagement dm;
    private Validation val;

    public DictonaryProgram(String td, String[] mc) {
        super(td, mc);
        dic = new Dictonary();
        dm = new DictonaryManagement();
        val = new Validation();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                transale();
                break;
            case 4:
                System.exit(0);
        }
    }

    public void add() {
        String enWord = val.inputWord();
        String vnWord = val.inputWord();
        dic = new Dictonary(enWord, vnWord);
        dm.addList(enWord, vnWord);
    }

    public void delete() {
        String enWord = val.inputWord();
        dm.deleEle(enWord);
        System.out.println("Delete Success!");
    }

    public void transale() {
        String enWord = val.inputWord();
        dm.transaletEle(enWord);
    }

}
