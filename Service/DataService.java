package Seminar5HW.Service;




import Seminar5HW.Model.User;

import java.util.List;

public interface DataService {
    User create(User user);

    List<User> read();
}

