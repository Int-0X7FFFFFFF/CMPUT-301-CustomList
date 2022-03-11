package com.example.simpleparadox.listycity;
/**
 * This class defines city objects
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate name of city
     * @param province
     * This is a candidate name of city province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This get name of city
     * @return
     * Return name of city
     */
    String getCityName(){
        return this.city;
    }
    /**
     * This get name of province
     * @return
     * Return name of province
     */
    String getProvinceName(){
        return this.province;
    }
    /**
     * This get name of province
     * @param city
     * This is a candidate city to compare
     * @return
     * Return compare result
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}