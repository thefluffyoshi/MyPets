public class Lizard extends Pet
{
    private String species;

    public Lizard (String name, boolean hasOwner, String species, int age, double weight, String food)
    {
        super(name, hasOwner, age, weight, food);
        this.species = species;
    }//end constructor

    public String Speak()
    {
        return "Hissss";
    }//end Speak

    public int monthlyFeeding()
    {
        return 10;
    }

    public String toString()
    {
        String output = super.toString() + "\nSpecies: " + species;

        return output;
    }//end toString
}//end Lizzard
