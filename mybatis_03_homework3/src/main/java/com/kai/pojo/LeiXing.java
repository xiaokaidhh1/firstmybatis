package com.kai.pojo;


import java.util.List;

public class LeiXing {

  private long id;
  private String leixing;
  private List<DianYing> dianYingList;

  public List<DianYing> getDianYingList() {
    return dianYingList;
  }

  public void setDianYingList(List<DianYing> dianYingList) {
    this.dianYingList = dianYingList;
  }

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
