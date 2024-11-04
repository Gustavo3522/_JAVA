package model.entities;

public class Pessoa {
    private String nome;
    private String sexo;
    private String parentesco;
    private String dataDeNascimento;
    private Integer idade;

    public Pessoa(String nome, String sexo, String parentesco, String dataDeNascimento, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.parentesco = parentesco;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void fazerAniversario() {
        idade ++;
    }
}
