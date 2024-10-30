package com.march.blog.news.entity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "news-entity")
public class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @Column(nullable = false, updatable = false)
    private UUID id;

    @NotNull(message = "Title is required")
    private String title;

    private String description;

    @NotNull(message = "Title is required")
    private String author;

    private String createdAt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z")
        .format(new Date());
}
