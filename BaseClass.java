//Write a program to check which method access specifiers 
//are accessable outside the package by becoming sub class
package A62pack1;

public class BaseClass {

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}
