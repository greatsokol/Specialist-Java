package day2_2_exception;

import javax.naming.directory.InvalidAttributesException;

public class Day2_2_Exception {

    public static void main(String[] args) {
        try {
            throw new MyException(42);
        } catch (MyException ex) {
            ex.printStackTrace();
        }

        try {
            throw new MyException(42, "My exception: Reloaded cstr");
        } catch (MyException ex) {
            ex.printStackTrace();
        }

        try {
            throw new MyException(42, "My exception: With cause", new InvalidAttributesException());
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }

}
