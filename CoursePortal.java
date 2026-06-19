class Course {
    private String title;
    private String duration;
    private String instructor;

    public Course(String title, String duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void getCourseInfo() {
        System.out.println("Course: " + title + ", Duration: " + duration + ", Instructor: " + instructor);
    }
}

class LiveCourse extends Course {
    private String scheduleTime;

    public LiveCourse(String title, String duration, String instructor, String scheduleTime) {
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }

    @Override
    public void getCourseInfo() {
        System.out.println("Live Course: " + getTitle() + ", Duration: " + getDuration() + ", Instructor: " + getInstructor() + ", Time: " + scheduleTime);
    }
}

class RecordedCourse extends Course {
    private int videoCount;

    public RecordedCourse(String title, String duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    @Override
    public void getCourseInfo() {
        System.out.println("Recorded Course: " + getTitle() + ", Duration: " + getDuration() + ", Instructor: " + getInstructor() + ", Videos: " + videoCount);
    }
}

public class CoursePortal {
    public static void main(String[] args) {
        Course[] courses = {
            new LiveCourse("Java OOP", "2 Months", "Mr. Sharma", "7 PM"),
            new RecordedCourse("Web Design", "1 Month", "Ms. Karki", 20)
        };

        for (Course course : courses) {
            course.getCourseInfo();
        }
    }
}

