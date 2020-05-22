import java.util.HashSet;
import java.util.Set;

class Course extends Entity {

  private Lecturer lecturer;
  private String name;

  private HashSet<Student> students = new HashSet<Student>();

  Course(int id, String name)
  {
    super(id);
    this.name = name;
  }

  public String getName()
  {
      return name;
  }

  public void setLecturer(Lecturer lecturer)
  {
    if(this.lecturer!=null) {
      this.lecturer.removeCourse(this);
    }
    this.lecturer = lecturer;
    lecturer.addCourse(this);
  }

  public Lecturer getLecturer()
  {
    return lecturer;
  }

  public Set<Student> getStudents()
  {
    return students;
  }

  void addStudent(Student student)
  {
    students.add(student);
  }

  void removeStudent(Student student)
  {
    students.remove(student);
  }
}