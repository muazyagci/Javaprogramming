package day37_Inheritance.Spain;

public class Barcelona extends  Spain{
    public Barcelona(String system, String weather, int population, double salary, double maxTemperature, double minTemperature) {
        super(system, weather, population, salary, maxTemperature, minTemperature);
    }

    public String toString() {
        return "Barcelona{" +
                "City Barcelona is very attractive, and it is second biggest city of Spain."+
                "system='" + system + '\'' +
                ", weather='" + weather + '\'' +
                ", population=" + population +
                ", salary=" + salary +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                '}';
    }
}
