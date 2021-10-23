package Datos;

import clasesfaceboot.Usuario;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class UsuariosDatos {
    
    private List<Usuario> usuarios = new ArrayList<>();
    
    /**
     * Método para comprovar posibilidad de registro.
     * @param nombre
     * @param email
     * @return 
     */
    public boolean existente(String nombre, String email) {
                
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            
            if (u.getEmail().equals(email) && u.getNombre().equals(nombre)) {
              return true;  
            }
        }
        return false;
    }
    
    /**
     * Método para mantener.
     * @param nombre
     * @param contrasenia
     * @return 
     */
    public Usuario usuario(String nombre, String contrasenia) {
        Usuario registrado = null;
        
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            
            if (u.getNombre().equals(nombre) && u.getContrasena().equals(contrasenia)) {
              registrado = usuarios.get(i);
            }
        }
        return registrado;
    }
    
    public void guardar(String nombre, String email, String contrasena, 
            String celular, String sexo, Date fechaNac, int edad) {
        Usuario nuevo = new Usuario(nombre, email, contrasena, celular, sexo, fechaNac, edad);
        usuarios.add(nuevo);
    }
}
