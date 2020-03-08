package bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Lancamento;
import repository.Lancamentos;
import util.JpaUtil;

@Named
@ViewScoped
public class ConsultaLancamentosBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Lancamentos lancamentosRepository;
	
	private List<Lancamento> lancamentos;
	
	public void consultar() {
		this.lancamentos = lancamentosRepository.todos();
	}
	
	public List<Lancamento> getLancamentos(){
		return this.lancamentos;
	}
}