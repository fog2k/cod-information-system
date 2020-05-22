class RemoveCourseStudent {
  public static void main(String[] args) {
    Institution
     institution = InstitutionFactory.factory();
    Course course = institution.getCourse(Integer.parseInt(args[0]));
    Student student = institution.getStudent(Integer.parseInt(args[1]));
    student.removeCourse(course);
    institution.saveStudent(student);
    System.out.println("Student has been removed from course!");
  }
}