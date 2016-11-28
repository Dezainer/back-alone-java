package backAlone.beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import backAlone.model.vo.RecursoVO;

@ManagedBean
@RequestScoped
public class AstronautaBean {
	
	private String nome = "Robinson";

	private ArrayList<RecursoVO> inventario = new ArrayList<RecursoVO>();
	
	@PostConstruct
	public void iniciarAstronauta(){
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
