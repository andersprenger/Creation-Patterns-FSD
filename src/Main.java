public class Main {
    public static void main(String[] args) {
        // Instanciando objetos da classe Personagem
        Personagem protagonista = Personagem.criarPoderoso(100);
        Personagem antagonista = Personagem.criarSoturno(100);
        Personagem normal = Personagem.criarNormal();
        Personagem god = Personagem.criarPersonagem(100, 100, 100);

        // Printando os objetos
        System.out.println(protagonista + "\n");
        System.out.println(antagonista + "\n");
        System.out.println(normal + "\n");
        System.out.println(god + "\n");
    }
}