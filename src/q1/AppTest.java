package q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    Worker worker = new Worker("Tanim", 150000);
    Supervisor supervisor = new Supervisor("Tanim", 1050, "IT");
    Director director = new Director("Tanim", 1050, "IT");

    @AppTest
    void testWorker() {
        assertEquals("Tanim", worker.getName());
        assertEquals(150000, worker.getWage());
        worker.setName("Tanim New");
        worker.setWage(250000);
        assertEquals("Tanim New", worker.getName());
        assertEquals(250000, worker.getWage());
    }

    @AppTest
    void testSupervisor() {
        assertEquals("Tanim", supervisor.getName());
        assertEquals(1050, supervisor.getWage());
        assertEquals("IT", supervisor.getDivision());
        supervisor.setName("Tanim New");
        supervisor.setWage(250000);
        supervisor.setDivision("HR");
        assertEquals("Tanim New", supervisor.getName());
        assertEquals(250000, supervisor.getWage());
        assertEquals("HR", supervisor.getDivision());
    }

    @AppTest
    void testDirector() {
        assertEquals("Tanim", director.getName());
        assertEquals(1050, director.getWage());
        assertEquals("IT", director.getDivision());
        director.setName("Tanim New");
        director.setWage(250000);
        director.setDivision("HR");
        assertEquals("Tanim New", director.getName());
        assertEquals(250000, director.getWage());
        assertEquals("HR", director.getDivision());
    }
}
