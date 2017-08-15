
package model;

import java.sql.Date;

/**
 *
 * @author Iara Silva de Oliveira | 2017-08-07
 */
public class Carro {
  /*atributos*/
    private int id, renavam;
    private short anoFabricacao, anoLancamento, tipoPneu;
    private byte quantidadePortas, quantidadeBatidas;
    private String nome, cor, fabricante, placa, chassi, descricao;
    private float quilometragem, potencia;
    private Date dataCompra;
    private boolean estaFuncionando, permitidaCirculacao;

    /*getters*/
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public short getAnoFabricacao() {
        return anoFabricacao;
    }

    public short getAnoLancamento() {
        return anoLancamento;
    }

    public short getTipoPneu() {
        return tipoPneu;
    }

    public byte getQuantidadePortas() {
        return quantidadePortas;
    }

    public byte getQuantidadeBatidas() {
        return quantidadeBatidas;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getPlaca() {
        return placa;
    }

    public int getRenavam() {
        return renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public float getPotencia() {
        return potencia;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public boolean isEstaFuncionando() {
        return estaFuncionando;
    }

    public boolean isPermitidaCirculacao() {
        return permitidaCirculacao;
    }

    /*setters*/
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAnoFabricacao(short anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setAnoLancamento(short anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setTipoPneu(short tipoPneu) {
        this.tipoPneu = tipoPneu;
    }

    public void setQuantidadePortas(byte quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public void setQuantidadeBatidas(byte quantidadeBatidas) {
        this.quantidadeBatidas = quantidadeBatidas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setEstaFuncionando(boolean estaFuncionando) {
        this.estaFuncionando = estaFuncionando;
    }

    public void setPermitidaCirculacao(boolean permitidaCirculacao) {
        this.permitidaCirculacao = permitidaCirculacao;
    }
    
    
    
    
}
