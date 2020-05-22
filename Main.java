import java.util.*;

class Main {
  public static void main(String[] args) {
    Course course;
    Student student;
    Lecturer lecturer;
    
    Institution institution = InstitutionFactory.factory();

    institution.saveLecturer(new Lecturer(1, "Информатик"));
    institution.saveLecturer(new Lecturer(2, "Физик"));

    course = new Course(1, "Математика");
    course.setLecturer(institution.getLecturer(1));
    institution.saveCourse(course);

    course = new Course(2, "Информатика");
    course.setLecturer(institution.getLecturer(1));
    institution.saveCourse(course);

    course = new Course(3, "Физика");
    course.setLecturer(institution.getLecturer(2));
    institution.saveCourse(course);

    student = new Student(1, "Ваня");
    student.addCourse(institution.getCourse(1));
    student.addCourse(institution.getCourse(3));
    institution.saveStudent(student);

    student = new Student(2, "Петя");
    student.addCourse(institution.getCourse(2));
    student.addCourse(institution.getCourse(3));
    institution.saveStudent(student);

    student = new Student(3, "Коля");
    student.addCourse(institution.getCourse(2));
    institution.saveStudent(student);

    course = institution.getCourse(2);
    System.out.println("Курс "+course.getName()+" изучают студенты");
    course.getStudents().forEach(st -> System.out.println(st.getName()));

    System.out.println("\nКурс "+course.getName()+" преподает "+course.getLecturer().getName());

    lecturer = institution.getLecturer(1);
    System.out.println("\nПреподаватель "+lecturer.getName()+" преподает курсы:");
    lecturer.getCourses().forEach(c -> System.out.println(c.getName()));
  }
}