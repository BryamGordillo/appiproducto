package com.Gordillo.tienda.service

import com.Gordillo.tienda.model.Cliente
import com.Gordillo.tienda.model.Producto

import com.Gordillo.tienda.repository.ClienteRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ClienteService {

    @Autowired
    lateinit var clienteRepository: ClienteRepository


    fun list(): List<Cliente> {
        return clienteRepository.findAll()
    }

    fun save (cliente: Cliente): Cliente {
        return clienteRepository.save(cliente)
    }

    fun update(cliente: Cliente): Cliente {
        return clienteRepository.save(cliente)

    }

    fun updateDescription (cliente: Cliente): Cliente {
        val response = clienteRepository.findById(cliente.id)
            ?: throw Exception()
        response.apply {
            this.description= cliente.description
        }
        return clienteRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        clienteRepository.deleteById(id)
        return true
    }
}