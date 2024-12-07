package AS63pack2;

import AS63.AccessSpecifierDemo;

public class TestAccessSpecifiers {

    public static void main(String[] args) {
        AccessSpecifierDemo obj = new AccessSpecifierDemo();

        // Accessing methods from another package
        obj.publicMethod(); // Allowed
        // obj.protectedMethod(); // Not allowed
        // obj.defaultMethod(); // Not allowed
        // obj.privateMethod(); // Not allowed
    }
}