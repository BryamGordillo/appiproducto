package com.Gordillo.tienda.repository

import com.Gordillo.tienda.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ProductoRepository:JpaRepository <Producto,Long > {
    fun findById(id: Long?): Producto?

}