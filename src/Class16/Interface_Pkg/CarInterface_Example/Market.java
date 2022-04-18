package Class16.Interface_Pkg.CarInterface_Example;

public class Market {
    public static void main(String[] args) {

        CarGuidelines c1 = new TeslaFactory();
        c1.addSteeringWheel();

        c1 = new BMWFactory();
        c1.addSteeringWheel();


    }
}
