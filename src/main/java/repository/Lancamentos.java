package repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.Lancamento;

public class Lancamentos implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	@Inject
	public Lancamentos(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Lancamento> todos(){
		TypedQuery<Lancamento> query = manager.createQuery(
				"from Lancamento", Lancamento.class);
		return query.getResultList();
		
	}
	
	public void adicionar(Lancamento lancamento) {
		this.manager.persist(lancamento);
		
	}
	
	public Lancamento porId(Long id) {
		return manager.find(Lancamento.class, id);
	}
	
	public Lancamento guardar(Lancamento lancamento) {
		return this.manager.merge(lancamento);
	}
	
	public void remover(Lancamento lancamento) {
		this.manager.remove(lancamento);
		}

}
