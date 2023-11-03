package andreademasi.dao;

import andreademasi.entities.Postazione;

import java.util.List;

public interface IPostazioneDAO {
    public void save(Postazione postazione);

    public void findByIdAndUpdate(long id, Postazione postazione);

    public void findByIdAndDelete(long id);

    public Postazione findById(long id);

    public List<Postazione> findAll();
}
