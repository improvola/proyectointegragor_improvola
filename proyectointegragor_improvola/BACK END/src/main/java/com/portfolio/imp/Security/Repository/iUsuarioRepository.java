/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.imp.Security.Repository;

import com.portfolio.imp.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}


/**
 *
 * @author Melanie
 */

package com.portfolio.imp.Security.Repository;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.portfolio.imp.Security.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>
{
    Optional<Usuario> findByNombreUsuario(final String nombreUsuario);
    
    boolean existsByNombreUsuario(final String nombreUsuario);
    
    boolean existsByEmail(final String email);
}