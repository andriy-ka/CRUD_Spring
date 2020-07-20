package andriy.kachur.CRUDSpringBoot.service;

import andriy.kachur.CRUDSpringBoot.model.User;
import andriy.kachur.CRUDSpringBoot.repositories.UserReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserReposiroty userReposiroty;
    

    @Autowired
    public UserService(UserReposiroty userReposiroty) {
        this.userReposiroty = userReposiroty;
    }

    public User findById(Long id){
        return userReposiroty.getOne(id);
    }
    public List <User> findAll(){
        return userReposiroty.findAll();
    }
    public User saveUser(User user){
        return userReposiroty.save(user);
    }

    public void deleteById(Long id){
        userReposiroty.deleteById(id);
    }
}
