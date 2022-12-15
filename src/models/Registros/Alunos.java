package models.Registros;

import models.Coordenador.Sala;
import models.Registros.Contatos.Contatos;


@SuppressWarnings("unused")
public class Alunos implements Registro{

    private String nomeCompleto;
    private String cadastroPessoaFisica;
    private Endereco endereco;
    private String responsaveis;
    private Contatos contatos;
    private Sala sala;

    public Alunos(){}

    public Alunos(String nomeCompleto,
            String cadastroPessoaFisica,
            Endereco endereco,
            String responsaveis,
            Contatos contatos,
            Sala sala){
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.endereco = endereco;
        this.contatos = contatos;
        this.responsaveis = responsaveis;
        this.nomeCompleto = nomeCompleto;
        this.sala = sala;
    }

    public void setContatos(Contatos contatos){
        this.contatos = contatos;
    }

    public Contatos getContatos(){
        return this.contatos;
    }

    public Object getSerialized() {
        return null;
    }

    @Override
    public String getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getPath() {
        return RegistroEnumeration.ALUNOS.directoryPath;
    }

    @Override
    public String getPathName() {
        return RegistroEnumeration.ALUNOS.directoryPath + this.cadastroPessoaFisica;
    }
}