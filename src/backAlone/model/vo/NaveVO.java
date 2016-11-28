package backAlone.model.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class NaveVO {
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<ParteVO> partes;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ParteVO> getPartes() {
		return partes;
	}

	public void setPartes(List<ParteVO> partes) {
		this.partes = partes;
	}
}
