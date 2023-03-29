/* Arsuci Fidyawati
* 13020210297
*/

interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0297 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0297 obj = new Central0297();
        System.out.println("main");
        obj.aaa();
    }
}