class SetCourseLecturer {
  public static void main(String[] args) {
    Institution
     institution = InstitutionFactory.factory();
    Course course = institution.getCourse(Integer.parseInt(args[0]));
    Lecturer lecturer = institution.getLecturer(Integer.parseInt(args[1]));
    course.setLecturer(lecturer);
    institution.saveCourse(course);
    System.out.println("Course lecturer has changed!");
  }
}