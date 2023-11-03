package andreademasi.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.Locale;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder(builderClassName = "")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private long userId;

    private String username;

    private String fullName;

    private String email;

    public static class UserBuilder {
        private Faker faker = new Faker(Locale.ITALY);

        private String username = faker.name().username();

        private String fullName = faker.name().fullName();

        private String email = faker.internet().emailAddress();

    }


}
