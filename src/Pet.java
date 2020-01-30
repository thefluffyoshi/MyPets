import java.text.DecimalFormat; //to format the weight in pounds
public abstract class Pet
{
    //Instance variables
    protected String name;
    protected int age;
    protected double weight; //in kg
    protected boolean hasOwner;
    private final double LB_TO_KG = 0.454;
    public String food;
    DecimalFormat fmt = new DecimalFormat("#.#"); //create formatting object

    //Constructors
    public Pet (String name, boolean hasOwner, int age, double weight, String food)
    {
        this.name = name;
        this.hasOwner = hasOwner;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }//end constructor for child classes

    //Getters
    public String getName()
    {
        return name;
    }//end name Getter

    public int getAge()
    {
        return age;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }//end name setter

    //Brain Methods
    abstract public String Speak(); // to be overridden in all child classes
    abstract public int monthlyFeeding(); //to be overridden in child classes.

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
        output += "\nFood: " + food;

        return output;
    }//end toString
}//end Pet, abstract
