package q1;

public class Supervisor extends Worker {
    private String division;

    Supervisor(String name, int wage, String division) {
        super(name, wage);
        this.division = division;
    }

    public void setDivision(String newDivision) {
        division = newDivision;
    }

    public String getDivision() {
        return division;
    }

    @Override
    public String toString() {
        System.out.println("Name: " + super.getName());
        System.out.println("Wage: " + super.getWage());
        System.out.println("Division: " + this.getDivision());
        return "";
    }

}
