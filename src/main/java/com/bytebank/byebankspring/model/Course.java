package com.bytebank.byebankspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
// @Entity: faz o mapeamento com o banco de dados
@Entity
// @Table(name = "cursos")
public class Course {
    // Id: chave primária
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @JsonProperty: transforma o objeto id para _id;
    @JsonProperty("_id")
    // @JsonIgnore: igonre o objeto
    // @JsonIgnore
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String category;
}
