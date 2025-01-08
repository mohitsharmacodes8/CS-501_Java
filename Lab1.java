// String name = "Michelle";
// String name = new String("Michelle");
// both valid, both work

// var.length() var.toUpperCase() var.toLowerCase()

// var.equals("String") is better than "string1"=="string2" because strs are objects

// String Methods
//String.concat(strTwo); //adds contents of strTwo immediately after str

// returns char located at given index or "index out of range" error
// string.charAt(index);

// returns the index of the first occurence of the given character
// string.indexof(char);

//returns char(s) located from given indexOne up to but not including
// indexTwo
//string.substring(indexOne, indexTwo);

// returns char(s) starting at indexTwo through the end of the string
// string.substring(indexTwo);

// reurn an int length of the String, the no of characters
// string.length()

// primitives dont have flexibillity and that much functionality
// hence wrapper classes are useful
// also arraylist allow only wrapper not primitive
// functionality like-:
// Integer.parseInt(String value)
// the above tries to convert String to an int
// autoboxing- the process of a primitive automatically
// converting itself to the wrapper class and
// vice versa(utilises library fns)

// Math Class
// has static methods it means they can be invoked using the
// name of the class, rather than object derived from the class
// instead of having to do: Math m = new Math();
//                        : m.abs()
//
 //   we can just do      : Math.abs();
//
//
// Random Class
// import java.util.Random (in this class unlike math we create object)
// Random randomGenerator = new Random(); //create our own generator using it
// int testOne = randomGenerator.nextInt(100); //random number 0-99
// int testTwo = randomGenerator.nextInt(10)+90; // random number 90-99
// int testThree = randomGenerator.nextInt(size) + offset; // template to create ranges

import java.util.Random;

public class Main {
    public static Integer rollDice(){
        Random rand = new Random();
        return rand.nextInt(20)+1;
    }

    public static void main(String[] args) {
        Integer rollDiceOne, rollDiceTwo;
        rollDiceOne = rollDice();
        rollDiceTwo = rollDice();
        System.out.println(rollDiceOne + " is the first random number between 1 and 20");
        System.out.println(rollDiceTwo + " is the second random number between 1 and 20");

        // calculation session
        // first dice roll raise to power second roll
        Double firstRaiseToSecond = Math.pow(rollDiceOne, rollDiceTwo);
        Double sqrtrollDiceOne=Math.sqrt(rollDiceOne);
        Double sqrtrollDiceTwo=Math.sqrt(rollDiceTwo);
        // distance formula on two rolls
        Double result = Math.pow(rollDiceOne,2)+Math.pow(rollDiceTwo,2);
        result = Math.sqrt(result);

        Integer mini = Math.min(rollDiceOne, rollDiceTwo);
        Integer maxi = Math.max(rollDiceOne, rollDiceTwo);

        System.out.println("The first dice roll raise to power second dice roll is: "+firstRaiseToSecond);
        System.out.println("square root of first dice roll is: "+sqrtrollDiceOne);
        System.out.println("square root of second dice roll is: "+sqrtrollDiceTwo);
        System.out.println("The result of applying distance formula on first dice roll and second dice roll is: "+result);
        System.out.println("The minimum dice roll is: "+mini);
        System.out.println("The maximum dice roll is: "+maxi);




    }
}

