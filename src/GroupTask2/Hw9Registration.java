package GroupTask2;
/*
Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.

 */

public class Hw9Registration {
    private String email;
    private String userName;
    private  String password;

    public Hw9Registration(String email,String userName,String password){
        this.email=email;
        this.userName=userName;
        this.password=password;
    }

    public void setEmail(String email){
        if(email.contains("@yahoo.com")){
            this.email=email;
            System.out.println("Valid email");
        }else{
            System.out.println("Yahoo email only accepted");
        }
    }
    public void setUserName(String userName){
        if(userName.length()>6){
            System.out.println("User name must be more than 6 characters");
        }else if(userName.isEmpty()){
            System.out.println("Username cant be empty");
        }else{
            this.userName=userName;
            System.out.println("Valid username");
        }
    }
    public void setPassword(String password){
        if(password.length()<6){
            System.out.println("Password must be more than 6 characters");
        }else if(password.isEmpty()){
            System.out.println("Password cant be empty");
        }else{
            this.password=password;
            System.out.println("Valid password");
        }
    }

    public static void main(String[] args) {

 Hw9Registration registration=new Hw9Registration("bob@yahoo.com","bob1234","pass11word");

 registration.setEmail("bob@yahoo.com");
 registration.setUserName("bob");

registration.setPassword("passw111ord123");


    }
}
