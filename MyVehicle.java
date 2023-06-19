public class MyVehicle extends Product {

    private KeySwitch keySwitch;
    private Door door;
    private Trunk trunk;
    private Engine engine;
    private ECU ecu;
    private FuelTank fuelTank;


    public MyVehicle(String manufacturer, String model, KeySwitch keySwitch, Door door, Trunk trunk, Engine engine, ECU ecu, FuelTank fuelTank) {
        super(manufacturer, model);


        this.keySwitch = keySwitch;
        this.door = door;
        this.trunk = trunk;
        this.engine = engine;
        this.ecu = ecu;
        this.fuelTank = fuelTank;
    }

    public void startEngine() {
        keySwitch.setSwitchKey();
        ecu.time();
//        ecu.fuel();
    }

    public void openTheDoor() {
        door.openDoor();
    }

    public void openTrunk() {
        trunk.openTrunk();
    }

    public void printFuelType(){
        engine.putSomeFuel();
    }

    public void addSomeFuel(int fuelAdded){
        fuelTank.addFuel(fuelAdded);
    }

    public void useSomeFuel(double distance){
        fuelTank.fuelConsumption(distance);
    }

    public void rangeDist(){
        fuelTank.showRange();
    }


    @Override
    public String toString() {
        return "MyVehicle{" + super.toString() + "\n" +
                "keySwitch=" + keySwitch + "\n" +
                "door=" + door + "\n" +
                "trunk=" + trunk + "\n" +
                "engine=" + engine +"\n" +
                "ECU=" + ecu  +
                '}'+"\n"
                +"--------------------------------------------------"+"\n";
    }
}
