import java.text.DecimalFormat; //to format the weight in pounds
public abstract class Pet
{
    //Instance variables
    protected String name;
    protected int age;
    protected double weight; //in kg
    DecimalFormat fmt = new DecimalFormat("#.#"); //create formatting object

    //Constructors
    public Pet (String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }//end constructor for child classes

    //Getters
    public String getName()
    {
        return name;
    }//end name Getter

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }//end name setter

    //Brain Methods
    abstract public String Speak(); // to be overridden in all child classes

    public double AmericanFreedomUnits()
    {
        return weight *2.205;
    }//end method to convert weight into pounds
    //toString
    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight + " kg" +
                " (" + fmt.format(AmericanFreedomUnits()) + " in pounds)";

        return output;
    }//end toString
}//end Pet, abstract
