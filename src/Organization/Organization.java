package Organization;

import java.util.ArrayList;

public class Organization {
    private ArrayList<Person> employees;

    public Organization() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        if (!employees.contains(person)) {
            this.employees.add(person);
        }
    }

    public void remove(Person person) {
        if (employees.contains(person)) {
            employees.remove(person);
        }
    }

    public void searchByName(String keyword) {
        boolean noResults = true;
        for (Person item : employees) {
            if (item.getName().equals(keyword)) {
                item.printPerson();
                noResults = false;
            }
        }
        if (noResults == true) {
            System.out.println("Not found");
        }
    }

    public void searchByAge(String keyword) {
        boolean noResults = true;
        for (Person item : employees) {
            if (String.valueOf(item.getAge()).equals(keyword)) {
                item.printPerson();
                noResults = false;
            }
        }
        if (noResults == true) {
            System.out.println("Not found");
        }
    }

    public void searchBySex(String keyword) {
        boolean noResults = true;
        for (Person item : employees) {
            if (item.getSex().equals(keyword)) {
                item.printPerson();
                noResults = false;
            }
        }
        if (noResults == true) {
            System.out.println("Not found");
        }
    }

    public void searchByDepartment(String keyword) {
        boolean noResults = true;
        for (Person item : employees) {
            if (item.getDepartment().equals(keyword)) {
                item.printPerson();
                noResults = false;
            }
        }
        if (noResults == true) {
            System.out.println("Not found");
        }
    }

    public void changeName(Person person, String name) {
        for (Person item : employees) {
            if (person == item) {
                person.setName(name);
            }
        }

    }

    public void changeAge(Person person, int age) {
        for (Person item : employees) {
            if (person == item) {
                person.setAge(age);
            }
        }
    }
}

