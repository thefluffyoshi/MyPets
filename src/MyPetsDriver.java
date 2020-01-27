public class MyPetsDriver
{
    public static void main(String[] args)
    {
        Dog Rex = new Dog("Rex", "German Shepherd", 2, 160.2);
        Lizard Mochi = new Lizard("Mochi", "Blue-Tongued Skink", 8, 2);
        Bunny Apple = new Bunny("Apple", "Mini Lop", 3, 5);
        //Pet Chris = new Pet("Chris", 15, 15.0); Pet is abstract class and cannot be instantiated

        //Speaking to Pets
        System.out.println("Rex says: " + Rex.Speak());
        System.out.println("Mochi says: " + Mochi.Speak());
        System.out.println("Apple says: " + Apple.Speak());

        System.out.println("Rex's weight in pounds is " + Rex.AmericanFreedomUnits() + ". \n");

        //Testing Pets
        System.out.println(Rex);
//        System.out.print(Mochi);
//        System.out.print(Apple);
    }
}//end driver
