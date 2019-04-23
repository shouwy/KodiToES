package org.tekCorp.kodiToEs.model.mysql;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity(name = "tvshow")
@Data
public class TvShow {

    @Id
    private Long idShow;
    @Column(name = "c00")
    private String name;
    @Column(name = "c01")
    private String description;
    @Column(name = "c06")
    private String images;

    @Fetch(FetchMode.JOIN)
    @OneToMany(mappedBy = "tvshow", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Episode> episodes;
}
