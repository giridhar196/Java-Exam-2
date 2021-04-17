package Question4;

/**
 *
 * @author Giridhar Addagalla
 */
public class PlantDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        //polymorphic substitution
        Plants fruit_plants;
        fruit_plants = new Fruit_Plants("Mango", "Summer", "Green");
        //late binding polymorphism
        System.out.println(fruit_plants.toString());
        Plants flower_plants = new Flower_Plants("Marigold", "Yellow", "5 days", "Summer", "Green");
        // Late binding polymorphism
        System.out.println(flower_plants.toString());
    }

}
