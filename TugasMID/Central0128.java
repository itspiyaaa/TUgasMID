interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0128 implements A,B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0128 obj = new Central0128();
        System.out.println("main");
        obj.aaa();
    }
}
