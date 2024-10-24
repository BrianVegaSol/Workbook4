package com.pluarlsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkShopCarDealership {
    public static void main(String[] args) {
        UserInterface.display();
        if (!UserInterface.exitApp) {

            System.out.println(DealershipFileManager.getDealership().toString());
            for (Vehicle vehicle : Dealership.inventory) {
                System.out.println(vehicle.toString());
            }


        }
        UserInterface.scan.close();
        //close bufferreader
    }
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

    /*public static ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }*/

    /*public static void getVehiclesByPrice(double min, double max) {
        for (Vehicle vehicle : inventory) {
            System.out.println(vehicle);
        }
    }*/

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
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

    /*public static ArrayList<Vehicle> getAllVehicles(double min, double max) {
        //Is this necessary or will the return inventory suffice???
        for (Vehicle vehicle : inventory) {
            //inventory.get(vehicle); no
            System.out.println(vehicle);
        }
        return inventory;
    }*/

    public static void getAllVehicles(double min, double max) {
        //Is this necessary or will the return inventory suffice???
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i).toString());
        }
    }

    public static void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public static void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

    public String toString() {
        return "Dealership Name: " + name +
                "\nAddress: " + address +
                "\nPhone Number: " + phone;
    }
}

//extend Dealership???
class UserInterface {
    static boolean displayMenu = true;
    static boolean exitApp = false;
    static Scanner scan = new Scanner(System.in);

    public static void display() {
        //private init();
        while (displayMenu) {
            System.out.println("Welcome to the Display Menu!\n" +
                    "1) Find vehicles within a price range\n" +
                    "2) Find vehicles by make/model\n" +
                    "3) Find vehicles by year\n" +
                    "4) Find vehicles by color\n" +
                    "5) Find vehicles by mileage\n" +
                    "6) Find vehicles by type\n" +
                    "7) List All vehicles\n" +
                    "8) Add a vehicle\n" +
                    "9) Remove a vehicle\n" +
                    "99) Quit");
            byte input = scan.nextByte();
            switch (input) {
                case 99:
                    exitApp = true;
                    displayMenu = false;
                    break;
                case 1:
                    //method
                    break;
                case 2:
                    //method
                    break;
                case 3:
                    //method
                    break;
                case 4:
                    //method
                    break;
                case 5:
                    //method
                    break;
                case 6:
                    //method
                    break;
                case 7:
                    //method
                    break;
                case 8:
                    //method
                    break;
                case 9:
                    //method
                    break;


            }
        }
    }

    public static void processVehiclesByPriceRequest(double min, double max) {
    }

    public static void processVehiclesByMakeModelRequest(String make, String model) {

    }

    public static void processGetVehiclesByYearRequest(String make, String model) {

    }

    public static void processGetVehiclesByColorRequest(String color) {

    }

    public static void processGetVehiclesByMileageRequest(double min, double max) {

    }

    public static void processGetVehiclesByTypeRequest(String vehicleType) {

    }

    public static void processGetAllVehiclesRequest(double min, double max) {
        //Is this necessary or will the return inventory suffice???
        /*for (Vehicle vehicle : inventory) {
            //inventory.get(vehicle); no
            System.out.println(vehicle);
        }*/
    }

    public static void processAddVehicleRequest(Vehicle vehicle) {
        //inventory.add(vehicle);
    }

    public static void processRemoveVehicleRequest(Vehicle vehicle) {
        //inventory.remove(vehicle);
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

    public void setVINNumber(int VINNumber) {
        this.VINNumber = VINNumber;
    }

    public int getVINNumber() {
        return VINNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "----------------------------" +
                "\nVIN #: " + VINNumber +
                "\nYear: " + year +
                "\nMake: " + make +
                "\nModel: " + model +
                "\nVehicle Type: " + vehicleType +
                "\nColor: " + color +
                "\nOdometer: " + odometer +
                String.format("\nPrice: $%,.2f", price);
    }
}

