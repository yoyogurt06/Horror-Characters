import java.util.ArrayList;
import java.util.Scanner;

import CharachterAssets.HorrorCharacter;
import CharachterAssets.Vampire;
import CharachterAssets.Werewolf;
import CharachterAssets.Zombie;

public class Demo
{
    public static void main(String[] args)
    {
        final int DEFAULT_HEALTH_ZOMBIE = 75;
        final int DEFAULT_HEALTH_WEREWOLF = 100;
        final int DEFAULT_HEALTH_VAMPIRE = 150;

        int choice = 0;

        ArrayList<HorrorCharacter> characters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name:");
        String name = scanner.next();


        while (choice != 4)
        {
            System.out.println("please choose your character:\n" +
                    "1. Zombie\n"+"2. Werewolf\n"+"3. Vampire\n4. Quit");

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
                    break;
                case 3:
                    Vampire vampire = new Vampire(name,DEFAULT_HEALTH_VAMPIRE);
                case 4:
                    break;
                //end of switch
            }
            //end of while loop
        }
        // end of main
    }
    //end of class
}
