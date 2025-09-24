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

    @Override
    public void attack()
    {
        if (transformed)
            System.out.println("Werewolf claws through one of its victims");
    }

    @Override
    public void flee()
    {
        System.out.println("werewolf flees from the scene");
    }

    @Override
    public void transform()
    {
        transformed = true;
        System.out.println("transformed into a werewolf");
    }
}

