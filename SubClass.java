//Write a program to check which method access specifiers 
//are accessable outside the package by becoming sub class
package As62pack2;

import A62pack1.BaseClass;

public class SubClass extends BaseClass {

    public static void main(String[] args) {
        SubClass obj = new SubClass();

        // Accessible
        obj.publicMethod();
        obj.protectedMethod();

        // Not accessible
        // obj.defaultMethod(); 
        // obj.privateMethod(); 
    }
}