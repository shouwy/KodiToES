package org.tekCorp.kodiToEs.model.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "files")
@Data
public class Files {

    @Id
    private Long idFile;
    @Column(name = "strFilename")
    private String fileName;
    @Column(name = "dateAdded")
    private String added;
}
