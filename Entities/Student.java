import java.util.HashSet;
import java.util.Set;

class Student extends Entity {
  private HashSet<Course> courses = new HashSet<Course>();
  private String name;

  Student(int id, String name)
  {
    super(id);
    this.name = name;
  }
 
  public Set<Course> getCourses()
  {
    return courses;
  }

  public String getName()
  {
      return name;
  }

  public void addCourse(Course course)
  {
    courses.add(course);
    course.addStudent(this);
  }

  public void removeCourse(Course course)
  {
    courses.remove(course);
    course.removeStudent(this);
  }
}