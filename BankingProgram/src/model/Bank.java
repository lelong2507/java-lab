package model;

import java.util.Locale;

import dataaccess.DaoEBank;

public class Bank implements IBank {

    @Override
    public void setLocate(Locale locale) {
        DaoEBank.Instance().setLanguage(locale);
    }

    @Override
    public void checkAccountNumber() {
        DaoEBank.Instance().getAccount();
    }

    @Override
    public void checkPassword() {
        DaoEBank.Instance().getPassword();
        DaoEBank.Instance().getCaptcha();
    }

}
