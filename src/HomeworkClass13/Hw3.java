package HomeworkClass13;

public class Hw3 {
    public static void main(String[] args) {
/*
Task2:
How would you check if String is name or not? aba=> true
Abbc => false
*/
        String name = "abA";
        name = name.toLowerCase();
        StringBuilder str = new StringBuilder(name);
        str.reverse();
        String namePal = str.toString();
        if (name.equals(namePal)) {
            boolean isTrue = true;
            System.out.println(isTrue);
        } else {
            System.out.println("false");
        }



    }
}





    


