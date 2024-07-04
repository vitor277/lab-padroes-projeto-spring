package one.digitalinovation.gof.service.imp;

import one.digitalinovation.gof.model.Livro;
import one.digitalinovation.gof.model.repository.LivroRepository;
import one.digitalinovation.gof.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroServiceImp implements LivroService {

    @Autowired
    LivroRepository livroRepository;

    @Override
    public Iterable<Livro> buscarTodos() {
        return livroRepository.findAll();
    }

    @Override
    public Livro buscarPorId(Long id) {
        Optional<Livro> livro = livroRepository.findById(id);
        return livro.get();
    }

    @Override
    public void inserir(Livro livro) {
        livroRepository.save(livro);

    }

    @Override
    public void atualizar(Long id, Livro livro) {
        Optional<Livro> livroBd = livroRepository.findById(id);
        if (livroBd.isPresent()) {
            livroRepository.save(livro);
        }


    }

    @Override
    public void deletar(Long id) {
        livroRepository.deleteById(id);
    }
}
