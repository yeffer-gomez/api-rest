package com.yefer.mi_api_rest.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "clientes")

public class cliente implements Serializable {

 @Id
 @Column(name = "id_cliente")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer idcliente;
 @Column(name = "nombre")
 private String nombre;
 @Column(name = "apellido")
 private String apellido;
 @Column(name = "correo")
 private String correo;
 @Column(name = "fecha_registro")
 private String fechaderegistro;
}
