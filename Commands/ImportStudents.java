import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ImportStudents {
  public static void main(String[] args) {
    try {
      Institution institution = InstitutionFactory.factory();
      File file = new File(args[0]);
      FileReader fr = new FileReader(file);
      BufferedReader reader = new BufferedReader(fr);
      String line = reader.readLine();
      while (line != null) {
        String[] row = line.split(" ");
        institution.saveStudent(new Student(Integer.parseInt(row[0]), row[1]));
        line = reader.readLine();
      }
      System.out.println("Students has imported!");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}