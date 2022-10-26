package Modelo;

import java.util.ArrayList;

public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private Endereco endereco;
    private Integer telefone;

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    private ArrayList<Carro> carros = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String email, Endereco endereco, Integer telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "\n Cliente{" +
                "\n cpf='" + cpf + '\'' +
                "\n nome='" + nome + '\'' +
                "\n email='" + email + '\'' +
                "\n endereco=" + getEndereco() +
                "\n telefone=" + telefone +
                "\n carros=" + getCarros() +
                "\n}";
    }
}

