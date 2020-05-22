import java.util.HashSet;
import java.util.Set;

class Lecturer extends Entity {

  private HashSet<Course> courses = new HashSet<Course>();

  private String name;

  Lecturer(int id, String name)
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

  void addCourse(Course course)
  {
    courses.add(course);
  }

  void removeCourse(Course course)
  {
    courses.remove(course);
  }
}