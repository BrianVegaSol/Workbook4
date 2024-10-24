package com.pluarlsight;

import java.io.*;
import java.util.ArrayList;

public class WorkShopCarDealership {
    public static void main(String[] args) {
        System.out.println(DealershipFileManager.getDealership().toString());
        for (Vehicle vehicle : Dealership.inventory) {
            System.out.println(vehicle.toString());
        }
    }
}

class UserInterface {

}

class DealershipFileManager {
    public static Dealership getDealership() {
        /*try(FileWriter writer = new FileWriter("inventory.csv",true)){
            writer.write("Stuff" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        //read to .csv
        Dealership dealership = null;
        String file = "inventory.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String dealershipLine = br.readLine();
            String[] dealershipSplit = dealershipLine.split("\\|");
            String name = dealershipSplit[0];
            String address = dealershipSplit[1];
            String phone = dealershipSplit[2];
            dealership = new Dealership(name, address, phone);

            String vehicleLine;
            while ((vehicleLine = br.readLine()) != null) {
                String[] vehicleSplit = vehicleLine.split("\\|");
                int VINNumber = Integer.parseInt(vehicleSplit[0]);
                int year = Integer.parseInt(vehicleSplit[1]);
                String make = vehicleSplit[2];
                String model = vehicleSplit[3];
                String vehicleType = vehicleSplit[4];
                String color = vehicleSplit[5];
                int odometer = Integer.parseInt(vehicleSplit[6]);
                double price = Double.parseDouble(vehicleSplit[7]);
                Vehicle vehicle = new Vehicle(VINNumber, year, make, model, vehicleType, color, odometer, price);
                Dealership.inventory.add(vehicle);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return dealership;
    }

    public static void saveDealership(Dealership dealership) {
    }

}

class Dealership {
    private String name;
    private String address;
    private String phone;
    //TODO should this be private?
    static ArrayList<Vehicle> inventory;

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

    public  String toString() {
        return "Dealership Name: " + name +
                "\nAddress: " + address +
                "\nPhone Number: " + phone;
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

    public Vehicle(int VINNumber, int year, String make, String model, String vehicleType,
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
    public String toString () {
        return "----------------------------" +
                "\nVIN #: " + VINNumber +
                "\nYear: " + year +
                "\nMake: " + make +
                "\nModel: " + model +
                "\nVehicle Type: " + vehicleType +
                "\nColor: " + color +
                "\nOdometer: " + odometer +
                String.format("\nPrice: $%,.2f" , price);
    }
}

