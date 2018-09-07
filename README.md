# Resumo Livro Java para Web 2ed.

- http://www.javaparaweb.com.br/

---

## <a name="indice">Índice</a>

- [Preparação do ambiente de desenvolvimento](#parte1)
- [Primeiros passos com o JavaServer Faces](#parte2)
- [Introdução a Hibernate e SQL com Java](#parte3)
- [Desenvolvimento do cadastro de usuários](#parte4)
- [Administração de usuários com DataTable](#parte5)
- [Proteção do aplicativo com Spring Security](#parte6)
- [Cadastro de contas com Ajax](#parte7)
- [Definição da identidade visual com Facelets e CSS](#parte8)
- [Cadastro de categorias usando PrimeFaces](#parte9)
- [Registro de lançamentos com tags personalizadas](#parte10)
- [Cadastro de cheques multi-idiomas](#parte11)
- [Como trabalhar com gráficos](#parte12)
- [Gerenciamento de investimentos na bolsa de valores](#parte13)
- [Envio de email](#parte14)
- [Relatórios com iReport e JasperReports](#parte15)
- [Fornecimento e consumo de web services](#parte16)
- [Finalização e empacotamento do projeto](#parte17)
- [Apêndices](#parte18)

---

## <a name="parte1">Preparação do ambiente de desenvolvimento</a>

- http://www.oracle.com/technetwork/java/javase/downloads/index.html
- http://tomcat.apache.org/
- https://www.eclipse.org/downloads/
- https://dev.mysql.com/downloads/
- https://www.mysql.com/products/workbench/

[Voltar ao Índice](#indice)

---

## <a name="parte2">Primeiros passos com o JavaServer Faces</a>

2.8 - Checklist e teste  
:white_check_mark: - Criar projeto teste do tipo Maven Project  
:white_check_mark: - Alterar o pom.xml para vincular ao Java 1.8 e padronizar para UTF-8  

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.1</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
        <plugin>
            <artifactId>maven-resources-plugin</artifactId>
            <version>2.7</version>
            <configuration>
                <encoding>UTF-8</encoding>
            </configuration>
        </plugin>
    </plugins>
	</build>
```

:white_check_mark: - Executar o Maven Update Project (Alt + f5)  
:white_check_mark: - Alterar as propriedades do projeto para que ele se comporte como um projeto Web  
:white_check_mark: - configurações específicas do JSF a partir do link **further configuration avaliable**  
:white_check_mark: - Alterar manualmente a versão do web.xml devido a um bug no eclipse  
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
        http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" version="3.1">	
```
:white_check_mark: - Adicionar configurações no arquivo web.xml

```xml
<context-param>
    <param-name>javax.faces.PROJECT_STAGE</param-name>
    <param-value>Development</param-value>
</context-param>
<context-param>
    <param-name>javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL</param-name>
    <param-value>true</param-value>
</context-param>
<context-param>
    <param-name>javax.faces.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE</param-name>
    <param-value>true</param-value>
</context-param>
<welcome-file-list>
    <welcome-file>index.jsf</welcome-file>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
</welcome-file-list>
```

:white_check_mark: - Incluir repositório  e as dependências necessárias ao JSF no pom.xml

```xml
<repositories>
    <repository>
        <id>jvnet-nexus-releases</id>
        <name>jvnet-nexus-releases</name>
        <url>https://maven.java.net/content/repositories/releases/</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>javax</groupId>
        <artifactId>javaee-api</artifactId>
        <version>7.0</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.glassfish</groupId>
        <artifactId>javax.faces</artifactId>
        <version>2.2.10</version>
    </dependency>
</dependencies>
```

:white_check_mark: - Criar o arquivo OlaMundo.xhtml para realização de teste

```html
<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:h="http://java.sun.com/jsf/html"
	  xmlns:f="http://java.sun.com/jsf/core">
<h:head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Olá Mundo!</title>
</h:head>
<h:body>
<h1>Teset inicial JSF</h1>
<h:outputText value="Olá Mundo"></h:outputText>
</h:body>
</html>
```

[Voltar ao Índice](#indice)

---

## <a name="parte3">Introdução a Hibernate e SQL com Java</a>


[Voltar ao Índice](#indice)

---

## <a name="parte4">Desenvolvimento do cadastro de usuários</a>

[Voltar ao Índice](#indice)

---

## <a name="parte5">Administração de usuários com DataTable</a>

[Voltar ao Índice](#indice)

---

## <a name="parte6">Proteção do aplicativo com Spring Security</a>

[Voltar ao Índice](#indice)

---

## <a name="parte7">Cadastro de contas com Ajax</a>

[Voltar ao Índice](#indice)

---

## <a name="parte8">Definição da identidade visual com Facelets e CSS</a>

[Voltar ao Índice](#indice)

---

## <a name="parte9">Cadastro de categorias usando PrimeFaces</a>

[Voltar ao Índice](#indice)

---

## <a name="parte10">Registro de lançamentos com tags personalizadas</a>

[Voltar ao Índice](#indice)

---

## <a name="parte11">Cadastro de cheques multi-idiomas</a>

[Voltar ao Índice](#indice)

---

## <a name="parte12">Como trabalhar com gráficos</a>

[Voltar ao Índice](#indice)

---

## <a name="parte13">Gerenciamento de investimentos na bolsa de valores</a>

[Voltar ao Índice](#indice)

---

## <a name="parte14">Envio de email</a>

[Voltar ao Índice](#indice)

---

## <a name="parte15">Relatórios com iReport e JasperReports</a>

[Voltar ao Índice](#indice)

---

## <a name="parte16">Fornecimento e consumo de web services</a>

[Voltar ao Índice](#indice)

---

## <a name="parte17">Finalização e empacotamento do projeto</a>

[Voltar ao Índice](#indice)

---

## <a name="parte18">Apêndices</a>

[Voltar ao Índice](#indice)

---