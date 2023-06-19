import java.util.*;

public class Main {


    public static void main(String[] args) {


        Product product = new Product("Ford", "Mustang");
        theProduct(product, "sport", 300, "petrol");


        KeySwitch keySwitch = new KeySwitch("Bosch", "BSCH", true);
        Door door = new Door("Romcat", "B203", false);
        Trunk trunk = new Trunk("Romcat", "OL301", false);
        Engine engine = new Engine("Ford", "2.3EcoBoost", "petrol", "inline");
        ECU ecu = new ECU("Sunwoda", "ECU23");
        FuelTank fuelTank = new FuelTank("Atlas", "ABS105", 7);


        MyVehicle newMustang = new MyVehicle("Ford", "Mustang", keySwitch, door, trunk, engine, ecu, fuelTank);
        System.out.println(newMustang);
        newMustang.printFuelType();


        newMustang.startEngine();
//        newMustang.openTheDoor();
//        newMustang.openTrunk();
//        multimedia();
//        userInput("phone");
        newMustang.useSomeFuel(500);
        newMustang.rangeDist();
        System.out.println("==========================");
        newMustang.useSomeFuel(200);
        newMustang.rangeDist();
        System.out.println("==========================");
        newMustang.addSomeFuel(10);
        newMustang.useSomeFuel(150);
        newMustang.rangeDist();
        System.out.println("==========================");
        newMustang.addSomeFuel(9);
        newMustang.rangeDist();



    }

    public static void theProduct(Product product, String usage, int horsePower, String fuel) {
        product.vehicleUsage(usage);
//        product.power(horsePower);
        product.juice(fuel);
        System.out.println(product);
        System.out.println("--------------------------------------------------");
    }

    public static void multimedia() {
        ArrayList<String> control = new ArrayList<>();
        control.add("Radio");
        control.add("Phone");
        control.add("Vehicle");
        System.out.println("Vehicle multimedia controls: " + control);
    }

    public static void userInput(String input) {
        switch (input.toLowerCase()) {
            case "radio" -> System.out.println("Kiss FM, Trinitas, Vibe FM, Virgin Radio, Europa FM");
            case "phone" -> {
                int min = 10000000;
                int max = 100000000;
//                int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println("Recent phone calls: ");
                System.out.println("(+40) 7" + (int) Math.floor(Math.random() * (max - min + 1) + min));
                System.out.println("(+40) 7" + (int) Math.floor(Math.random() * (max - min + 1) + min));
                System.out.println("(+40) 7" + (int) Math.floor(Math.random() * (max - min + 1) + min));
                System.out.println("(+40) 7" + (int) Math.floor(Math.random() * (max - min + 1) + min));
                System.out.println("(+40) 7" + (int) Math.floor(Math.random() * (max - min + 1) + min));
                System.out.println("(+40) 7" + (int) Math.floor(Math.random() * (max - min + 1) + min));
            }
            case "vehicle" -> System.out.println("tyre pressure, dashboard lights");
            default -> {
            }
        }
    }
}