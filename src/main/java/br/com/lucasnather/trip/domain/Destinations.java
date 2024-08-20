package br.com.lucasnather.trip.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Destinations {

    private UUID id;

    private String photo;

    private String name;

    private Double price;

    private LocalDateTime createdAt;

    public Destinations(UUID id, String photo, String name, Double price, LocalDateTime createdAt) {
        this.id = id;
        this.photo = photo;
        this.name =  name;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Destinations(UUID id,String photo, String name, Double price) {
        this.id = id;
        this.photo = photo;
        this.name = name;
        this.price = price;
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
