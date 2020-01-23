public class Lizard extends Pet
{
    private String species;

    public Lizard (String name, String species, int age, double weight)
    {
        super(name, age, weight);
        this.species = species;
    }//end constructor

    public String toString()
    {
        String output = super.toString() + "\nSpecies: " + species;

        return output;
    }//end toString
}//end Lizzard
