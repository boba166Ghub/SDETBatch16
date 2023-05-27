package GroupTask2;
/*
Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH"
 */
public class Hw1ReverseString {

//1st method
    public static String reverseStr(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str);
    return sb.reverse().toString();
    }



//2nd method
    public static String reverseStr1(String str1){

String str2="";
        for (int i = str1.length()-1; i >=0 ; i--) {
            str2+=str1.charAt(i) ;

        }
    return str2;
    }


    public static void main(String[] args) {

        System.out.println(reverseStr("Hello"));

        String result1=reverseStr1("Hello");
        System.out.println(result1);


    }
}


