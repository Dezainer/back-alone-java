package backAlone.beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import backAlone.model.vo.AstronautaVO;
import backAlone.model.vo.RecursoVO;

@ManagedBean
@RequestScoped
public class AstronautaBean {
	
	private AstronautaVO astronauta = new AstronautaVO();

	@PostConstruct
	public void iniciarAstronauta(){
		
		//Iniciar Nome
		astronauta.setNome("Cleitinho");
		
		//Iniciar Inventário
		ArrayList<RecursoVO> inventario = new ArrayList<RecursoVO>();
		
		RecursoVO itemGas = new RecursoVO();
		itemGas.setNome("itemGasGas");
		itemGas.setQuantidade(0);
		itemGas.setImg("resources/footage/gas-tank.png");
		inventario.add(itemGas);
		
		RecursoVO itemFerro = new RecursoVO();
		itemFerro.setNome("itemFerro");
		itemFerro.setQuantidade(0);
		itemFerro.setImg("resources/footage/ore.png");
		inventario.add(itemFerro);
		
		RecursoVO itemOuro = new RecursoVO();
		itemOuro.setNome("itemOuro");
		itemOuro.setQuantidade(0);
		itemOuro.setImg("resources/footage/gold.png");
		inventario.add(itemOuro);
		
		astronauta.setInventario(inventario);
	}

	public AstronautaVO getAstronauta() {
		return astronauta;
	}

	public void setAstronauta(AstronautaVO astronauta) {
		this.astronauta = astronauta;
	}
}
