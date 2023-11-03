package andreademasi.dao;

import andreademasi.entities.Postazione;
import andreademasi.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostazioneService implements IPostazioneDAO {
    @Autowired
    private PostazioneRepository postazioneRepo;

    @Override
    public void save(Postazione postazione) {
        postazioneRepo.save(postazione);
        log.info("La postazione con id " + postazione.getPostazioneId() + " e' stata salvata con successo");
    }

    @Override
    public void findByIdAndUpdate(long id, Postazione postazione) {

    }

    @Override
    public void findByIdAndDelete(long id) {
        Postazione foundPostazione = this.findById(id);
        postazioneRepo.delete(foundPostazione);
        log.info("La postazione con id " + id + " eliminata con successo!");

    }

    @Override
    public Postazione findById(long id) {
        return postazioneRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Postazione> findAll() {
        return postazioneRepo.findAll();
    }
}
