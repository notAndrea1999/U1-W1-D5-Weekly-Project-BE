package andreademasi.enums;

import java.util.Random;

public enum TipoPostazione {
    PRIVATO, OPEN_SPACE, SALA_RIUNIONI;

    public static TipoPostazione getRandomPostazione() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
