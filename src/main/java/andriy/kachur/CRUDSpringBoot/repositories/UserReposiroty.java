package andriy.kachur.CRUDSpringBoot.repositories;

import andriy.kachur.CRUDSpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserReposiroty extends JpaRepository<User, Long> {


}
