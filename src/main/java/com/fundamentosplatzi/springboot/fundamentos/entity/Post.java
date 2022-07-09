package com.fundamentosplatzi.springboot.fundamentos.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id //Indicamos que es el ID de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera un auto-incrementable
    @Column(name = "id_post", nullable = false, unique = true)
    private Long id;
    @Column(name = "descripcion", length = 255)
    private String descripcion;
    @ManyToOne
    private User user;

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", user=" + user +
                '}';
    }
}
