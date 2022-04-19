package br.com.alura.oobj;

import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class ItemPedido {

  @CsvBindByName
  private Long codigo;

  @CsvBindByName
  private String descricao;

  @CsvBindByName
  private Integer quantidade;

  @CsvBindByName
  private BigDecimal valorUnitario;

  @CsvBindByName
  private String classeFiscal;

  public Long getCodigo() {
    return this.codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Integer getQuantidade() {
    return this.quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public BigDecimal getValorUnitario() {
    return this.valorUnitario;
  }

  public void setValorUnitario(BigDecimal valorUnitario) {
    this.valorUnitario = valorUnitario;
  }

  public String getClasseFiscal() {
    return this.classeFiscal;
  }

  public void setClasseFiscal(String classeFiscal) {
    this.classeFiscal = classeFiscal;
  }

  @Override
  public String toString() {
    return "ItemPedido{" +
        "codigo=" + this.codigo +
        ", descricao='" + this.descricao + '\'' +
        ", quantidade=" + this.quantidade +
        ", valorUnitario=" + this.valorUnitario +
        ", classeFiscal='" + this.classeFiscal + '\'' +
        '}';
  }
}
