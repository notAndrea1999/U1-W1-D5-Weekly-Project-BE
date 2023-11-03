package andreademasi.runner;

import andreademasi.dao.IEdificioDAO;
import andreademasi.dao.IPostazioneDAO;
import andreademasi.entities.Edificio;
import andreademasi.entities.Postazione;
import andreademasi.enums.TipoPostazione;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Random;

@Component
public class PostazioneRunner implements CommandLineRunner {
    @Autowired
    private IPostazioneDAO postazioneDAO;

    @Autowired
    private IEdificioDAO edificioDAO;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker(Locale.ITALY);
        for (int i = 0; i < 10; i++) {
            Random rndm = new Random();
            Edificio foundEdificio = edificioDAO.findById(rndm.nextInt(1, 11));
            Postazione postazione = new Postazione(faker.medical().symptoms(), TipoPostazione.getRandomPostazione(), rndm.nextInt(1, 25), foundEdificio);
            postazioneDAO.save(postazione);
        }
    }
}
