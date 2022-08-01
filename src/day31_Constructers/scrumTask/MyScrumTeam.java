package day31_Constructers.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Murtaza", "QA", 789654, 40000);
        Tester tester2 = new Tester("Riza Baba", "QA", 654123, 80000);
        Tester tester3 = new Tester("Ali Riza", "QA", 321456, 70000);
        Tester tester4 = new Tester("Mesut Komiser", "QA", 123654, 60000);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Karahanli", "Java Developer", 654789, 70000);
        Developer developer2 = new Developer("Polat Alemdar", "Python Developer", 654987, 60000);
        Developer developer3 = new Developer("Tokmak kafa", "Software Developer Developer", 654123, 50000);
        Developer developer4 = new Developer("Arif keser", "Software Developer Developer", 652365, 50000);

        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum = new ScrumTeam("Iskender", "Nazike", "BumbleBee", 14);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);
        System.out.println("----------------------------");

         for (Tester each : scrum.testersList){
             System.out.println(each.name+" : "+each.salary);

         }

        System.out.println("-------------------------------");

         for (Developer each:scrum.devopsList){
             System.out.println(each.name+" : "+ each.salary);

         }
scrum.removeDeveloper(652365);
scrum.removeTester(321456);
        System.out.println(scrum);

    }

}
