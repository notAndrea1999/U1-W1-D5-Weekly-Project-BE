package andreademasi.dao;

import andreademasi.entities.Edificio;
import andreademasi.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EdificioService implements IEdificioDAO {
    @Autowired
    private EdificioRepository edificioRepo;

    @Override
    public void save(Edificio edificio) {
        edificioRepo.save(edificio);
        log.info("L'edificio con nome " + edificio.getName() + " e' stato salvato con successo");

    }

    @Override
    public void findByIdAndUpdate(long id, Edificio edificio) {

    }

    @Override
    public void findByIdAndDelete(long id) {
        Edificio foundEdificio = this.findById(id);
        edificioRepo.delete(foundEdificio);
        log.info("L'edificio con id " + id + " eliminato con successo!");
    }

    @Override
    public Edificio findById(long id) {
        return edificioRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Edificio> findAll() {
        return edificioRepo.findAll();
    }
}
