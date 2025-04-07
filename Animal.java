public class Animal
{
    private String name;
    private String species;

    public String getName()
    {
        return name;
    }

    public String getSpecies()
    {
        return species;
    }

    public Animal(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

    public Animal()
    {
        this.name = null;
        this.species = null;
    }

    public void matingCall();
    {
        System.out.println("generic sound");
    }

    public String toString()
    {
        return "A" + species + " named " + name;
    }
}