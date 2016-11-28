package backAlone.model.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class PlanetaVO {

	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	private String nome;
	
	private Boolean pousado;
	
	private String img;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<RecursoVO> recursos;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<RecursoVO> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<RecursoVO> recursos) {
		this.recursos = recursos;
	}

	public Boolean getPousado() {
		return pousado;
	}

	public void setPousado(Boolean pousado) {
		this.pousado = pousado;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
