package q1;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new Worker("Tanim", 150000);
        Supervisor supervisor = new Supervisor("Tanim", 1050, "IT");
        Director director = new Director("Tanim", 1050, "IT");

        System.out.println("Worker:");
        System.out.println("Name: " + worker.getName());
        System.out.println("Wage: " + worker.getWage());
        System.out.println();

        System.out.println("Supervisor:");
        System.out.println("Name: " + supervisor.getName());
        System.out.println("Wage: " + supervisor.getWage());
        System.out.println("Division: " + supervisor.getDivision());
        System.out.println();

        System.out.println("Director:");
        System.out.println("Name: " + director.getName());
        System.out.println("Wage: " + director.getWage());
        System.out.println("Division: " + director.getDivision());
    }       
}
