package com.formacionsecurity.springboot.app.productos.models.dao;

import java.util.Date;

public class UsuarioDTO {
    private Date createdAt;
    private String name;
    private byte[] avatar;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }
}
