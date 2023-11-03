package andreademasi.runner;

import andreademasi.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRunner implements CommandLineRunner {
    @Autowired
    private IUserDAO userDAO;

    @Override
    public void run(String... args) throws Exception {
//        for (int i = 0; i < 10; i++) {
//            User genericUser = User.builder().build();
//            userDAO.save(genericUser);
//        }
    }
}
