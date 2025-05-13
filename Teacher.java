public class Teacher implements UnitComponent{
    private String name;
    private String subject;
    private double salary;

    Teacher(String name, String subject, double salary){
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

   public double getSalary() {
       return salary;
   } 


    @Override
    public double calculateTotalBudget() {
        return salary;
    }

    @Override
    public int getTotalOfStudents() {
        return 0;
    }
    
}
