package sk.kosickaakademia.matolak.mysql.entity;

public class Country{

    private String name;
    private String code;
    private String capitalCity;
    private int area;
    private String continent;

    public Country(String name, String code, String capitalCity, int area, String continent) {
        this.name = name;
        this.code = code;
        this.capitalCity = capitalCity;
        this.area = area;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public int getArea() {
        return area;
    }

    public String getContinent() {
        return continent;
    }
}
