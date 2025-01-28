package org.agprojeto.bibliotecaescolar.dao;

import org.agprojeto.bibliotecaescolar.dto.UsuarioDTO;

import java.math.BigInteger;

public interface UsuarioDAO {
    void inserirUsuario(UsuarioDTO usuarioDTO);
    void atualizarUsuario(UsuarioDTO usuarioDTO);
    void excluirUsuario(Integer matricula);
    void buscarUsuarioPorMatricula(Integer matricula);
}
