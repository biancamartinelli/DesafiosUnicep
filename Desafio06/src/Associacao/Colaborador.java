package Associacao;

public class Colaborador extends Pessoa {
    private String cargo;
    public Colaborador() {

    }

    public Colaborador(Integer id, String nome, String logadouro, Integer numero, String cep, String bairro, String UF, Integer telefone, String documento, String cargo) {
        super(id, nome, logadouro, numero, cep, bairro, UF, telefone, documento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
