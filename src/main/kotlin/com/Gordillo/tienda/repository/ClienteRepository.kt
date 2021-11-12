package com.Gordillo.tienda.repository

import com.Gordillo.tienda.model.Cliente

import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository:JpaRepository <Cliente,Long>{
    fun findById(id: Long?): Cliente?

}