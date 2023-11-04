package controller;

import java.util.*;

import model.Customer;
import model.repository.CustomerRepository;
import view.Menu;

public class Program extends Menu {

    private List<Customer> cusList;
    private Customer cus;
    private Scanner sc;
    private CustomerRepository cr;
    private static String[] mc = { "Import CSV", "Format Address", "Format Name", "Export CSV", "Exit" };

    public Program() {
        super("Format CSV Program", mc);
        cusList = new ArrayList<>();
        cus = new Customer();
        sc = new Scanner(System.in);
        cr = new CustomerRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                cr.importCsvFile(cusList);
                break;
            case 2:
                cr.formatAddress(cusList);
                break;
            case 3:
                cr.formatName(cusList);
                break;
            case 4:
                cr.exportCSV(cusList);
                break;
            case 5:
                System.exit(0);

        }
    }

}
