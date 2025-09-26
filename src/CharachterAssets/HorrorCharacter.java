package CharachterAssets;

public abstract class HorrorCharacter
    {
        Vulnerability[] vulnerabilities;

        private String name;
        private int health;

        public Vulnerability[] getVulnerabilities() {return vulnerabilities;}
        public void setVulnerabilities(Vulnerability[] vulnerabilities)
        {
            if (vulnerabilities != null)
                this.vulnerabilities = vulnerabilities;
        }

        public String getName() {return name;}
        public void setName(String name)
        {
            if(!name.isEmpty())
                this.name = name;
        }

        public int getHealth() {return health;}
        public void setHealth(int health)
        {
            if(health > 0)
                this.health = health;
        }

        public HorrorCharacter(String name, int health)
        {
            this.name = name;
            this.health = health;
        }

        public void attack(){}

        public void flee(){}
    }
