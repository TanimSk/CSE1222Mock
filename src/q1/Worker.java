package q1;

public class Worker {
    private String name = "";
    private int wage = 0;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setWage(int newWage) {
        wage = newWage;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public String toString() {
        System.out.println("Name: " + this.getName());
        System.out.println("Wage: " + this.getWage());
        return "";
    }
}