public class Cat extends Animal
{
    private int numLives;

    public Cat(String name, int numLives)
    {
        super(name, "feline");
        this.numLives = numLives;
    }

    public void matingCall()
    {
        System.out.println("meow");
    }

    public String toString()
    {
        return "A cat named " + super.getName();
    }
}
