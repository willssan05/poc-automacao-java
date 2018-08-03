package br.com.framework.core;
import static br.com.framework.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL {

	public void escreve(String id_campo, String texto) {
		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}

	public void escrevePorXpath(String xpath_campo, String texto) {
		getDriver().findElement(By.xpath(xpath_campo)).sendKeys(texto);
	}

	public void escrevePorCss(String css_campo, String texto) {
		getDriver().findElement(By.cssSelector(css_campo)).sendKeys(texto);
	}

	public String obterValorCampoPorId(String id_campo) {

		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public String obterValorCampoPorXpath(String xpath_campo) {

		return getDriver().findElement(By.xpath(xpath_campo)).getAttribute("value");
	}
	
	public String obterValorCampoPorCss(String css_campo) {

		return getDriver().findElement(By.cssSelector(css_campo)).getAttribute("value");
	}

	public void clicarPorId(String id_campo) {
		getDriver().findElement(By.id(id_campo)).click();
	}

	public void clicarPorXpath(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}

	public void clicarPorCss(String css) {
		getDriver().findElement(By.cssSelector(css)).click();
	}

}


