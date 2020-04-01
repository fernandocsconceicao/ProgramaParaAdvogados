/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author fernando
 */
public class Pessoas {

    public Pessoas() {
       
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the estado_civil
     */
    public int getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(int estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the data_de_nascimento
     */
    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    /**
     * @param data_de_nascimento the data_de_nascimento to set
     */
    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the comentarios
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * @param comentarios the comentarios to set
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }
    public boolean getStatus(){
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    private int cod;
    private boolean status;
    private String nome;
    private int estado_civil;
    private String data_de_nascimento;
    private String telefone;
    private String celular;
    private String rg;
    private String cpf;
    private String endereco;
    private String numero;
    private String complemento;
    private String comentarios;
    private String email;
    private String cep;
    private String numero_de_processo;
    private String nome2;
    private String nome3;
    private String assunto;
    private String justica;
    private String instancia;
    private String orgao;
    private String pessoa;

    public Pessoas(String nome2, String nome3, String assunto, String justica, String instancia, String orgao, String pessoa) {
        this.nome2 = nome2;
        this.nome3 = nome3;
        this.assunto = assunto;
        this.justica = justica;
        this.instancia = instancia;
        this.orgao = orgao;
        this.pessoa = pessoa;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getNome3() {
        return nome3;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getJustica() {
        return justica;
    }

    public void setJustica(String justica) {
        this.justica = justica;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero_de_processo() {
        return numero_de_processo;
    }

    public void setNumero_de_processo(String numero_de_processo) {
        this.numero_de_processo = numero_de_processo;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }
    private String data_de_cadastro;

    public String getData_de_cadastro() {
        return data_de_cadastro;
    }

    public void setData_de_cadastro(String data_de_cadastro) {
        this.data_de_cadastro = data_de_cadastro;
    }

    public String getEmail() {
        return email;
    }

    public Pessoas(String email) {
        this.email = email;
    }
    
    
    
    
    
   /* 
    cod                INTEGER       PRIMARY KEY
                                     UNIQUE,
    nome               VARCHAR (100),
    estado_civil       VARCHAR,
    data_de_nascimento VARCHAR,
    telefone           VARCHAR,
    celular            VARCHAR,
    data_do_cadastro   STRING,
    rg                 VARCHAR,
    cpf                VARCHAR,
    endereco           VARCHAR,
    numero             VARCHAR,
    complemento        VARCHAR,
    comentarios        STRING,
    status             BOOLEAN
    */   

    public Pessoas(int cod, String nome, int estado_civil, String data_de_nascimento, String telefone, String celular, String rg, String cpf, String endereco, String numero, String complemento, String comentarios, boolean status) {
        this.cod = cod;
        this.nome = nome;
        this.estado_civil = estado_civil;
        this.data_de_nascimento = data_de_nascimento;
        this.telefone = telefone;
        this.celular = celular;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.comentarios = comentarios;
        this.status = status;
    }

}
