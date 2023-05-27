package GroupTask2;
/*
Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.

 */

public class Hw2Palindrome {
    public static boolean Palindrome(String str){
        String reverse="";
        boolean palCheck=false;
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)){
            palCheck=true;
        }
    return palCheck;
    }


    public static boolean Palindrome1(String str1){
        StringBuilder sb=new StringBuilder();
        sb.append(str1);
        return sb.reverse().toString().equalsIgnoreCase(str1);
    }

    public static void main(String[] args) {


        boolean isPalindrome=Palindrome("madam");
        System.out.println(isPalindrome);

        boolean isPalindrome1= Palindrome1("madam");
        System.out.println(isPalindrome1);

    }

}
