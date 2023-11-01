package controller;

import model.repository.ConfigRepository;
import model.service.IConfig;
import view.Menu;

public class Program extends Menu {

    static String[] mc = { "Read File Configure", "Exit" };
    IConfig ic;

    public Program() {
        super("Copy File Program", mc);
        ic = new ConfigRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                ic.readFileConfig();
                break;
            case 2:
                System.exit(0);
        }
    }

}
