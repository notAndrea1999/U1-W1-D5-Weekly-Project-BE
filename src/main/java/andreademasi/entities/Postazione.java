package andreademasi.entities;

import andreademasi.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postazione_id")
    private long postazioneId;

    private String description;

    @Column(name = "tipo_postazione")
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    @Column(name = "max_number")
    private int maxNumber;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Edificio edificio;

    public Postazione(String description, TipoPostazione tipoPostazione, int maxNumber, Edificio edificio) {
        this.description = description;
        this.tipoPostazione = tipoPostazione;
        this.maxNumber = maxNumber;
        this.edificio = edificio;
    }
}
