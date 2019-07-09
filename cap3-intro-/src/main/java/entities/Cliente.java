package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1249879188814322251L;

    @Id
    @GeneratedValue
    @Column(name="cod_cliente")
    private Integer cliente;

    @OneToOne
    @PrimaryKeyJoinColumn(name="cod_cliente")
    private Endereco endereco;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Pedido> pedido;

    @Column(length = 45)
    private Strint nome;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    public Strint getNome() {
        return nome;
    }

    public void setNome(Strint nome) {
        this.nome = nome;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente1 = (Cliente) o;
        return Objects.equals(cliente, cliente1.cliente) &&
                Objects.equals(endereco, cliente1.endereco) &&
                Objects.equals(pedido, cliente1.pedido) &&
                Objects.equals(nome, cliente1.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, endereco, pedido, nome);
    }*/
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
}
