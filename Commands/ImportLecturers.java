import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ImportLecturers {
  public static void main(String[] args) {
    try {
      Institution institution = InstitutionFactory.factory();
      File file = new File(args[0]);
      FileReader fr = new FileReader(file);
      BufferedReader reader = new BufferedReader(fr);
      String line = reader.readLine();
      while (line != null) {
        String[] row = line.split(" ");
        institution.saveLecturer(new Lecturer(Integer.parseInt(row[0]), row[1]));
        line = reader.readLine();
      }
      System.out.println("Lecturers has imported!");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}