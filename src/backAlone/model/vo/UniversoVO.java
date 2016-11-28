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
public class UniversoVO {
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AstronautaVO astronauta;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PlanetaVO> planetas;
	

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

	public List<PlanetaVO> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(List<PlanetaVO> planetas) {
		this.planetas = planetas;
	}
}
