package one.digitalinnovation.Barbearia.repository;

import one.digitalinnovation.Barbearia.model.Barbeiro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BarbeiroRepository extends JpaRepository<Barbeiro,Long> {


  Optional<Barbeiro> status(boolean trabalha);


}
