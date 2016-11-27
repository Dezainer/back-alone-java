package backAlone.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import backAlone.model.vo.PlanetaVO;
import backAlone.model.vo.RecursoVO;

@ManagedBean
@RequestScoped
public class UniversoBean {

	private List<PlanetaVO> planetas;
	
	@PostConstruct
	public void iniciarPlanetas(){
		RecursoVO recGas = new RecursoVO();
		
		recGas.setNome("Gas");
		recGas.setQuantidade(15);
		recGas.setImg("resources/footage/gas-tank.png");
		
		RecursoVO recFerro = new RecursoVO();
		
		recFerro.setNome("Ferro");
		recFerro.setQuantidade(26);
		recFerro.setImg("resources/footage/ore.png");
		
		RecursoVO recOuro = new RecursoVO();
		
		recOuro.setNome("Ouro");
		recOuro.setQuantidade(9);
		recOuro.setImg("resources/footage/gold.png");
		
		//Athlis
		PlanetaVO athlis = new PlanetaVO();
		
		athlis.setNome("Athlis");
		athlis.setImg("resources/footage/2.png");
		athlis.setPousado(true);
		
		List<RecursoVO> recursosAthlis = null;
		
		recursosAthlis.add(recGas);
		recursosAthlis.add(recFerro);
		recursosAthlis.add(recOuro);
		
		athlis.setRecursos(recursosAthlis);
		
		//Lotus
		PlanetaVO lotus = new PlanetaVO();
		
		lotus.setNome("Lotus");
		lotus.setImg("resources/footage/2.png");
		lotus.setPousado(false);
		
		List<RecursoVO> recursosLotus = null;
		
		recursosLotus.add(recGas);
		recursosLotus.add(recFerro);
		recursosLotus.add(recOuro);
		
		athlis.setRecursos(recursosLotus);
		
		//Create the Universe
		this.planetas.add(athlis);
		this.planetas.add(lotus);
	}

	public List<PlanetaVO> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(List<PlanetaVO> planetas) {
		this.planetas = planetas;
	}
}
