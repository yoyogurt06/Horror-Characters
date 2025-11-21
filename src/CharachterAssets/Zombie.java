package CharachterAssets;

public class Zombie extends HorrorCharacter
{
    public Zombie(String name, int health)
    {
        super(name, health);

        vulnerabilities = new Vulnerability[]{Vulnerability.fire, Vulnerability.sunlight};
    }

    /**Displays the attack of the zombie through the terminal*/
    @Override
    public void attack()
    {
        System.out.println("zombie bites into the brains of its victim");
    }

    /**Displays the flee action of the zombie through the terminal*/
    @Override
    public void flee()
    {
        System.out.println("zombie flees the scene");
    }
}
