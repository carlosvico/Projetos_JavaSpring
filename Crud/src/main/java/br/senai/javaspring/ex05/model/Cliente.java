package br.senai.javaspring.ex05.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    @NotNull
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // Estratégias de geração de chave primária
    private Long id;
    @NotBlank
    private String nome;
    @CPF
    @NotBlank
    private String cpf;
}
