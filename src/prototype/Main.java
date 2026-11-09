package prototype;

public class Main {
    public static void main(String[] args) {
        Personagem pBase = new Personagem("Bardo Base", "Bardo", 1, 100, 15);

        System.out.println("=== Personagem Base ===");
        System.out.println(pBase.toString());

        System.out.println();

        System.out.println("=== Personagens Clonados ===");

        Personagem p1 = pBase.clone();
        p1.setNome("Robin");
        System.out.println(p1.toString());

        Personagem p2 = pBase.clone();
        p2.setNome("Thiago");
        System.out.println(p2.toString());

        Personagem p3 = pBase.clone();
        p3.setNome("Bia");
        System.out.println(p3.toString());
    }
}
