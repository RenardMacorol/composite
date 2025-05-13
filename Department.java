import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationUnitComponent, UnitComponent{
    private String name;
    private List<UnitComponent> components;

    Department(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UnitComponent> getComponents() {
        return components;
    }

    public void setComponents(List<UnitComponent> components) {
        this.components = components;
    }

    @Override
    public double calculateTotalBudget() {
        double totalBudget = 0;
        for(UnitComponent component : components){
            totalBudget += component.calculateTotalBudget();

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
