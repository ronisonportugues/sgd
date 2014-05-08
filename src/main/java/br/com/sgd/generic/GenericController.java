package br.com.sgd.generic;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Conversation;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.apache.log4j.Logger;

import br.com.sgd.enumeration.EnumState;
import br.com.sgd.util.ToolsReflection;

public abstract class GenericController<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	Logger logger = Logger.getLogger(GenericController.class);

	@Inject
	private Conversation conversation;

	protected T objeto;

	private GenericService<T> service;

	private EnumState state = EnumState.BROWSE;

	public String create() {
		this.setState(EnumState.INSERT);
		this.objeto = newInstanceEntity();
		return getNomeFormularioForm();
	}

	public String update() {
		this.setState(EnumState.EDIT);
		return getNomeFormularioForm();
	}
	
	public void delete(){
		try{
			getService().delete(objeto);
			addInfoMessage("Registro excluído com sucesso...");
		}catch(Exception e){
			e.printStackTrace();
			addErrorMessage("Falha ao excluir: "+e.getMessage());
		}
	}

	public String cancel() {
		return getNomeFormularioList();
	}

	private String getNomeFormulario() {

		String nomeDaClasse = this.objeto.getClass().getSimpleName();
		return nomeDaClasse = nomeDaClasse.substring(0, 1).toLowerCase().concat(nomeDaClasse.substring(1));

	}

	public String getNomeFormularioForm() {
		return "/resources/forms/" +  getNomeFormulario() + "Form";
	}

	private String getNomeFormularioList() {
		return "/resources/list/" + getNomeFormulario() + "List";
	}

	public void initConversation() {
		if (conversation.isTransient()) {
			conversation.begin();
		}
	}

	public void exibirMensagem(String idComponente, FacesMessage menssagem) {
		FacesContext.getCurrentInstance().addMessage(idComponente, menssagem);
	}

	protected void addErrorMessage(String componentId, String errorMessage) {
		addMessage(componentId, errorMessage, FacesMessage.SEVERITY_ERROR);
	}

	protected void addErrorMessage(String errorMessage) {
		addErrorMessage(null, errorMessage);
	}

	protected void addInfoMessage(String componentId, String infoMessage) {
		addMessage(componentId, infoMessage, FacesMessage.SEVERITY_INFO);
	}

	protected void addInfoMessage(String componentId, String summary, String detail) {
		addMessage(componentId, summary, detail, FacesMessage.SEVERITY_INFO);
	}

	protected void addFatalMessage(String componentId, String summary, String detail) {
		addMessage(componentId, summary, detail, FacesMessage.SEVERITY_FATAL);
	}

	protected void addWarnMessage(String componentId, String summary, String detail) {
		addMessage(componentId, summary, detail, FacesMessage.SEVERITY_WARN);
	}

	protected void addErrorMessage(String componentId, String summary, String detail) {
		addMessage(componentId, summary, detail, FacesMessage.SEVERITY_ERROR);
	}

	protected void addInfoMessage(String infoMessage) {
		addInfoMessage(null, infoMessage);
	}

	private void addMessage(String componentId, String errorMessage, Severity severity) {

		FacesContext context = FacesContext.getCurrentInstance();

		FacesMessage message = new FacesMessage(errorMessage);
		message.setSeverity(severity);

		context.addMessage(componentId, message);
	}

	private void addMessage(String componentId, String summary, String detail, Severity severity) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(severity, summary, detail);
		context.addMessage(componentId, message);
	}

	public String salvar() {

		if (objeto != null) {
			try {
				objeto = getService().salvar(objeto);
				addInfoMessage("Registro Salvo com sucesso!");
			} catch (Exception e) {
				logger.error("Erro ao salvar dados: " + e.getMessage());
				addErrorMessage("Falha ao salvar: " + e.getMessage());
				return "";
			}
		}
		return getNomeFormularioList();
	}

	public List<T> findAll() {
		return getService().findAll();
	}

	public T getObjeto() {
		if (objeto == null && getService() != null) {
			objeto = newInstanceEntity();
		}
		return objeto;
	}

	public void setObjeto(T entity) {
		if (null != entity) {
			this.objeto = entity;
		}
	}

	public GenericService<T> getService() {
		return service;
	}

	public void setService(GenericService<T> service) {
		this.service = service;
	}

	@SuppressWarnings("unchecked")
	public T newInstanceEntity() {

		try {
			return (T) ToolsReflection.getTNewInstance(this);
		} catch (Exception e) {
		}
		return null;
	}

	public EnumState getState() {
		return state;
	}

	public void setState(EnumState state) {
		this.state = state;
	}

	public void salvarMais(){
		
	}
	
	public String showFormDetail() {

		this.state = EnumState.BROWSE;		
		return getNomeFormularioForm();
	}	
}
