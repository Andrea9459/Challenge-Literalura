package com.literalura.appblibiloteca.service;

import com.literalura.appblibiloteca.entity.Libro;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.LongFunction;

public interface LibroService {

    List<Libro> findAlllibros();
    Optional<Libro> findLibroId(Long idLibro);

    Libro saveLibro(Libro libro);

    void updatelibro(Long idLibro, Libro libro);
    void deleteLibroById(Long idLibro);


}
