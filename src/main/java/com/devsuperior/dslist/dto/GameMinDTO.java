package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game objGame) {
        this.id = objGame.getId();
        this.title = objGame.getTitle();
        this.year = objGame.getYear();
        this.imgUrl = objGame.getImgUrl();
        this.shortDescription = objGame.getShortDescription();
    }

    public GameMinDTO(GameMinProjection objProjection) {
        this.id = objProjection.getId();
        this.title = objProjection.getTitle();
        this.year = objProjection.getYear();
        this.imgUrl = objProjection.getImgUrl();
        this.shortDescription = objProjection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
