package backAlone.model.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class AstronautaVO {

	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<HabilidadeVO> habilidades;
	
	@OneToOne(cascade= CascadeType.ALL)
	private NaveVO nave;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<RecursoVO> inventario;
	
	
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

	public List<HabilidadeVO> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<HabilidadeVO> habilidades) {
		this.habilidades = habilidades;
	}

	public NaveVO getNave() {
		return nave;
	}

	public void setNave(NaveVO nave) {
		this.nave = nave;
	}

	public List<RecursoVO> getInventario() {
		return inventario;
	}

	public void setInventario(List<RecursoVO> inventario) {
		this.inventario = inventario;
	}
}
