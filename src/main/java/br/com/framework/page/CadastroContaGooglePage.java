package br.com.framework.page;

import br.com.framework.core.BasePage;

public class CadastroContaGooglePage extends BasePage{

	public void setNome(String nome) {
		dsl.escreve("firstName", nome);
	}

	public void setSobrenome(String sobrenome) {
		dsl.escreve("lastName", sobrenome);
	}

	public void setUserName(String username) {
		dsl.escreve("username", username);
	}

	public void setSenha(String senha) {
		dsl.escrevePorCss("input[name='Passwd']", senha);
	}

	public void setConfimarSenha(String confirmSenha) {
		dsl.escrevePorXpath("//input[@name='ConfirmPasswd']", confirmSenha);
	}

	public void continuar() {
		dsl.clicarPorXpath("//span[text()='Próxima']");
	}

	public String obterResultadoNome() {

		return dsl.obterValorCampoPorId("firstName");

	}

	public String obterResultadoSobrenome() {

		return dsl.obterValorCampoPorId("lastName");

	}

	public String obterResultadoUserName() {

		return dsl.obterValorCampoPorId("username");

	}

	public String obterResultadoSenha() {

		return dsl.obterValorCampoPorCss("input[name='Passwd']");

	}

	public String obterResultadoConfirmarSenha() {

		return dsl.obterValorCampoPorXpath("//input[@name='ConfirmPasswd']");

	}
}
