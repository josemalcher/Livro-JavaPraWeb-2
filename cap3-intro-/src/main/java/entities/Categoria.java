package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="categoria")
public class Categoria implements Serializable {


    private static final long serialVersionUID = -2706852428870020597L;

    @Id
    @GeneratedValue
    @Column(name = "cod_categoria")
    private Integer categoria;

    @Column(length = 45)
    private String descricao;

    @Lob
    private String resumo;

    public Categoria(String descricao, String resumo) {
        this.descricao = descricao;
        this.resumo = resumo;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria1 = (Categoria) o;
        return Objects.equals(getCategoria(), categoria1.getCategoria()) &&
                Objects.equals(getDescricao(), categoria1.getDescricao()) &&
                Objects.equals(getResumo(), categoria1.getResumo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategoria(), getDescricao(), getResumo());
    }*/

    /* ---- Exemplop Do livro ---- */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result
                + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((resumo == null) ? 0 : resumo.hashCode());
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
        Categoria other = (Categoria) obj;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (resumo == null) {
            if (other.resumo != null)
                return false;
        } else if (!resumo.equals(other.resumo))
            return false;
        return true;
    }
}
