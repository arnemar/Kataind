import java.util.ArrayList;
import java.util.List;

public class PasswordValidation {

    private List<String> errors = new ArrayList<String>();
    public List<String> Validation(String password){
        if (password.length() < 8) {
            errors.add("Password must be at least 8 characters");
        }
        int numCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                numCount++;
            }
        }
        if (numCount < 2) {
            errors.add("The password must contain at least 2 numbers");
        }
        if (!password.matches(".*[A-Z].*")) {
            errors.add("Password must contain at least one capital letter");
        }
        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            errors.add("Password must contain at least one special character");
        }
        return errors;
    }


    public boolean isValid() {
        return errors.isEmpty();
    }

}
