package com.example.JWTAuthentication.models;

import java.time.LocalDate;

public class FooDetailDTO {

    private Long id;
    private String obs;
    private LocalDate creationDate;
    private LocalDate changeDate;

    public FooDetailDTO(Foo foo) {
        this.id = foo.getId();
        this.obs = foo.getObs();
        this.creationDate = foo.getCreationDate();
        this.changeDate = foo.getChangeDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDate changeDate) {
        this.changeDate = changeDate;
    }

}