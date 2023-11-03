package andreademasi.runner;

import andreademasi.dao.IEdificioDAO;
import andreademasi.entities.Edificio;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.function.Supplier;

@Component
public class EdificioRunner implements CommandLineRunner {
    @Autowired
    private IEdificioDAO edificioDAO;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker(Locale.ITALY);
        Supplier<Edificio> edificioSupplier = () -> new Edificio(faker.ancient().titan(), faker.address().fullAddress(), faker.address().city());
//        for (int i = 0; i < 10; i++) {
//            edificioDAO.save(edificioSupplier.get());
//        }
    }
}
