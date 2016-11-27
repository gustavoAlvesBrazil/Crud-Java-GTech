package cadastrodefuncionarios.modelo;

import java.util.ArrayList;

public class Departamento {
    private int codigo;
    private String nome;
    ArrayList<Funcionario> listaFuncionarios;
    
    public Departamento() {
        listaFuncionarios = new ArrayList<>();
    }

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        listaFuncionarios = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    
    public void adicionaFuncionario(Funcionario f) {
        f.setDepartamento(this);
        listaFuncionarios.add(f);
    }
}
