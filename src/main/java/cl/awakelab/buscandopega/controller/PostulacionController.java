package cl.awakelab.buscandopega.controller;

import cl.awakelab.buscandopega.entity.Postulacion;
import cl.awakelab.buscandopega.service.IPostulacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/postulaciones")
public class PostulacionController {
    @Autowired
    IPostulacionService objPostulacionService;

    @GetMapping
    public String listarProductos(Model model){
        List<Postulacion>listarPostulacion = objPostulacionService.listarPostulaciones();
        model.addAttribute("atributoListarPostulaciones", listarPostulacion);
        return "templateBuscandoPega";
    }

    @PostMapping("/crear")
    public String crearProducto(@ModelAttribute Producto producto, Model model){
        List<Producto>listarProductos = objProductoService.listarProductos();
        model.addAttribute("atributoListarProductos", listarProductos);
        objProductoService.crearProducto(producto);
        return "redirect:/productos";
    }

    @PostMapping("editar/{id}")
    public String actualizarProducto(@PathVariable int id, @ModelAttribute Producto producto){
        objProductoService.actualizarProducto(id, producto);
        return "redirect:/productos";
    }

    @PostMapping("eliminar/{id}")
    public String eliminarPrducto(@PathVariable int id){
        objProductoService.eliminarProducto(id);
        return "redirect:/productos";
    }
}