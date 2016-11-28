package backAlone.beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import backAlone.model.vo.AstronautaVO;
import backAlone.model.vo.HabilidadeVO;
import backAlone.model.vo.NaveVO;
import backAlone.model.vo.ParteVO;
import backAlone.model.vo.PlanetaVO;
import backAlone.model.vo.RecursoVO;
import backAlone.model.vo.UniversoVO;
import backAlone.model.vo.UsuarioVO;
import br.edu.unisep.mongodb.dao.MongoDAO;

@ManagedBean
@SessionScoped
public class SignUpBean {

	private String nome;
	
	private String senha;
	
	public String iniciarUsuario(){
		UsuarioVO usuario = new UsuarioVO();
		usuario.setNome(this.nome);
		usuario.setSenha(this.senha);
		usuario.setUniverso(this.iniciarUniverso());
		
		MongoDAO<UsuarioVO> dao = new MongoDAO<UsuarioVO>();
		dao.salvar(usuario);
		
		return "universe.jsf?faces-redirect=true";
	}
	
	private UniversoVO iniciarUniverso(){
		UniversoVO universo = new UniversoVO();
		
		universo.setAstronauta(this.iniciarAstronauta());
		universo.setPlanetas(this.iniciarPlanetas());
		
		return universo;
	}
	
	private ArrayList<PlanetaVO> iniciarPlanetas(){
		
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
		
		//Colocando planetas no universo
		ArrayList<PlanetaVO> planetas = new ArrayList<PlanetaVO>();
		
		planetas.add(athlis);
		planetas.add(lotus);
		planetas.add(orygon);
		planetas.add(nymphus);
		planetas.add(ember);
		
		return planetas;
	}
	
	private AstronautaVO iniciarAstronauta(){
		
		AstronautaVO astronauta = new AstronautaVO();
		
		//Iniciar Nome
		astronauta.setNome(this.nome);
		
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
		
		//Iniciar Habilidades
		ArrayList<HabilidadeVO> habilidades = new ArrayList<HabilidadeVO>();
		
		HabilidadeVO habGas = new HabilidadeVO();
		habGas.setNome("habGas");
		habGas.setNivel(1);
		habGas.setImg("resources/footage/gas-tank.png");
		habilidades.add(habGas);
		
		HabilidadeVO habFerro = new HabilidadeVO();
		habFerro.setNome("habFerro");
		habFerro.setNivel(1);
		habFerro.setImg("resources/footage/ore.png");
		habilidades.add(habFerro);
		
		HabilidadeVO habOuro = new HabilidadeVO();
		habOuro.setNome("habOuro");
		habOuro.setNivel(1);
		habOuro.setImg("resources/footage/gold.png");
		habilidades.add(habOuro);
		
		astronauta.setHabilidades(habilidades);
		
		//Iniciar Nave
		astronauta.setNave(this.iniciarNave());
		
		return astronauta;
	}
	
	private NaveVO iniciarNave(){
		NaveVO nave = new NaveVO();
		
		//Iniciar Partes
		ArrayList<ParteVO> partes = new ArrayList<ParteVO>();
		
		ParteVO tanque = new ParteVO();
		tanque.setNome("Tanque");
		tanque.setEstado(false);
		partes.add(tanque);
		
		ParteVO turbinas = new ParteVO();
		turbinas.setNome("Turbinas");
		turbinas.setEstado(false);
		partes.add(turbinas);
		
		ParteVO ventilacao = new ParteVO();
		ventilacao.setNome("Ventilação");
		ventilacao.setEstado(false);
		partes.add(ventilacao);
		
		ParteVO flaps = new ParteVO();
		flaps.setNome("Flaps");
		flaps.setEstado(false);
		partes.add(flaps);
		
		ParteVO escudoPressao = new ParteVO();
		escudoPressao.setNome("Escudo de Pressao");
		escudoPressao.setEstado(false);
		partes.add(escudoPressao);
		
		ParteVO escudoCalor = new ParteVO();
		escudoCalor.setNome("Escudo de Calor");
		escudoCalor.setEstado(false);
		partes.add(escudoCalor);
		
		ParteVO paraquedas = new ParteVO();
		paraquedas.setNome("Paraquedas");
		paraquedas.setEstado(false);
		partes.add(paraquedas);
		
		nave.setPartes(partes);
		
		return nave;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
