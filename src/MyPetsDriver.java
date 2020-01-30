public class MyPetsDriver
{
    public static void main(String[] args)
    {
        Dog Rex = new Dog("Rex", true, "German Shepherd", 2, 160.2, "Kibble");
        Lizard Mochi = new Lizard("Mochi",true, "Blue-Tongued Skink", 8, 2, "Cricket");
        Bunny Apple = new Bunny("Apple", true, "Mini Lop", 3, 5, "Pellets");
        //Pet Chris = new Pet("Chris", 15, 15.0); Pet is abstract class and cannot be instantiated

        System.out.println(Rex);
        System.out.println("Monthly Feeding: " + Rex.monthlyFeeding());
        System.out.println(Mochi);
        System.out.println("Monthly Feeding: "+ Mochi.monthlyFeeding());
        System.out.println(Apple);
        System.out.println("Monthly Feeding: " + Apple.monthlyFeeding());

//        System.out.println(Rex.fetch()); //only works when Rex is a dog, NOT when rex is a pet
                //early binding ^
//        System.out.println(Rex.Speak()); //dependent on what type Rex, Dog vs Pet
                //late binding ^

//        int[] arrayOfInts = new int[5]; //example of how to instantiate an array
//        Pet[] menagerie = new Pet[5]; //starting to create an array of pets
//        menagerie[0] = Rex;
//        menagerie[1] = Mochi;
//        menagerie[2] = Apple;
//
//        for (int i = 0; i < menagerie.length; i++)
//        {
//            System.out.println(menagerie[i]);
//        }

        //Speaking to Pets
//        System.out.println("Rex says: " + Rex.Speak());
//        System.out.println("Mochi says: " + Mochi.Speak());
//        System.out.println("Apple says: " + Apple.Speak());

//        System.out.println("Rex's weight in pounds is " + Rex.AmericanFreedomUnits() + ". \n");

        //Testing Pets
//        System.out.println(Rex);
//        System.out.print(Mochi);
//        System.out.print(Apple);
    }
}//end driver
