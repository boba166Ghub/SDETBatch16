package HomeworkClass14;

public class Hw1 {
    /*
    Create a method that will say Hello in different language based on the
     country that will passed when method is executed.
     */
    void hello(String language) {
        switch (language) {
            case "English":
                System.out.println("Hello");
                break;
            case "German":
                System.out.println("Hallo");
                break;
            case "French":
                System.out.println("Bonjour");
                break;
            case "Swedish":
                System.out.println("Hallå");
                break;
            case "Japanese":
                System.out.println("Kon'nichiwa");
                break;
            default:
                System.out.println("Invalid input");

        }

    }

    public static void main(String[] args) {
        Hw1 obj = new Hw1();
        obj.hello("English");

    }
}
