import java.util.ArrayList;

public class LagopusClass {
  private String className;
  private ArrayList <String> students;
  private ArrayList <String> mentors;

  public void addStudent(Student student) {
    students.add(student.getName());
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor.getName());
  }

  public void info(){
    System.out.println("Lagopus " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  LagopusClass(String className){
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }
}
