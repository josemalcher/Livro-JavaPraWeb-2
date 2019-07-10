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

- https://wildfly.org/downloads/

- [x] 2.10 - Checklist e teste


[Voltar ao Índice](#indice)

---

## <a name="parte3">Introdução a Hibernate e SQL com Java</a>

- [x] 3.2.4 Checklist (página 129)
    
- cap3-intro-hibernate-sql-java
    - cap3-intro-hibernate-sql-java/src/conexao/ConectaMySQL.java

```java
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySQL {
    public static void main(String[] args) {
        Connection conexao = null;
        try {
            // Registrando a classe JDBC, e os parâmetros de conexão em tempo de execução
            String url = "jdbc:mysql://172.22.0.2/cap3_agenda";
            String usuario = "root";
            String senha = "passwd123";

            conexao = DriverManager.getConnection(url, usuario, senha); 
            System.out.println("Conectou!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao criar a conexão. Erro: " + e.getMessage());
        }
    }
}
```

- cap3-intro-hibernate-sql-java/src/crudjdbc/Contato.java
- cap3-intro-hibernate-sql-java/src/crudjdbc/ContatoCrudJDBC.java

#### 3.3 Introdução ao Hibernate

- 3.5.3 checklist
  - cap3-intro-hibernate-sql-java-exemplo-hibernate/src/main/java/conexao/HibernateUtil.java
  - cap3-intro-hibernate-sql-java-exemplo-hibernate/src/main/java/crudannotations/Contato.java
  - cap3-intro-hibernate-sql-java-exemplo-hibernate/src/main/java/crudannotations/ContatoCrudAnnotations.java

```java
package crudannotations;

import java.sql.Date;
import java.util.List;

import conexao.HibernateUtil;
import org.hibernate.*;

public class ContatoCrudAnnotations {

    private Session sessao;

    public ContatoCrudAnnotations(Session sessao) {
        this.sessao = sessao;
    }

    public void salvar(Contato contato) {
        sessao.save(contato);
    }

    public void atualizar(Contato contato) {
        sessao.update(contato);
    }

    public void excluir(Contato contato) {
        sessao.delete(contato);
    }

    public List<Contato> listar() {
        Query consulta = sessao.createQuery("from Contato");
        return consulta.list();
    }

    public Contato buscaContato(int valor) {
        Query consulta = sessao.createQuery("from Contato where codigo = :parametro");
        consulta.setInteger("parametro", valor);
        return (Contato) consulta.uniqueResult();
    }

    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        ContatoCrudAnnotations contatoCrud = new ContatoCrudAnnotations(sessao);

        Contato contato1 = new Contato();
        contato1.setNome("Solanu");
        contato1.setTelefone("(47) 3333-4444");
        contato1.setEmail("solanu@javaparaweb.com.br");
        contato1.setDataCadastro(new Date(System.currentTimeMillis()));
        contato1.setObservacao("Novo cliente");
        contatoCrud.salvar(contato1);

        contato1.setObservacao("Retomar contato");
        contatoCrud.atualizar(contato1);

        Contato contato2 = new Contato();
        contato2.setNome("Lunare");
        contato2.setTelefone("(47) 7777-5555");
        contato2.setEmail("lunare@javaparaweb.com.br");
        contato2.setDataCadastro(new Date(System.currentTimeMillis()));
        contato2.setObservacao("Cliente em dia");
        contatoCrud.salvar(contato2);

        System.out.println("Total de registros cadastrados: " + contatoCrud.listar().size());

        contatoCrud.excluir(contato2);
        transacao.commit();
        System.out.println("Total de registros cadastrados: " + contatoCrud.listar().size());
    }
}

```

- 3.6.4.3 Check list parcial do projeto (página 165)
  - Livro-JavaPraWeb-2/cap3-intro-


- 3.6.7 Execução do projeto comercio
  - Livro-JavaPraWeb-2/cap3-intro-

[Voltar ao Índice](#indice)

---

## <a name="parte4">Desenvolvimento do cadastro de usuários</a>

- Criação do banco (4.2.4 página 192)


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