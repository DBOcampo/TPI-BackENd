package com.portfolio.portfolioBackend.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class EduList {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String institucion;
    private String titulo;
    private String periodo;
}
