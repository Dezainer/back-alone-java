package backAlone.model.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class NaveVO {
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	@OneToOne
	private ParteVO tanque;
	
	@OneToOne
	private ParteVO turbinas;
	
	@OneToOne
	private ParteVO oxigenio;
	
	@OneToOne
	private ParteVO flaps;
	
	@OneToOne
	private ParteVO escudoPressao;
	
	@OneToOne
	private ParteVO escudoCalor;
	
	@OneToOne
	private ParteVO paraquedas;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ParteVO getTanque() {
		return tanque;
	}

	public void setTanque(ParteVO tanque) {
		this.tanque = tanque;
	}

	public ParteVO getOxigenio() {
		return oxigenio;
	}

	public void setOxigenio(ParteVO oxigenio) {
		this.oxigenio = oxigenio;
	}

	public ParteVO getFlaps() {
		return flaps;
	}

	public void setFlaps(ParteVO flaps) {
		this.flaps = flaps;
	}

	public ParteVO getEscudoPressao() {
		return escudoPressao;
	}

	public void setEscudoPressao(ParteVO escudoPressao) {
		this.escudoPressao = escudoPressao;
	}

	public ParteVO getEscudoCalor() {
		return escudoCalor;
	}

	public void setEscudoCalor(ParteVO escudoCalor) {
		this.escudoCalor = escudoCalor;
	}

	public ParteVO getParaquedas() {
		return paraquedas;
	}

	public void setParaquedas(ParteVO paraquedas) {
		this.paraquedas = paraquedas;
	}
}
