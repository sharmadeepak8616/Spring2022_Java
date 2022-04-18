package Class16.Interface_Pkg.CarInterface_Example;

public class TeslaFactory implements CarGuidelines, EnvGuidelines {

    public void addSteeringWheel() {
        System.out.println("Rectangular steering wheel added");
    }

    public void addEngine() {
        System.out.println("Battery operated Car engine added");
    }

    public void addTruck() {
        System.out.println("Truck space in front and back added");
    }

    public void addBlindSpotIndicator() {
        System.out.println("Blind spot indicator with camera added");
    }

    public void addTyres() {
        System.out.println("Add season tyres added");
    }

    public void zeroEmission() {
        System.out.println("zero emission cars");
    }

    public void usingElectricOrHydrogen() {
        System.out.println("Battery added to run car");
    }
}
