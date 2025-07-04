package com.javarafael.cadastro.usuario.infrstruture.entitys;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.IdGeneratorType;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "email" , unique = true)
    private String email;
}
