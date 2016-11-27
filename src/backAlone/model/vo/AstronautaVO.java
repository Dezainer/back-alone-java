package backAlone.model.vo;

import java.util.List;

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
	
	@OneToOne
	private HabilidadeVO habGas;
	
	@OneToOne
	private HabilidadeVO habFerro;
	
	@OneToOne
	private HabilidadeVO habOuro;
	
	@OneToOne
	private NaveVO nave;
	
	@OneToMany
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
	
	public HabilidadeVO getHabGas() {
		return habGas;
	}

	public void setHabGas(HabilidadeVO habGas) {
		this.habGas = habGas;
	}

	public HabilidadeVO getHabFerro() {
		return habFerro;
	}

	public void setHabFerro(HabilidadeVO habFerro) {
		this.habFerro = habFerro;
	}

	public HabilidadeVO getHabOuro() {
		return habOuro;
	}

	public void setHabOuro(HabilidadeVO habOuro) {
		this.habOuro = habOuro;
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
