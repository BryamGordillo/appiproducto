package com.Gordillo.tienda.controller

import com.Gordillo.tienda.model.Producto
import com.Gordillo.tienda.service.ProductoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/producto")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ProductoController {

    @Autowired
    lateinit var productoService: ProductoService

    @GetMapping
    fun list(): List<Producto>{
        return productoService.list()
    }

    @PostMapping
    fun save ( @RequestBody producto:Producto):Producto {
        return productoService.save(producto)
    }

    @PutMapping
    fun update(@RequestBody producto: Producto):Producto {
        return productoService.update(producto)
    }

    @PatchMapping
    fun updateDescription (@RequestBody producto: Producto):Producto {
        return productoService.updateDescription(producto)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return productoService.delete(id)
    }


}