import java.util.*;

class City {

    private String cityName;
    private Map<String, String> areaMap;

    public City(String cityName) {
        this.cityName = cityName;
        this.areaMap = new HashMap<>();
    }

    public String getCityName() {
        return cityName;
    }

    public void addArea(String pincode, String areaName) {
        areaMap.put(pincode, areaName);
    }

    public Map<String, String> getAreaMap() {
        return areaMap;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof City))
            return false;

        City other = (City) obj;
        return Objects.equals(cityName, other.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName);
    }

    @Override
    public String toString() {
        return "City Name: " + cityName +
               ", Areas: " + areaMap;
    }
}

class State {

    private String stateName;
    private Set<City> cities;

    public State(String stateName) {
        this.stateName = stateName;
        this.cities = new HashSet<>();
    }

    public boolean addCity(City city) {
        return cities.add(city);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof State))
            return false;

        State other = (State) obj;
        return Objects.equals(stateName, other.stateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateName);
    }

    @Override
    public String toString() {
        return "State Name: " + stateName +
               "\nCities: " + cities;
    }
}

public class GeographicSystem {

    public static void main(String[] args) {

        City mumbai = new City("Mumbai");
        mumbai.addArea("400001", "Fort");
        mumbai.addArea("400002", "Colaba");

        City pune = new City("Pune");
        pune.addArea("411001", "Shivaji Nagar");
        pune.addArea("411002", "Swargate");

        State maharashtra = new State("Maharashtra");

        System.out.println("Mumbai Added: " +
                maharashtra.addCity(mumbai));

        System.out.println("Pune Added: " +
                maharashtra.addCity(pune));

        System.out.println("Mumbai Added Again: " +
                maharashtra.addCity(mumbai));

        System.out.println("\n" + maharashtra);
    }
}