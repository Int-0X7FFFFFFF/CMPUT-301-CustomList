package com.example.simpleparadox.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This remove a city to the list if the city exist
     * @param city
     * This is a candidate city to remove
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * This Check if city exists
     * @param city
     * This is a candidate city to Check
     * @return
     * Return True or False
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    /**
     * This count number of cities
     * @return
     * Return count of cities
     */
    public int countCities() {
        return cities.size()+1;
    }
}