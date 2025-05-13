public class Main{
    public static void main(String[] args) {
        College college = new College("College of Informatics and Computing Studies");
        College college2 = new College("College of Nursing");
        Department department = new Department("Department of Computer Science");
        Department department2 = new Department("Department of Biology");
        Department department1 = new Department("Department of Neuro");
        Teacher teacher1 = new Teacher("Wonka", "Lua 1010", 30000);
        Teacher teacher2 = new Teacher("Wonka1", "Bio 1010", 30000);
        Teacher teacher3 = new Teacher("Wonka2", "Geo 1010", 30000);
        Student student1 = new Student("Renard",  "22-123", 25000);
        Student student2 = new Student("Rena",  "22-125", 26000);
        Student student3 = new Student("Ren",  "22-124", 27000);
        college.add(department);
        college2.add(department1);
        college2.add(department2);
        department.add(teacher1);
        department.add(student1);
        department2.add(student2);
        department1.add(student3);
        department2.add(teacher2);
        department1.add(teacher3);
        System.out.println( college.getTotalOfStudents());
        System.out.println( college.calculateTotalBudget());
        System.out.println( college2.getTotalOfStudents());
        System.out.println( college2.calculateTotalBudget());
    }
}