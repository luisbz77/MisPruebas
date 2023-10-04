package com.formacionsecurity.springboot.app.productos.models.service;

import com.formacionsecurity.springboot.app.productos.models.dao.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "UsuarioFeign", url = "http://localhost:8001")
public interface UsuarioFeign {
    @GetMapping("/users")
    List<UsuarioDTO> getAllUsuarios();

}
