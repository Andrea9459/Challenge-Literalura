package com.literalura.appblibiloteca.service;


import com.literalura.appblibiloteca.entity.Libro;
import com.literalura.appblibiloteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImplements implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> findAlllibros() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> findLibroId(Long idLibro) {
        return libroRepository.findById(idLibro);
    }

    @Override
    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void updatelibro(Long idLibro, Libro libro) {
        Libro libroBD = findLibroId(idLibro).get();
        libroBD.setTitulo(libro.getTitulo());
        libroBD.setAutor(libro.getAutor());
        libroBD.setIsbn(libro.getIsbn());
        libroRepository.save(libro);

    }

    @Override
    public void deleteLibroById(Long idLibro) {
        libroRepository.deleteById(idLibro);
    }
}
