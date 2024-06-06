package model.entities;

public class Avô extends Pessoa{
    private Integer qtdFilhos;
    private Integer qtdFiosBrancos;

    public Avô(String nome, String sexo, String parentesco, String dataDeNascimento,Integer idade, Integer qtdFilhos, Integer qtdFiosBrancos) {
        super(nome, sexo, parentesco, dataDeNascimento, idade);
        this.qtdFilhos = qtdFilhos;
        this.qtdFiosBrancos = qtdFiosBrancos;
    }

    public Integer getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(Integer qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }

    public Integer getQtdFiosBrancos() {
        return qtdFiosBrancos;
    }

    public void setQtdFiosBrancos(Integer qtdFiosBrancos) {
        this.qtdFiosBrancos = qtdFiosBrancos;
    }

    @Override
    public void fazerAniversario() {
        super.fazerAniversario();
    }

    @Override
    public String toString() {
        return getNome() + ", Idade: " +  getIdade() + ", Parentesco: " + getParentesco() + ", Idade " + getIdade();
    }
}

