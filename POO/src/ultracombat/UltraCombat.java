package ultracombat;

public class UltraCombat {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Luffy",
                "Japão",
                31,
                 1.75,
                68.9,
                11,
                2,
                1);
        lutador[1] = new Lutador("Zoro",
                "China",
                29,
                1.68,
                57.8,
                14,
                2,
                3);
        lutador[2] = new Lutador("Sanji",
                "EUA",
                35,
                1.65,
                80.9,
                12,
                2,
                1);
        lutador[3] = new Lutador("Chopper",
                "Austrália",
                28,
                1.93,
                81.6,
                13,
                0,
                2);
        lutador[4] = new Lutador("Ace",
                "Brasil",
                37,
                1.70,
                119.3,
                5,
                4,
                3);
        lutador[5] = new Lutador("Franky",
                "França",
                30,
                1.81,
                105.7,
                12,
                2,
                4);

        Luta combate = new Luta();
        combate.marcarLuta(lutador[4], lutador[4]);
        combate.lutar();

    }


}

