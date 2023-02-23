package ma.emsi.gestion_depense.SecuritePortail.repository;

import ma.emsi.gestion_depense.SecuritePortail.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
