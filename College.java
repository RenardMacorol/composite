import java.util.ArrayList;
import java.util.List;

public class College implements OrganizationUnitComponent, UnitComponent{
    private String name;
    private List<UnitComponent> components;

    College(String name){
        this.name = name;
        this.components = new ArrayList<>();
            
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calculateTotalBudget() {
        double totalBudget = 0;
        for(UnitComponent component : components){
            totalBudget += component.calculateTotalBudget();
            component.calculateTotalBudget();

        }
        return totalBudget;
    }

    @Override
    public int getTotalOfStudents() {
        int totalStudents = 0;
        for(UnitComponent component : components){
            totalStudents += component.getTotalOfStudents();

        }
        return totalStudents;
    }

    @Override
    public void add(UnitComponent unitComponent) {
        components.add(unitComponent);

    }

    @Override
    public void remove(UnitComponent unitComponent) {
        components.remove(unitComponent);
    }
    

}
