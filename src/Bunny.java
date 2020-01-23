public class Bunny extends Pet
{
    private String breed;
    public Bunny (String name, String breed, int age, double weight)
    {
        super(name, age, weight);
        this.breed = breed;
    }//end constructor with super

    public String toString()
    {
        String output = super.toString() + "\nBreed: " + breed;
        return output;
    }
}//end Bunny
