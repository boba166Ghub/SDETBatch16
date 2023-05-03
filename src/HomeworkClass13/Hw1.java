package HomeworkClass13;

public class Hw1 {
    //Create a String that will hold a sentence. Write a program to get
    // a new String without any spaces.

    public static void main(String[] args) {

        String sentence="Java is on Saturday and Sunday";
       String noSpaces=sentence.replace(" ","");
        System.out.println(noSpaces);

    }

}
