package com.kai2.pojo;


public class DianYing {

  private long id;
  private long leixingId;
  private String ming;
  private String yanyuan;
  private String daoyan;
  private double piaojia;
  private String tupianlujing;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public DianYing(long leixingId, String ming, String yanyuan, String daoyan, double piaojia, String tupianlujing) {
    this.leixingId = leixingId;
    this.ming = ming;
    this.yanyuan = yanyuan;
    this.daoyan = daoyan;
    this.piaojia = piaojia;
    this.tupianlujing = tupianlujing;
  }

  public long getLeixingId() {
    return leixingId;
  }

  public void setLeixingId(long leixingId) {
    this.leixingId = leixingId;
  }


  public String getMing() {
    return ming;
  }

  public void setMing(String ming) {
    this.ming = ming;
  }


  public String getYanyuan() {
    return yanyuan;
  }

  public void setYanyuan(String yanyuan) {
    this.yanyuan = yanyuan;
  }


  public String getDaoyan() {
    return daoyan;
  }

  public void setDaoyan(String daoyan) {
    this.daoyan = daoyan;
  }


  public double getPiaojia() {
    return piaojia;
  }

  public void setPiaojia(double piaojia) {
    this.piaojia = piaojia;
  }


  public String getTupianlujing() {
    return tupianlujing;
  }

  public void setTupianlujing(String tupianlujing) {
    this.tupianlujing = tupianlujing;
  }

  public DianYing(long id, long leixingId, String ming, String yanyuan) {
    this.id = id;
    this.leixingId = leixingId;
    this.ming = ming;
    this.yanyuan = yanyuan;
  }

  @Override
  public String toString() {
    return "DianYing{" +
            "id=" + id +
            ", leixingId=" + leixingId +
            ", ming='" + ming + '\'' +
            ", yanyuan='" + yanyuan + '\'' +
            ", daoyan='" + daoyan + '\'' +
            ", piaojia=" + piaojia +
            ", tupianlujing='" + tupianlujing + '\'' +
            '}';
  }

  public DianYing(long id, long leixingId, String ming, String yanyuan, String daoyan, double piaojia, String tupianlujing) {
    this.id = id;
    this.leixingId = leixingId;
    this.ming = ming;
    this.yanyuan = yanyuan;
    this.daoyan = daoyan;
    this.piaojia = piaojia;
    this.tupianlujing = tupianlujing;
  }
}
