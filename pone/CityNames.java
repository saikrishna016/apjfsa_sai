package pone;

import java.util.Stack;

class CityNames {

    String name;
    double literacyRate;

    public CityNames(String name, double literacyRate) {
        this.name = name;
        this.literacyRate = literacyRate;
    }
}

 public class CityStack {
    public static void main(String[] args) {
    	
        Stack<City> cityStack = new Stack<>();

        // Push cities onto the stack
        cityStack.push(new City("HYD", 95.5));
        cityStack.push(new City("KNR", 88.3));
        cityStack.push(new City("SRCL", 92.1));

        // Retrieve the top city
        City topCity = cityStack.peek();
        System.out.println("Top City: " + topCity.name);

        // Search for a city in the list
        String searchCity = "KNR";
        for (City city : cityStack) {
            if (city.name.equals(searchCity)) {
                System.out.println(searchCity + " found with literacy rate: " + city.literacyRate);
                break;
            }
        }
    }
}


