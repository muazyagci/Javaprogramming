package day31_Constructers.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester) {
        testersList.add(tester);

    }

    public void addDeveloper(Developer developer) {
        devopsList.add(developer);

    }

    public void addTesters(Tester[] tester) {
        testersList.addAll(Arrays.asList(tester));
    }

    public void addDevelopers(Developer[] developer) {
        devopsList.addAll(Arrays.asList(developer));
    }

    public void removeDeveloper(int employeeID) {

        devopsList.removeIf(p -> p.ID == employeeID);

    }

    public void removeTester(int employeeID) {

        testersList.removeIf(p -> p.ID == employeeID);

    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", Total number of Testers=" + testersList +
                ", Total number of Developers=" + devopsList +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
