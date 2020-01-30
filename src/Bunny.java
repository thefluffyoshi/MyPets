public class Bunny extends Pet
{
    private String breed;
    public Bunny (String name, boolean hasOwner, String breed, int age, double weight, String food)
    {
        super(name, hasOwner, age, weight, food);
        this.breed = breed;
    }//end constructor with super

    public String Speak()
    {
        return "Purr";
    }

    public int monthlyFeeding()
    {
        return 15;
    }//override and determine number of feedings

    public String toString()
    {
        String output = super.toString() + "\nBreed: " + breed;
        return output;
    }
}//end Bunny
