package Modelo;

import Interface.Conceito;

public class Aluno implements Conceito {

    private Integer num;
    private String nome;
    private String cpf;
    private Float nota1;
    private Float nota2;



    public Aluno() {
    }

    public Aluno(Integer num, String nome, String cpf, Float nota1, Float nota2) {
        this.num = num;
        this.nome = nome;
        this.cpf = cpf;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String calculaConceito() {
        Float media = (nota1 + nota2) / 2;

        String ret = "Media Final: " + String.format("%.2f",media) + "\n";

        if (media >= 9) {
            return ret + a;
        } else if ( media > 6) {
            return ret + b;
        }
        return ret + c;
    }
}
