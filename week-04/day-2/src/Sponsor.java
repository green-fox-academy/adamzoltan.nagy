
public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant software developers.");
  }

  public void hire(int hiredStudents) {
    this.hiredStudents += hiredStudents;
  }

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  Sponsor() {
    super();
    company = "Google";
  }
}
