package org.example.Generate;

public class GeneratorID {
    public static Long restaurantID = 0L;
    public static Long menultemID = 0L;

    public static Long getRestaurantID(){
       return ++restaurantID;
    }

    public static Long getMenultemID() {
        return ++menultemID;
    }
}