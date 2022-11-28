package cz.czechitas.java2webapps.ukol7.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(max = 100)
    @NotNull
    @UniqueElements
    private String author;

    @Length(max = 255)
    @NotNull
    private String title;

    @NotNull
    private String perex;

    @NotNull
    private String body;

    private Date published;


    public Post(String author, String title, String perex, String body, Date published) {
        this.author = author;
        this.title = title;
        this.perex = perex;
        this.body = body;
        this.published = published;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerex() {
        return perex;
    }

    public void setPerex(String perex) {
        this.perex = perex;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }
}
