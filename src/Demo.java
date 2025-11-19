import java.util.ArrayList;
import java.util.Scanner;

import CharachterAssets.*;

public class Demo
{
    public static void main(String[] args)
    {
        final int DEFAULT_HEALTH_ZOMBIE = 75;
        final int DEFAULT_HEALTH_WEREWOLF = 100;
        final int DEFAULT_HEALTH_VAMPIRE = 150;

        int choice = 0;

        ArrayList<HorrorCharacter> characters = new ArrayList<>();
        ArrayList<Transformable> transformableCharacters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name:");
        String name = scanner.next();


        while (choice != 6)
        {
            System.out.println("please choose your action:\n" +
                    "1. Zombie\n"+"2. Werewolf\n"+"3. Vampire\n4. view Characters\n5. view Transformable characters" +
                    "\n6. quit");

            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    Zombie zombie = new Zombie(name,DEFAULT_HEALTH_ZOMBIE);
                    characters.add(zombie);
                    int zombieAction = 0;

                    while (zombieAction != 2)
                    {
                        System.out.println("choose what you want to do as a zombie:\n" +
                                "1. attack\n2.flee");
                        zombieAction = scanner.nextInt();

                        if (zombieAction == 1)
                            zombie.attack();
                        else
                            zombie.flee();
                    }
                    break;
                case 2:
                    Werewolf werewolf = new Werewolf(name,DEFAULT_HEALTH_WEREWOLF);
                    characters.add(werewolf);
                    transformableCharacters.add(werewolf);
                    int wolfAction = 0;

                    while (wolfAction != 3)
                    {
                        System.out.println("choose what you want to do as a werewolf:\n" +
                                "1. transform\n2. attack\n3. flee");
                        wolfAction = scanner.nextInt();

                        if (wolfAction == 1)
                            werewolf.transform();
                        else if (wolfAction == 2)
                            werewolf.attack();
                        else
                            werewolf.flee();
                    }
                    break;
                case 3:
                    Vampire vampire = new Vampire(name,DEFAULT_HEALTH_VAMPIRE);
                    characters.add(vampire);
                    transformableCharacters.add(vampire);
                    int vampAction = 0;

                    while (vampAction != 3)
                    {
                        System.out.println("choose what you want to do as a werewolf:\n" +
                                "1. transform\n2. attack\n3. flee");
                        vampAction = scanner.nextInt();

                        if (vampAction == 1)
                            vampire.transform();
                        else if (vampAction == 2)
                            vampire.attack();
                        else
                            vampire.flee();
                    }
                    break;
                case 4:
                    System.out.println("showing general character array");
                    for (HorrorCharacter character :characters)
                    {
                        System.out.println(character.getName()+character.getHealth());
                    }
                    break;
                case 5:
                    for (Transformable character: transformableCharacters)
                    {
                        character.transform();
                    }
                    break;
                case 6:
                    System.out.println("You quit the program");
                    break;
                //end of switch
            }
            //end of while loop
        }
        // end of main
    }
    //end of class
}
