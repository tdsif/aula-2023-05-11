package br.edu.ifrs.riogrande.tads.cobaia.entity;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "alunos")
public class Aluno { // Java Bean
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // sequencial
  private Long id;

  @Column(length = 50, nullable = false)
  @JsonProperty("nomeCompleto") // body/endpoint
  private String nome;

  // Sem length considera 255
  @Column(length = 100, nullable = false, unique = true)
  private String email;


}
