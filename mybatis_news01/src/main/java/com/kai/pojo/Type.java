package com.kai.pojo;

import java.util.List;

public class Type {
    private int typeId;
    private String message;
    private List<News1> news1s;

    public List<News1> getNews1s() {
        return news1s;
    }

    public void setNews1s(List<News1> news1s) {
        this.news1s = news1s;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", message='" + message + '\'' +
                ", news1s=" + news1s +
                '}';
    }
}
