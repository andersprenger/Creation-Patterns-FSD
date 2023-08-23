public class Personagem {
    private int visibilidade;
    private int poder;
    private int vidas;

    private Personagem(int visibilidade, int poder, int vidas) {
        this.visibilidade = visibilidade;
        this.poder = poder;
        this.vidas = vidas;
    }

    public static Personagem criarPersonagem(int visibilidade, int poder, int vidas) {
        return new Personagem(visibilidade, poder, vidas);
    }

    public static Personagem criarNormal() {
        return new Personagem(10, 50, 3);
    }

    public static Personagem criarPoderoso(int poder) {
        if (poder > 100)
            return new Personagem(10, 100, 10);
        else if (poder < 0)
            return new Personagem(10, 0, 10);
        return new Personagem(10, poder, 10);
    }

    public static Personagem criarSoturno(int visibilidade) {
        if (visibilidade > 100)
            return new Personagem(100, 50, 3);
        else if (visibilidade < 0)
            return new Personagem(0, 50, 3);
        return new Personagem(visibilidade, 50, 3);
    }
}
