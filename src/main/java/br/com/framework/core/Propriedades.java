package br.com.framework.core;

public class Propriedades {
	
	// fechar o browser a cada execução do teste (true)
	// utiliza o mesmo browser para cada execução do teste (false)
	public static boolean FECHAR_BROWSER = true;
	
	public static Browsers browser = Browsers.CHROME;
	
	public enum Browsers {
		CHROME,
		FIREFOX
	}

}
