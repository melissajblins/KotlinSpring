package br.com.alura.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class NovoTopicoForm(
   @field: NotEmpty (message = "Mensagem precisa ser preenchida")
   @field:Size(min = 5, max = 100, message = "Mensagem deve ter entre 5 e 100 caracteres")
   val titulo: String,
   @field: NotEmpty(message = "Mensagem precisa ser preenchida")
   val mensagem: String,
   @field: NotNull val idCurso: Long,
   @field: NotNull val idAutor: Long
)

