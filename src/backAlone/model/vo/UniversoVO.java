package backAlone.model.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class UniversoVO {
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	@OneToOne
	private AstronautaVO astronauta;
	
	@OneToOne
	private PlanetaVO athlis;
	
	@OneToOne
	private PlanetaVO lotus;
	
	@OneToOne
	private PlanetaVO orygon;
	
	@OneToOne
	private PlanetaVO nymphus;
	
	@OneToOne
	private PlanetaVO ember;
	
	private Integer tempo;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AstronautaVO getAstronauta() {
		return astronauta;
	}

	public void setAstronauta(AstronautaVO astronauta) {
		this.astronauta = astronauta;
	}

	public PlanetaVO getAthlis() {
		return athlis;
	}

	public void setAthlis(PlanetaVO athlis) {
		this.athlis = athlis;
	}

	public PlanetaVO getLotus() {
		return lotus;
	}

	public void setLotus(PlanetaVO lotus) {
		this.lotus = lotus;
	}
	
	public PlanetaVO getOrygon() {
		return orygon;
	}

	public void setOrygon(PlanetaVO orygon) {
		this.orygon = orygon;
	}

	public PlanetaVO getNymphus() {
		return nymphus;
	}

	public void setNymphus(PlanetaVO nymphus) {
		this.nymphus = nymphus;
	}

	public PlanetaVO getEmber() {
		return ember;
	}

	public void setEmber(PlanetaVO ember) {
		this.ember = ember;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
}
