package q1;

public class Director extends Supervisor {
    Director(String name, int wage, String division) {
        super(name, wage, division);
    }

    @Override
    public String toString() {
        System.out.println("Name: " + super.getName());
        System.out.println("Wage: " + super.getWage());
        System.out.println("Division: " + super.getDivision());
        return "";
    }

}
