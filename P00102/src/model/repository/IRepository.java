package model.repository;

import java.util.List;

import model.entity.Children;
import model.entity.Parent;
import model.entity.Person;

public interface IRepository {
    void detailOfDeduction(Person person, List<Children> childrens, List<Parent> parents);

    void inputData(Person person, List<Children> childrens, List<Parent> parents);
}
