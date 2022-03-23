package com.kai2.pojo;


public class LeiXing {

  private long id;
  private String leixing;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLeixing() {
    return leixing;
  }

  public void setLeixing(String leixing) {
    this.leixing = leixing;
  }

  @Override
  public String toString() {
    return "LeiXing{" +
            "id=" + id +
            ", leixing='" + leixing + '\'' +
            '}';
  }
}
