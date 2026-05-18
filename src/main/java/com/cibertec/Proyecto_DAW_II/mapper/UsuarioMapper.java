package com.cibertec.Proyecto_DAW_II.mapper;

import com.cibertec.Proyecto_DAW_II.dto.UserResponseDTO;
import com.cibertec.Proyecto_DAW_II.entity.Rol;
import com.cibertec.Proyecto_DAW_II.entity.Usuario;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UsuarioMapper {

    public UserResponseDTO userResponseDTO(Usuario usuario,String jwtToken){

        if(usuario == null) return null;

        UserResponseDTO dto = new UserResponseDTO();
        dto.setToken(jwtToken);
        dto.setUsername(usuario.getUsername());
        dto.setEmail(usuario.getEmail());

        //mapeamos el set del objeto rol  a un set de string simpless

        Set<String> rolesNames= usuario.getRoles().stream()
                .map(Rol::getNombre)
                .collect(Collectors.toSet());
        dto.setRoles(RolesName);
        return dto;

    }
}
