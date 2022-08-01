package day37_Inheritance.Spain;

public class Spain {
    public String system,weather;
    public int population;
    public double salary, maxTemperature,minTemperature;

    public Spain(String system, String weather, int population, double salary, double maxTemperature, double minTemperature) {
        this.system = system;
        this.weather = weather;
        this.population = population;
        this.salary = salary;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    public String toString() {
        return "Spain{" +
                "system='" + system + '\'' +
                ", weather='" + weather + '\'' +
                ", population=" + population +
                ", salary=" + salary +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                '}';
    }
}
