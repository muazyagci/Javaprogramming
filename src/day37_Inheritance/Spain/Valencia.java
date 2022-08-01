package day37_Inheritance.Spain;

public class Valencia extends  Spain{
    public Valencia(String system, String weather, int population, double salary, double maxTemperature, double minTemperature) {
        super(system, weather, population, salary, maxTemperature, minTemperature);
    }

    public String toString() {
        return "Valencia{" +
                "City Valencia is third biggest city of Spain"+
                "system='" + system + '\'' +
                ", weather='" + weather + '\'' +
                ", population=" + population +
                ", salary=" + salary +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                '}';

    }

}
