package controller;

import model.Account;
import view.*;

public class AccountProgram extends Menu<Account> {
    AccountManagement accMGM;
    Account ac;
    Input in;

    public AccountProgram(String td, String[] mc) {
        super(td, mc);
        accMGM = new AccountManagement();
        ac = new Account();
        in = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                add();
                break;
            case 2:
                login();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void add() {
        String userName = "";
        while (true) {
            userName = in.getUserName();
            if (accMGM.checkDuplicate(userName)) {
                break;
            } else {
                System.out.println("UserName is exit!");
            }
        }
        String passWord = in.getPassoWord();
        ac = new Account(userName, passWord);
        accMGM.addAccount(ac);
        accMGM.writeFile();
    }

    public void login() {
        String userName = in.getUserName();
        String passWord = in.getPassoWord();
        accMGM.writeFile();
        accMGM.loginAcc(userName, passWord);
    }
}
