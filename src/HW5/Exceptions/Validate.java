package HW5.Exceptions;

public class Validate {
    public void checkPhone(String telephone) throws Exception {
        if (!telephone.startsWith("+")) {
            throw new PhoneException("Error! Number must start with '+7'.");
        } else if (telephone.length() != 12) {
            throw new PhoneException("Error! The length of number doesn't equal 11.");
        }
    }

    public void checkName(String name) throws Exception {
        for (char ch : name.toCharArray()) {
            if (Character.isDigit(ch) || ch == ' ') {
                throw new NameException("Error! Name and Surname can't contain numbers or spaces.");
            }
        }
    }
}
