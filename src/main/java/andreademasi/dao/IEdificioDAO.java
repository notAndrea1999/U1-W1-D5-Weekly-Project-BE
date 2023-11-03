package andreademasi.dao;

import andreademasi.entities.Edificio;

import java.util.List;

public interface IEdificioDAO {
    public void save(Edificio edificio);

    public void findByIdAndUpdate(long id, Edificio edificio);

    public void findByIdAndDelete(long id);

    public Edificio findById(long id);

    public List<Edificio> findAll();
}

