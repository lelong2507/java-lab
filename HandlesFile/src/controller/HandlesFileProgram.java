package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import model.Person;
import view.Menu;

public class HandlesFileProgram extends Menu<Person> {

    private Person ps;

    public HandlesFileProgram(String td, String[] mc) {
        super(td, mc);
        ps = new Person();

    }

    @Override
    public void execute(int n) {
        Scanner scanner = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.print("Enter Path: ");
                String filePath = scanner.next();
                System.out.print("Enter Money: ");
                double minSalary = scanner.nextDouble();

                try {
                    List<Person> filteredPeople = getPerson(filePath, minSalary);
                    displayPeople(filteredPeople);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 2:
                System.out.print("Enter source: ");
                String sourceFilePath = scanner.next();
                System.out.print("Enter new file: ");
                String destFilePath = scanner.next();

                try {
                    copyWordOneTimes(sourceFilePath, destFilePath);
                    System.out.println("Copy done.");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 3:
                scanner.close();
                System.exit(0);
        }
    }

    public static List<Person> getPerson(String path, double money) throws Exception {
        List<Person> peopleList = new ArrayList<>();
        File file = new File(path);

        if (!file.exists()) {
            throw new Exception("Path doesn't exist");
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length != 3) {
                    continue;
                }
                String name = parts[0];
                String address = parts[1];
                double salary = 0;

                try {
                    salary = Double.parseDouble(parts[2]);
                } catch (NumberFormatException e) {

                }

                if (salary >= money) {
                    peopleList.add(new Person(name, address, salary));
                }
            }
        } catch (IOException e) {
            throw new Exception("Can't read file");
        }

        peopleList.sort(Comparator.comparingDouble(p -> p.getSalary()));

        return peopleList;
    }

    public void copyWordOneTimes(String source, String destination) throws Exception {
        File sourceFile = new File(source);
        File destFile = new File(destination);

        if (!sourceFile.exists()) {
            throw new Exception("Source path doesn't exist");
        }

        try (Scanner scanner = new Scanner(sourceFile); PrintWriter writer = new PrintWriter(destFile)) {

            Set<String> uniqueWords = new HashSet<>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                uniqueWords.add(word);
            }

            for (String word : uniqueWords) {
                writer.println(word);
            }
        } catch (IOException e) {
            throw new Exception("Error reading or writing file");
        }
    }

    public static void displayPeople(List<Person> people) {
        if (people.isEmpty()) {
            System.out.println("No people found with the specified criteria.");
        } else {
            System.out.printf("%-20s %-20s %-10s%n", "Name", "Address", "Salary");
            for (Person person : people) {
                System.out.printf("%-20s %-20s %-10.2f%n", person.getName(), person.getAddress(), person.getSalary());
            }
            Person minSalaryPerson = people.get(0);
            Person maxSalaryPerson = people.get(people.size() - 1);
            System.out.println("");
            System.out.println("Max: " + minSalaryPerson.getName());
            System.out.println("Min: " + maxSalaryPerson.getName());
        }

    }
}
