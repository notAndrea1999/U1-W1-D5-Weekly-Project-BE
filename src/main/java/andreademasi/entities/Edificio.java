package andreademasi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Edificio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_id")
    private long buildingId;

    private String name;

    private String address;

    private String city;

    @OneToMany(mappedBy = "edificio")
    @ToString.Exclude
    private Set<Postazione> postazioneSet;

    public Edificio(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }
}

