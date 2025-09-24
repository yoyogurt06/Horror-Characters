package Charachters;

public class Zombie extends HorrorCharacter
{
    public Zombie(String name, int health)
    {
        super(name, health);

        vulnerabilities = new Vulnerability[]{Vulnerability.fire, Vulnerability.sunlight};
    }

    @Override
    public void attack()
    {
        System.out.println("zombie bites into the brains of its victim");
    }

    @Override
    public void flee()
    {
        System.out.println("zombie flees the scene");
    }
}
