public abstract class Pet
{
    protected String name;
    protected int age;
    protected double weight; //in kg

    public Pet (String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }//end constructor

    abstract public String Speak(); // to be overridden in all child classes

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight;

        return output;
    }//end toString
}//end Pet
