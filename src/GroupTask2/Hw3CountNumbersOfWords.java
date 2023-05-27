package GroupTask2;
/*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.

 */
public class Hw3CountNumbersOfWords {
    public static int count(String str){
        String[] arr=str.split("[\\p{Punct}\\s]+");
        return arr.length;




    }

    public static void main(String[] args) {

        System.out.println(count("Hello, world!"));

    }
}
