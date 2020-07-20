package andriy.kachur.CRUDSpringBoot.model;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;


}
