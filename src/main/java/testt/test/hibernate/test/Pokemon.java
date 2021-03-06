package testt.test.hibernate.test;// default package
// Generated 2015-11-14 22:24:56 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Pokemon generated by hbm2java
 */
@Entity
@Table(name = "pokemon", catalog = "myschema")
public class Pokemon implements java.io.Serializable {

	private int idpokemon;
	private String name;

	public Pokemon() {
	}

	public Pokemon(int idpokemon) {
		this.idpokemon = idpokemon;
	}

	public Pokemon(int idpokemon, String name) {
		this.idpokemon = idpokemon;
		this.name = name;
	}

	@Id

	@Column(name = "idpokemon", unique = true, nullable = false)
	public int getIdpokemon() {
		return this.idpokemon;
	}

	public void setIdpokemon(int idpokemon) {
		this.idpokemon = idpokemon;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
