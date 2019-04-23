package org.tekCorp.kodiToEs.model.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "movie")
@Data
public class Movie {

    @Id
    private Long idMovie;

    @Column(name = "c00")
    private String name;
    @Column(name = "c01")
    private String description;
    @Column(name = "premiered")
    private String dateSortie;
    @Column(name = "c08")
    private String images;
    @Column(name = "idSet")
    private Sets collection;
    @Column(name = "idFile")
    private Files file;
}
