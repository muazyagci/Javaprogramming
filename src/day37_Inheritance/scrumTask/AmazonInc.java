package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String compamy = "Amazon";

        ProductOwner productOwner1 = new ProductOwner("David", 25, 'M', compamy, 45000, 1);

        BusinessAnalyst businessAnalyst1 = new BusinessAnalyst("Suarez", 35, 'M', compamy, 50000, 2);

        ScrumMaster sm = new ScrumMaster("Dianna", 26, 'F', compamy, 45000, 3);

        Tester tester1 = new Tester("Muaz", 24, 'M', "QA tester", compamy, 56000, 4);
        Tester tester2 = new Tester("Yasemin", 35, 'F', "back end tester", compamy, 40000, 5);
        Tester tester3 = new Tester("Yasin", 45, 'M', "manual tester", compamy, 50000, 6);
        Tester tester4 = new Tester("Fadime", 27, 'F', "Automation Tester", compamy, 49000, 7);
        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Daniela", 27, 'F', "Java developer", compamy, 30000, 8);
        Developer developer2 = new Developer("Camila", 27, 'F', "Python developer", compamy, 34000, 9);
        ScrumTeam scrumTeam = new ScrumTeam(productOwner1, businessAnalyst1, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDeveloper(developer2);
        scrumTeam.addTester(testers);
        System.out.println(scrumTeam);

        System.out.println("-------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }

    }

}
