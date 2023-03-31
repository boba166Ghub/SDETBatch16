package HomeworkClass2;

public class Variables {
    public static void main(String[] args) {
        String firstName="John";
        String lastName="Jackson";
        char grade='A';
        String city="Miami";
        String state="Florida";
        String phoneNumber="+15613245621";

        System.out.println("My first name is " +firstName+ " and my last name is "  +lastName );
        System.out.println("I am " +grade+ " student");
        System.out.println("I live in " +city+ " " +state);
        System.out.println("My phone number is " +phoneNumber);

        city="Atlanta";
        state="Georgia";
        phoneNumber="+14235672241";

        System.out.println("My first name is " +firstName+ " and my last name is "  +lastName+ " And i moved to " +city+ " " +state+ ". My new phone number is " +phoneNumber );
    }
}
