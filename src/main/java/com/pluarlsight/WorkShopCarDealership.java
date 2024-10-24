package com.pluarlsight;

import java.util.ArrayList;

public class WorkShopCarDealership {
public static void main(String[] args) {

}
}

class UserInterface {

}

class DealershipFileManager{

}
class Dealership {
    private String name;
    private String address;
    private String phone;

    static ArrayList<Vehicle> inventory;

    public Dealership (String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public static ArrayList<Vehicle> getVehiclesByPrice (double min, double max) {
        return null;
    }
    public static ArrayList<Vehicle> getVehiclesByMakeModel (String make, String model) {
        return null;
    }
    public static ArrayList<Vehicle> getVehiclesByYear (String make, String model) {
        return null;
    }
    public static ArrayList<Vehicle> getVehiclesByColor (String color) {
        return null;
    }
    public static ArrayList<Vehicle> getVehiclesByMileage (double min, double max) {
        return null;
    }
    public static ArrayList<Vehicle> getVehiclesByType (String vehicleType) {
        return null;
    }
    public static ArrayList<Vehicle> getAllVehicles (double min, double max) {
        return null;
    }
    public static void addVehicle (Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public static void removeVehicle (Vehicle vehicle) {
        inventory.remove(vehicle);
    }


}
class Vehicle {

}

