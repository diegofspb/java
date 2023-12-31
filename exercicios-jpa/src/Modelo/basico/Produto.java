package Modelo.basico;

import javax.persistence.*;

@Entity // indica que esta classe (objeto) será persistido(salvo) no banco de dados
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 200, nullable = false)
    private String nome;
    @Column(precision = 11, scale = 2)  // tamanho de 11 digitos e 2 casas decimais
    private Double preco;

    public Produto(){

    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
