package backAlone.beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import backAlone.model.vo.PlanetaVO;
import backAlone.model.vo.RecursoVO;

@ManagedBean
@RequestScoped
public class UniversoBean {

	private ArrayList<PlanetaVO> planetas = new ArrayList<PlanetaVO>();
	
	@PostConstruct
	public void iniciarPlanetas(){
		
		//Criando Recursos
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
		
		ArrayList<RecursoVO> recursos = new ArrayList<RecursoVO>();
		
		recursos.add(recGas);
		recursos.add(recFerro);
		recursos.add(recOuro);
		
		//Iniciando Planetas
		
		//Athlis
		PlanetaVO athlis = new PlanetaVO();
		
		athlis.setNome("Athlis");
		athlis.setImg("resources/footage/1.png");
		athlis.setPousado(true);
		
		athlis.setRecursos(recursos);
		
		//Lotus
		PlanetaVO lotus = new PlanetaVO();
		
		lotus.setNome("Lotus");
		lotus.setImg("resources/footage/2.png");
		lotus.setPousado(false);
		
		lotus.setRecursos(recursos);
		
		//Orygon
		PlanetaVO orygon = new PlanetaVO();
		
		orygon.setNome("Orygon");
		orygon.setImg("resources/footage/3.png");
		orygon.setPousado(false);
		
		orygon.setRecursos(recursos);
		
		//Nymphus
		PlanetaVO nymphus = new PlanetaVO();
		
		nymphus.setNome("Nymphus");
		nymphus.setImg("resources/footage/4.png");
		nymphus.setPousado(false);
		
		nymphus.setRecursos(recursos);
		
		//Ember
		PlanetaVO ember = new PlanetaVO();
		
		ember.setNome("Ember");
		ember.setImg("resources/footage/5.png");
		ember.setPousado(false);
		
		ember.setRecursos(recursos);
		
		//Iniciando o Universo
		this.planetas.add(athlis);
		this.planetas.add(lotus);
		this.planetas.add(orygon);
		this.planetas.add(nymphus);
		this.planetas.add(ember);
	}

	public ArrayList<PlanetaVO> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(ArrayList<PlanetaVO> planetas) {
		this.planetas = planetas;
	}
}
