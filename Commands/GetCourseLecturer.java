class GetCourseLecturer {
  public static void main(String[] args) {
    Institution
     institution = InstitutionFactory.factory();
    Course course = institution.getCourse(Integer.parseInt(args[0]));
    System.out.println("Course lecturer is "+course.getLecturer().getName()+"!");
  }
}