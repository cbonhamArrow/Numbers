// Using only what you’ve learned so far in this course, create a class that contains 10
//lowercase names and has a method that can be called 10 separate times, each time,
//returning the next name. If the method is called “next()”, the first time it’s called, it returns
//“name1”, the second time “next()” is called, it returns “name2”, etc.
//3.1: Make the next() method capitalize the first letter of each name as it outputs them.

public class Exercise3 {

    String[] names = {"name1","name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9", "name10"};
    int counter = 0;

    public String next() {
        String currentName = names[counter];
        counter++;
        currentName = currentName.substring(0,1).toUpperCase() + currentName.substring(1);
        return  currentName;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Exercise3() {
    }

    public static void main(String[] args) {
        Exercise3 hola = new Exercise3();
        System.out.println(hola.next());
        System.out.println(hola.next());
        System.out.println(hola.next());
        System.out.println(hola.next());
        System.out.println(hola.next());
    }
}
