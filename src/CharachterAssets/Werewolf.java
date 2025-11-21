package CharachterAssets;

public class Werewolf extends HorrorCharacter implements Transformable
{
    private boolean transformed;

    public boolean getTransformed(){return transformed;}
    public void setTransformed(boolean transformed) {this.transformed = transformed;}

    public Werewolf (String name, int health)
    {
        super(name, health);

        vulnerabilities = new Vulnerability[]{Vulnerability.silver};
        transformed = false;
    }

    /**Displays the attack action through the terminal, but if werewolf isn't transformed, it will not attack*/
    @Override
    public void attack()
    {
        if (transformed)
            System.out.println("Werewolf claws through one of its victims");
        else
            System.out.println("could not attack");
    }

    /**displays the flee action through the terminal*/
    @Override
    public void flee()
    {
        System.out.println("werewolf flees from the scene");
    }

    /**displays the transformation of the werewolf through the terminal*/
    @Override
    public void transform()
    {
        if (!transformed)
        {
            System.out.println("transformed into a werewolf");
            transformed = true;
        }
        else
            System.out.println("already transformed");
    }
}

