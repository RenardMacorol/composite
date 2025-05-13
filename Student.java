public class Student implements UnitComponent{
    private String name;
    private String id;
    private double tuitionFee;

    Student(String name, String id, double tuitionFee){
        this.name = name;
        this.id = id;
        this.tuitionFee = tuitionFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

   public double getTuitionFee() {
       return tuitionFee;
   } 

    @Override
    public double calculateTotalBudget() {
        return -tuitionFee;
    }

    @Override
    public int getTotalOfStudents() {
        return 1;
    }
    
}
