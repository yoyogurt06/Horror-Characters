package CharachterAssets;

public abstract class HorrorCharacter
    {
        /**List of vulnerability Enums */
        Vulnerability[] vulnerabilities;

        /**Name of creature*/
        private String name;

        /**Amount of Health an enum has*/
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

        /**This is an abstract method that is meant to be inherited*/
        public void attack(){}

        /**This is an abstract method that is meant to be inherited*/
        public void flee(){}
    }
