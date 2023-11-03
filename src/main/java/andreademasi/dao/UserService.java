package andreademasi.dao;

import andreademasi.entities.User;
import andreademasi.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService implements IUserDAO {

    @Autowired
    private UserRepository userRepo;


    @Override
    public void save(User user) {
        userRepo.save(user);
        log.info(user.getFullName() + " salvato correttamente!");
    }

    @Override
    public void findByIdAndUpdate(long id, User user) {

    }

    @Override
    public void findByIdAndDelete(long id) {
        User foundUser = this.findById(id);
        userRepo.delete(foundUser);
        log.info("User con id " + id + " eliminato con successo!");
    }


    @Override
    public User findById(long id) {
        return userRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
