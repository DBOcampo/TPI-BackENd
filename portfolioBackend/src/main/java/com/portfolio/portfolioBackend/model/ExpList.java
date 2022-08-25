package com.portfolio.portfolioBackend.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class ExpList {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String empresa;
    private String puesto;
    private String periodo;
}
