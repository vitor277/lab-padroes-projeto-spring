package one.digitalinovation.gof.model.repository;

import one.digitalinovation.gof.model.Livro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Long>{
}
