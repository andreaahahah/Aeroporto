package repositories;

import entities.Passeggero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PasseggeroRepository extends JpaRepository<Passeggero,String> {
    Optional<Passeggero> findByEmailAndPassword(String email, String password);
}
