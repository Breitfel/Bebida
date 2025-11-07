import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// O JpaRepository recebe a Entidade (Bebida) e o tipo da chave primária (String)
public interface BebidaRepository extends JpaRepository<Bebida, String> {

    // Spring Data JPA já fornece findById(String id) por padrão, que é o que você precisa!

}