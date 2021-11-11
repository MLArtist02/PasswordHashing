package passwordhashingexample;

import org.mindrot.jbcrypt.BCrypt;

/*
Simple password hashing example
*/

public class PasswordHashingExample {

    public static void main(String[] args) {
       
        String password = "Test1234";
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        String passwordAttempt = "Test1235";
        
        System.out.println("Password = " + password);
        System.out.println("Hash Password = " + hashed);
        System.out.println("Password Attempt = " + passwordAttempt);        
        
        if (BCrypt.checkpw(passwordAttempt, hashed))
            System.out.println("Correct password");
        else
            System.out.println("Wrong password");
        
    }
    
}
