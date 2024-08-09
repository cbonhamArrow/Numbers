//Make a method, next(), that can be called 10 times and generate a random integer between
//0 & 10 (non-inclusive). This method keep a running sum of all random numbers it generates
//and return that sum each time. If first time next() is called, it generates 5, and second time
//it’s called it generates 3, it should return 8 from the second call - for example.

import java.util.Random;

public class Exercise5 {

    int sum = 0;

    public int next() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        sum += randomNum;
        System.out.println("Random Number: " + randomNum);
        return sum;
    }

    public static void main(String[] args) {
        Exercise5 randomStuff = new Exercise5();
        for (int i = 0; i < 100; i++) {
            System.out.println(randomStuff.next());
        }
    }
}
