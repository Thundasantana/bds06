package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;

import com.devsuperior.movieflix.entities.Movie;

public class MoviePageDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private Long id;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private String subTitle;
	
	@NotEmpty
	private String synopsis;
	
	@NotEmpty
	private Integer year;
	
	@NotEmpty
	private String imgUrl;
	
	public MoviePageDTO() {
	}

	public MoviePageDTO(Long id, String title, String subTitle, String synopsis, Integer year, String imgUrl) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.synopsis = synopsis;
		this.year = year;
		this.imgUrl = imgUrl;
	}
	
	public MoviePageDTO(Movie entity) {
		id = entity.getId();
		title = entity.getTitle();
		subTitle = entity.getSubTitle();
		synopsis = entity.getSynopsis();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoviePageDTO other = (MoviePageDTO) obj;
		return Objects.equals(id, other.id);
	}
}
