package br.com.lucasnather.trip.domain;

import java.nio.Buffer;
import java.time.LocalDateTime;
import java.util.UUID;

public class Briefs {

    private UUID id;

    private String photo;

    private String brief;

    private String name;

    private LocalDateTime createdAt;

    public  Briefs(UUID id, String photo, String brief, String name, LocalDateTime createdAt) {
        this.id = id;
        this.photo = photo;
        this.brief = brief;
        this.name =  name;
        this.createdAt = createdAt;
    }

    public  Briefs(UUID id, String photo, String brief, String name) {
        this.id = id;
        this.photo = photo;
        this.brief = brief;
        this.name =  name;
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

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
