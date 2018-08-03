# Framework de automação em Java
> Estrutura de framework padrão para testes automatizados em Java.

## Ferramentas instaladas na máquina para executar o projeto e iniciar o Desenvolvimento

Java JRE - Versão 1.8

Java JDK - Versão 1.8

Eclipse EE IDE (Com Maven instalado)

Variáveis do ambiente configuradas

geckodriver - Driver para interação do selenium com o Firefox

ChromeDriver - Driver para interação do selenium com o Chrome

Atualizar os driver na pasta do projeto ./poc_automacao_java/src/test/resources/Driver

## Executar o projeto

 1. Realizar um clone/download do projeto (https://github.com/willssan05/framework-java-selenium-bdd) para o diretório local;

 2. Após o download do projeto, mova-o para um diretório, como "Meus Documentos";
 
 3. No Eclipse IDE importar o arquivo (compactado);
    - File > Import...;
    - Selecionar Projects from Folder or Archive;
    - Clicar em Archive;
    - Navegar até diretório com o projeto, selecioná-lo e clicar em Abrir;
    - Selecionar Eclipse project e clicar em Finish
 
 4. Atualizar dependências do projeto
    - Project > Clear;
    - Selecionar o projeto importado;
    - Selecionar "Build only the selected projects";
    - Clicar no botão Clear.
 
 5. Executar o teste
    - Acessar o diretório src/main/java > br.com.framework.suites;
    - No arquivo SuiteTeste.java, clicar com o botão direito, Run As... > JUnit Test
