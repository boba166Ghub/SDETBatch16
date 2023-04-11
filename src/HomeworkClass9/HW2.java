package HomeworkClass9;

public class HW2 {
    public static void main(String[] args) {

        //Create an array of names and store all names of your group. Then print
        // your name from that array. (use 2 different ways of creating an array).

        String[] names = {"Mike", "Josh", "Brenda", "Liza", "Sheela", "Slobodan"};
        System.out.println(names[5]);

        String[] namesNew = new String[6];
        namesNew[0] = "Mike";
        namesNew[1] = "Josh";
        namesNew[2] = "Brenda";
        namesNew[3] = "Liza";
        namesNew[4] = "Sheela";
        namesNew[5] = "Slobodan";
        System.out.println(namesNew[5]);


    }
}
