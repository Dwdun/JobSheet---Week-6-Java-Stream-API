package JavaProblems;

public class Student {
    private int id;
    private String name;

    //constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //output
    public String toString() {
        return "Student{id: " + id + ", name: " + name + "}";
    }
}
