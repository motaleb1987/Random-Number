package randomNumber;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        System.out.println("Random Number for: 0 to 10");
        Random rand=new Random();
        int randomNumber=rand.nextInt(10);
        System.out.println(randomNumber);

        System.out.println("Random Number for: 1 to 10");
        int randNum=rand.nextInt(10)+1;
        System.out.println(randNum);


        System.out.println("Random Number for: 5 to 10");
        int randNum2=rand.nextInt(6)+5;
        System.out.println(randNum2);

        // Another Way
        System.out.println("Another Way for Random Number: 1 to 10 ");
        int random_number= (int) (Math.random()*10)+1;
        System.out.println(random_number);


    }
}
