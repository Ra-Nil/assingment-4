class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double[] getMarks() {
        return marks;
    }

    public double calculateAverage() {
        double sum = 0;

        for (double mark : marks) {
            sum += mark;
        }

        return sum / marks.length;
    }
}

class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(String name, int rollNumber, double[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    public void printThesisTitle() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class GradeBook {
    public static void main(String[] args) {
        Student student = new Student("Ram", 1, new double[]{80, 85, 90});
        GraduateStudent graduateStudent = new GraduateStudent("Sita", 2, new double[]{88, 92, 95}, "Artificial Intelligence");

        System.out.println(student.getName() + " Average: " + student.calculateAverage());
        System.out.println(graduateStudent.getName() + " Average: " + graduateStudent.calculateAverage());
        graduateStudent.printThesisTitle();
    }
}
