# Практическое задание.
## Информационная система учебного заведения.

[Ссылка на задание](https://docs.google.com/document/d/1COj5FSznQYb5yC-z6eeu6ggpT8VijWzjwsvZ0ugukN8/edit?usp=drivesdk)

## Структура системы в виде диаграммы классов:

![class diagramm](http://www.plantuml.com/plantuml/png/hLJRQkim47ptL-ZHmV4Nd1322GTEeFGbNo2YRIAmfTPQfPHUlhsoLXBh6lS2VR8yCrtlZARPEPG3-hwhJfrqJXoCGuqUjJNYkHBjV-akHq3Xq2imw1Xqidvmm94EJkW760BMx2Chpe1qghL1eTKgK4UQDNBfoCYRD6DayvdHLwkLSF8AQIezqYuJGHvDp-9WeYaVo8TY8SZQVoP4yJGkGgTwzAWHUhSMUQFNAWLN9eJKIY8RMczRiWhK4GTjpiB87lw4z-Q3oRLWWjKeu7DAdAucZhG1lWtoYBr5TrAfXOIIO83UBgLOJ15EbiGieuYoRUDxTfvYtxBcv58iEvsvoNS5-EbLBTGcCdmPLZat3MkvBPEy5cKbCgfA_DyXcw5lXB4MQsh_GTNvxH9Ysri54VXhRGVI27ZmidCrcvw_-uEInGpeptwhOirN5Mk-Kp7-KsDRVzzcTtEcT6zEfOvMLPO4k8CxB4GQcc6RyNHHcvUsV9XXoZwQTYvbc-p0ADztxm00)

## Пример исполняемого файла:

```Java
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
```

## [Выполнить программу](https://foginstitution.fog.repl.run/)