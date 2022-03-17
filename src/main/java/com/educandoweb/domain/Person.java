package com.educandoweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity //essa anotação indica que esta classe é uma tabela!
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue //indicando que é um id automaticamente gerado
    private Integer id;
    @Column(name = "nomecompleto") //renomeando a coluna da tabela
    @NonNull
    private String name;
    @NonNull
    private String email;
}
