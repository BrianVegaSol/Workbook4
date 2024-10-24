package com.pluarlsight;

import java.util.ArrayList;

public class WorkShopCarDealership {
    public static void main(String[] args) {

    }
}

class UserInterface {

}

class DealershipFileManager {

}

class Dealership {
    private String name;
    private String address;
    private String phone;
    //TODO should this be private?
    private static ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        //TODO is this instantiating the ArrList object???
        inventory = new ArrayList<>();
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

    public static ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByYear(String make, String model) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByMileage(double min, double max) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public static ArrayList<Vehicle> getAllVehicles(double min, double max) {
        //Is this necessary or will the return inventory suffice???
        for (Vehicle vehicle : inventory) {
            //inventory.get(vehicle); no
            System.out.println(vehicle);
        }
        return inventory;
    }

    public static void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public static void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }


}

class Vehicle {
    private int VINNumber;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public Vehicle (int VINNumber, int year, String make, String model, String vehicleType,
                    String color, int odometer, double price) {
        this.VINNumber = VINNumber;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
}

