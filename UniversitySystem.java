class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void getRoleDetails() {
        System.out.println("Person: " + name + ", ID: " + id);
    }
}

class Student extends Person {
    private String program;

    public Student(String name, int id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Student: " + getName() + ", ID: " + getId() + ", Program: " + program);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Teacher: " + getName() + ", ID: " + getId() + ", Subject: " + subject);
    }
}

class Admin extends Person {
    private String department;

    public Admin(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Admin: " + getName() + ", ID: " + getId() + ", Department: " + department);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Ram", 1, "BCSIT"),
            new Teacher("Mr. Shrestha", 2, "Java"),
            new Admin("Sita", 3, "Examination")
        };

        for (Person person : people) {
            person.getRoleDetails();
        }
    }
}
