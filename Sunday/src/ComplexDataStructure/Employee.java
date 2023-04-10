package ComplexDataStructure;

import java.util.List;

public class Employee {

    private final int id;
    private final String name;
    private final int age;
    private final List<String> skills;

    public Employee(String name, int id, int age, List<String> skills) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.skills = skills;
    }

    public int getUniqueId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}
