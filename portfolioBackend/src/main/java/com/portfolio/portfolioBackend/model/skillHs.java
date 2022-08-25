package com.portfolio.portfolioBackend.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class skillHs {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String skill;
    private int porcentaje;
    private String color;
}
