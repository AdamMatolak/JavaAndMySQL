package sk.kosickaakademia.matolak.mysql.entity;

public class City {
    private String name;
    private int population;
    private String district;
    private String code;
    private String country;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public City(String name, int population, String district, String country) {
        this.name = name;
        this.population = population;
        this.district = district;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setCode3(String code) {
        this.code = code;
    }

    public String getDistrict() {
        return district;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }
}
