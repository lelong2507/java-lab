package model.repository;

import java.util.List;

import dataaccess.IncomeTaxDAO;
import model.entity.Children;
import model.entity.Parent;
import model.entity.Person;

public class Repository implements IRepository {

    @Override
    public void detailOfDeduction(Person person, List<Children> childrens, List<Parent> parents) {
        IncomeTaxDAO.Instance().inputData(person, childrens, parents);
    }

    @Override
    public void inputData(Person person, List<Children> childrens, List<Parent> parents) {
        IncomeTaxDAO.Instance().detailOfDeduction(person, childrens, parents);
    }

}
