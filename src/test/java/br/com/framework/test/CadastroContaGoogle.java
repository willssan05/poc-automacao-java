package br.com.framework.test;

import static br.com.framework.core.DriverFactory.getDriver;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.framework.core.BaseTest;
import br.com.framework.core.DriverFactory;
import br.com.framework.page.CadastroContaGooglePage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroContaGoogle extends BaseTest{
	
	private CadastroContaGooglePage page;

	@Before
	public void inicializa() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		page = new CadastroContaGooglePage();
		BaseTest.testName = "Cadastro no Google";
		
	}
	
	@Dado("^que eu acesse a página de cadastro do Google$")
	public void que_eu_acesse_a_página_de_cadastro_do_Google() throws Throwable {
		getDriver().get("https://accounts.google.com/SignUp?h1=pt-BR");
		BaseTest.takeScreenshot();
		
	}

	@Quando("^preencho os dados para criar um usuário novo$")
	public void preencho_os_dados_para_criar_um_usuário_novo(DataTable arg1) throws Throwable {
		Map<String, String> list = arg1.asMap(String.class, String.class);
		page.setNome(list.get("Nome"));
		page.setSobrenome(list.get("Sobrenome"));
		page.setUserName(list.get("Email"));
		page.setSenha(list.get("Senha"));
		page.setConfimarSenha(list.get("Confirmar"));
		BaseTest.takeScreenshot();
	}

	@Quando("^prossigo para tela seguinte$")
	public void prossigo_para_tela_seguinte() throws Throwable {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@name='ConfirmPasswd']")));
		page.continuar();
	}

	@Então("^é apresentada tela para informar o número de celular$")
	public void é_apresentada_tela_para_informar_o_número_de_celular() throws Throwable {
		Assert.assertEquals("Wilson", page.obterResultadoNome());
		Assert.assertEquals("Barboza", page.obterResultadoSobrenome());
		Assert.assertEquals("wilsonbarboza12345678901", page.obterResultadoUserName());
		Assert.assertEquals("Teste@123", page.obterResultadoSenha());
		Assert.assertEquals("Teste@123", page.obterResultadoConfirmarSenha());
		BaseTest.takeScreenshot();
		DriverFactory.killDriver();
	}

}
