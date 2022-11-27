package com.sdv.kit.server.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class PersonCredentials implements Serializable {

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Id
    @Column(name = "person_id")
    private Long id;

    @OneToOne
    @MapsId
    private Person person;

    private String username;

    private String password;


}
