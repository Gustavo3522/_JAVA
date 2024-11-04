package entities;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String funcao;
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, String funcao, double salario, String dataAdmissao) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(){

    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
