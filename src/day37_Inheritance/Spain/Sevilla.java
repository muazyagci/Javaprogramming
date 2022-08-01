package day37_Inheritance.Spain;

public class Sevilla extends Spain{
    public Sevilla(String system, String weather, int population, double salary, double maxTemperature, double minTemperature) {
        super(system, weather, population, salary, maxTemperature, minTemperature);
    }

    public String toString() {
        return "Sevilla{" +
                "City Sevilla is fourth biggest city of Spain "+
                "system='" + system + '\'' +
                ", weather='" + weather + '\'' +
                ", population=" + population +
                ", salary=" + salary +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                '}';

    }
}
