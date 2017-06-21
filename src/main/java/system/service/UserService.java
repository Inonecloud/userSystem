package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;

import java.util.List;

/**
 * Created by Andrew on 21.06.2017.
 */
@Service
public class UserService {

    @Autowired
    public UserDao userDao;

    public List getAllUsers(){
        return userDao.getAllUsers();
    }

}
