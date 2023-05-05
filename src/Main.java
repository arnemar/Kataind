import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PasswordValidation validation = new PasswordValidation();
        List<String> errors = validation.Validation("Bjj8@M13");
        if (validation.isValid()){
            System.out.println("Password is valid.");
        }
        else {
            for(String error : errors){
                System.out.println(error);
            }
        }
    }
}