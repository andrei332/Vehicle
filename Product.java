import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {

    private String manufacturer;
    private String model;


    public Product(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void vehicleUsage(String usage) {
        System.out.println(model + " it's a " + usage + " vehicle");
    }

//    public void power(int horsePower) {
//        System.out.println("It has a " + horsePower + " hp " + engine + " engine");
//    }

    public void juice(String fuel) {
        System.out.println("It runs on " + fuel);
    }
}

class KeySwitch extends Product {

    private boolean switchKey;

    public KeySwitch(String manufacturer, String model, boolean switchKey) {
        super(manufacturer, model);
        this.switchKey = switchKey;
    }


    public void setSwitchKey() {
        if (this.switchKey) {
            System.out.println("Ignition on, engine running");
        } else {
            System.out.println("The mustang sleeps");
        }
    }
}

class Door extends Product {
    private final boolean door;

    public Door(String manufacturer, String model, boolean door) {
        super(manufacturer, model);
        this.door = door;
    }

    public void openDoor() {
        if (this.door) {
            System.out.println("Door opened,interior lights are on");
        } else {
            System.out.println("Door closed, interior lights off!");
        }
    }
}

class Trunk extends Product {

    private final boolean trunk;

    public Trunk(String manufacturer, String model, boolean trunk) {
        super(manufacturer, model);

        this.trunk = trunk;
    }


    public void openTrunk() {
        if (this.trunk) {
            System.out.println("Trunk opened");
        }
    }
}

class ECU extends Product {

    public ECU(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void time() {
        LocalDateTime localTime = LocalDateTime.now();
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = localTime.format(formatDateTime);
        System.out.println("==========================");
        System.out.println("== " + formattedDate + " ==");
        System.out.println("=========================="+'\n');
    }

//    public void fuel() {
//        System.out.println("======== Fuel 2/2 ========"+"\n");
//    }
}

class Engine extends Product {
    private String fuelType;
    private String engine;

    public Engine(String manufacturer, String model, String fuelType, String engine) {
        super(manufacturer, model);
        this.fuelType = fuelType;
        this.engine = engine;
    }

    public void putSomeFuel() {
        System.out.println("This vehicle runs on " + fuelType);
    }
}

class FuelTank extends Product {
    private double tankSize;
    private double range;
    private int mediumConsumption;

    public FuelTank(String manufacturer, String model, int mediumConsumption) {
        super(manufacturer, model);
        this.tankSize = 50;
        this.mediumConsumption = mediumConsumption;
    }

    protected double addFuel(int fuelAmount) {
        if (fuelAmount > 0 && fuelAmount <= 50) {
            if (this.tankSize + fuelAmount > 50) {
                this.tankSize = 50;
                System.out.println(fuelAmount + " liters added");
//                System.out.println("The tank has now " + this.tankSize + " liters added");
                return tankSize;
            }else {
                this.tankSize += fuelAmount;
                System.out.println("Fuel tank has now " + this.tankSize + " liters");
                return this.tankSize;
            }
        } else {
            return -1;
        }
    }

    public double fuelConsumption(double distance){
        double consumption = (distance * this.mediumConsumption)/100;
        double remained = this.tankSize - consumption;
        this.tankSize = remained;
        System.out.println("On the distance of " + distance + " km you used " + consumption + " liters");
        System.out.println("You now have " + remained + " liters in the tank");
        return remained;
    }

    public double showRange(){
        this.range = (this.tankSize/mediumConsumption)*100;
        System.out.println("You can still go " + String.format("%,.2f",this.range) + " km");
        return this.range;
    }
}


