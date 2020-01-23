public class Lizard extends Pet
{
    private String species;

    public Lizard (String name, String species, int age, double weight)
    {
        super(name, age, weight);
        this.species = species;
    }//end constructor

    public String Speak()
    {
        return "Hissss";
    }//end Speak

    public String toString()
    {
        String output = super.toString() + "\nSpecies: " + species;

        return output;
    }//end toString
}//end Lizzard
