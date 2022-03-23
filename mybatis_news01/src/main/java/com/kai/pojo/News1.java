package com.kai.pojo;

import java.io.Serializable;

public class News1 implements Serializable {

  private int id;
  private String title;
  private String author;
  private String updateTime;
  private String content;
  private String imagePath;
  private int typeId;
  private Type type;

  public News1() {
  }

  public int getTypeId() {
    return typeId;
  }

  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public News1(int id, String author) {
    this.id = id;
    this.author = author;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public News1(String title, String author, String updateTime, String content, String imagePath) {
    this.title = title;
    this.author = author;
    this.updateTime = updateTime;
    this.content = content;
    this.imagePath = imagePath;
  }

  @Override
  public String toString() {
    return "News1{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", updateTime='" + updateTime + '\'' +
            ", content='" + content + '\'' +
            ", imagePath='" + imagePath + '\'' +
            ", typeId=" + typeId +
            ", type=" + type +
            '}';
  }
}
