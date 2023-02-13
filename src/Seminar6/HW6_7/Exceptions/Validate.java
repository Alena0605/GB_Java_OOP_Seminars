package Seminar6.HW6_7.Exceptions;

public class Validate {
    public void checkInput(String text) throws Exception {
        if (text.isEmpty()) {
            throw new EmptyInput("The note can't be empty!");
        }
    }
}
