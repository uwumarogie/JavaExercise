package ComplexDataStructure;

import java.util.List;
import java.util.stream.Collectors;

public class DatabaseEmployer {


    /*
    You are given a dataset containing information about employees in a company. Each employee has a unique employee ID, a name, an age, and a list of skills. The skills are represented as a comma-separated string.

    You need to implement a Java class that can efficiently store and retrieve employee information based on their ID, as well as perform operations to find employees based on their skills.

    Design a data structure that can handle this dataset efficiently, and provide the following functionalities:

    Add an employee to the dataset.
    Remove an employee from the dataset by their ID.
    Retrieve an employee's information by their ID.
    Retrieve a list of employees who have a specific skill.
    Retrieve a list of employees whose age falls within a given range.
    * */

    private final List<Employee> database;

    public DatabaseEmployer(List<Employee> database) {
        this.database = database;
    }

    public void addEmployee(String name, int id, int age, List<String> skills) {
        Employee latestEmployee = new Employee(name, id, age, skills);
        database.add(latestEmployee);
    }

    public void removeEmployee(int id) {
        database.removeIf(el -> el.getUniqueId() == id);
    }

    public String retrieveEmployee(int id) {
        List<Employee> foundEmployee = database.stream().filter(el -> el.getUniqueId() == id).collect(Collectors.toList());
        return foundEmployee.get(0).toString();
    }


    public List<Employee> ageMinimun(int requiredAge) {
        return database.stream().filter(el -> el.getAge() >= requiredAge).collect(Collectors.toList());
    }

}

