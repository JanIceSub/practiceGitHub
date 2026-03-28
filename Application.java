public class Application {
    public static void main(String[] args) {

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();

        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);

        System.out.println("Plugging in devices to the power outlet:\n");
        smartphoneAdapter.plugIn();
        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
    }
}
