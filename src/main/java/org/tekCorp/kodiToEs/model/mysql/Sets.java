package org.tekCorp.kodiToEs.model.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Sets")
@Data
public class Sets {

    @Id
    private Long idSet;
    @Column(name = "strSet")
    private String collection;
}
