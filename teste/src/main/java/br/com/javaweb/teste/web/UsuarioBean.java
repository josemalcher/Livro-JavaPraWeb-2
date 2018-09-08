package br.com.javaweb.teste.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
//import java.util.Map;
//import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean {
 public String nome;
 public String email;
 public String senha;
 public String confirmaSenha;
 
// inicio exemplo de ManagedProperty
/* @ManagedProperty(value="#{param}")
 private Map<String, String> parametros;
  
 public Map<String, String> getParametros() {
	return parametros;
}

public void setParametros(Map<String, String> parametros) {
	this.parametros = parametros;
}*/
// fim exemplo de ManagedProperty

public String novo() {
	 return "usuario";
 }
 
public String salvar() { 
	FacesContext context = FacesContext.getCurrentInstance(); 
	if (!this.senha.equalsIgnoreCase(this.confirmaSenha)) {
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha confirmada incorretamente",""));
		return "usuario";
	}
	// FUTURO - salva o usuário
	return "mostrausuario"; 
}
 
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getConfirmaSenha() {
	return confirmaSenha;
}
public void setConfirmaSenha(String confirmaSenha) {
	this.confirmaSenha = confirmaSenha;
}
 
 
 
}
