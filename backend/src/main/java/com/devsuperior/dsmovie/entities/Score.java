package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")

public class Score {

	// Chave primária composta, por isso criasse a classe ScorePK

	@EmbeddedId
	private ScorePK id = new ScorePK(); // Instanciar para garantir que seja iniciado

	private Double value;

	public Score() {
	}

	// Associar Movie com Score
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	// Associar Movie com Score
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
