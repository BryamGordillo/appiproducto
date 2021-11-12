package com.Gordillo.tienda.service
import com.Gordillo.tienda.model.Producto
import com.Gordillo.tienda.repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductoService {
    @Autowired
    lateinit var productoRepository: ProductoRepository


    fun list(): List<Producto> {
        return productoRepository.findAll()
    }

    fun save (producto: Producto):Producto {
        return productoRepository.save(producto)
    }

    fun update(producto: Producto): Producto {
        return productoRepository.save(producto)

    }

    fun updateDescription (producto: Producto):Producto {
        val response = productoRepository.findById(producto.id)
            ?: throw Exception()
        response.apply {
            this.description= producto.description
        }
        return productoRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        productoRepository.deleteById(id)
        return true
    }

}