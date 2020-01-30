public class Dog extends Pet
{
    private String breed;

    public Dog (String name, boolean hasOwner, String breed, int age, double weight, String food)
    {
        super(name, hasOwner, age, weight, food);
        this.breed = breed;
    }//end constructor, calling super

    public String fetch()
    {
        if (Math.random() >= 0.5)
            return "Fetch accomplished.";
        else
            return "Fetch failed and landed on the floor.";
    }//end method that exists in Dog only, NOT in Pet to demo polymorphism issue

    public String Speak()
    {
        if (this.age < 2)
            return "Yip";
        return "Woof";
    }//end Speak, overrides abstract method in Pet

    public int monthlyFeeding()
    {
        int dailyFeedings;
        if (super.getAge() < 6 )
        {
          dailyFeedings = 2;
        }//end if puppy
        else
        {
          dailyFeedings = 1;
        }//end else adult

        return dailyFeedings * 30;
    }//end monthlyFeeding, overrides Pet

    public String toString()
    {
        String output = super.toString() + "\nBreed: " + breed;
        return output;
    }//end toString, calling super
}//end class Dog
