package day37_Inheritance.Spain;

public class Madrid extends Spain{
    public Madrid(String system, String weather, int population, double salary, double maxTemperature, double minTemperature) {
        super(system, weather, population, salary, maxTemperature, minTemperature);
    }


    public String toString() {
        return "Madrid{" +
                "City= Madrid is Capital" +
                "system='" + system + '\'' +
                ", weather='" + weather + '\'' +
                ", population=" + population +
                ", salary=" + salary +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                '}';
    }

}
