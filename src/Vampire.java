public class Vampire extends HorrorCharacter implements Transformable
{
    private boolean transformed;

    public boolean getTransformed(){return transformed;}
    public void setTransformed(boolean transformed) {this.transformed = transformed;}

    public Vampire(String name, int health)
    {
        super(name, health);

        vulnerabilities = new Vulnerability[]{Vulnerability.holy_water, Vulnerability.sunlight};
    }

    @Override
    public void attack()
    {
        if(transformed)
            System.out.println("vampire sinks it's teeth into it's victim");
    }

    @Override
    public void flee()
    {
        System.out.println("vampire flees from the scene");
    }

    @Override
    public void transform()
    {
        transformed = true;
        System.out.println("transformed into a vampire");
    }
}