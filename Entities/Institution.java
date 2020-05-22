import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Institution implements InstitutionInterface {

  private HashSet<Student> students = new HashSet<Student>();
  private HashSet<Course> courses = new HashSet<Course>();
  private HashSet<Lecturer> lecturers = new HashSet<Lecturer>();

  public Lecturer getLecturer(int id)
  {
    return (Lecturer) getEntity(lecturers, id);
  }

  public Course getCourse(int id)
  {
    return (Course) getEntity(courses, id);
  }

  public Student getStudent(int id)
  {
    return (Student) getEntity(students, id);
  }

  public void saveCourse(Course course)
  {
    courses.add(course);
  }

  public void saveLecturer(Lecturer lecturer)
  {
    lecturers.add(lecturer);
  }

  public void saveStudent(Student student)
  {
    students.add(student);
  }

  private Entity getEntity(Set items, int id)
  {
    Iterator iterator = items.iterator();
    while(iterator.hasNext()) {
      Entity entity = (Entity) iterator.next();
      if(entity.getId()==id) {
        return entity;
      }
    }
    return null;
  }
}