import java.util.Iterator;
import java.util.Set;

class GetCourseStudents {
  public static void main(String[] args) {
    Institution
     institution = InstitutionFactory.factory();
    Course course = institution.getCourse(Integer.parseInt(args[0]));
    Set<Student> students = course.getStudents();
    Iterator<Student> iterator = students.iterator();
    while(iterator.hasNext()) {
      Student student = iterator.next();
      System.out.println(student.getId()+" "+student.getName());
    }
  }
}