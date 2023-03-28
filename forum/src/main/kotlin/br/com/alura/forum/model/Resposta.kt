package br.com.alura.forum.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
data class Resposta(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val mensagem: String,
    @ManyToOne
    val autor: Usuario,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    @ManyToOne
    val topico: Topico,
    val solucao: Boolean
)
