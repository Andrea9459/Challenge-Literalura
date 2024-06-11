package com.literalura.appblibiloteca.controller;

import com.literalura.appblibiloteca.entity.Libro;
import org.springframework.ui.Model;
import com.literalura.appblibiloteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/")
    public String listarTodosLosLibros(Model model){
        model.addAttribute("libros", libroService.findAlllibros());
        return "/listaLibros";
    }

    @GetMapping("/nuevoLibro")
    public String registrarNuevoLibro(){
        return "/registrarLibro";
    }

    @PostMapping("/guardarLibro")
    public String guardarLibro(Libro libro){
        libroService.saveLibro(libro);
        return "redirect:/";
    }
    @GetMapping("/editarLibro/{id}")
    public String editarLibro(@PathVariable Long id, Model model){
        Libro libro = libroService.findLibroId(id).get();
        model.addAttribute("libro", libro);
        return "/editarLibro";
    }
    @PostMapping("/actualizarLibro")
    public String actualizarLibro(@RequestParam("idLibro") Long id, Libro libro){
        return "redirect:/";
    }
    @GetMapping("/eliminarLibro/{id}")
    public String eliminarLibro(@PathVariable Long id){
        libroService.deleteLibroById(id);
        return "redirect:/";
    }
}
