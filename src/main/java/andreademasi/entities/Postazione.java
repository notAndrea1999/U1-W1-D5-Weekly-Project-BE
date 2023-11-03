package andreademasi.entities;

import andreademasi.enums.TipoPostazione;
import jakarta.persistence.*;

@Entity
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postazione_id")
    private long postazioneId;

    private String description;
    @Column(name = "tipo_postazione")
    private TipoPostazione tipoPostazione;
    @Column(name = "max_number")
    private int maxNumber;

    private Edificio edificio;
}
