package AS63;

public class AccessSpecifierDemo {

    public void publicMethod() {
        System.out.println("Public method accessed");
    }

    protected void protectedMethod() {
        System.out.println("Protected method accessed");
    }

    void defaultMethod() {
        System.out.println("Default method accessed");
    }

    private void privateMethod() {
        System.out.println("Private method accessed");
    }
}
