package org.tekCorp.kodiToEs.model.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "episode")
@Data
public class Episode {

    @Id
    private Long idEpisode;
    @Column(name = "idFile")
    private Files file;
    @Column(name = "c00")
    private String name;
    @Column(name = "c01")
    private String description;
}
