package com.portfolio.portfolioBackend.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class mainImages {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Column(columnDefinition="MEDIUMTEXT")
    private String img;
}
