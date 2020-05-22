import java.util.Iterator;
import java.util.Set;

class GetStudentCourses {
  public static void main(String[] args) {
    Institution
     institution = InstitutionFactory.factory();
    Student student = institution.getStudent(Integer.parseInt(args[0]));
    Set<Course> courses = student.getCourses();
    Iterator<Course> iterator = courses.iterator();
    while(iterator.hasNext()) {
      Course course = iterator.next();
      System.out.println(course.getId()+" "+course.getName());
    }
  }
}