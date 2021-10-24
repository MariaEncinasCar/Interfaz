package Datos;

import clasesfaceboot.Usuario;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class UsuariosDatos {
    
    private List<Usuario> usuarios = new ArrayList<>();
        
    public UsuariosDatos() {
        usuarios = new ArrayList<Usuario>();
    }
    
    public void add(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    /**
     * Método para comprovar posibilidad de registro.
     * @param email
     * @return 
     */
    public boolean existente(String email) {
                
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            
            if (u.getEmail().equals(email)) {
              return true;  
            }
        }
        return false;
    }
    
    /**
     * Método para mantener.
     * @param email
     * @param contrasenia
     * @return 
     */
    public Usuario usuario(String email, String contrasenia) {
        Usuario registrado = null;
        
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            
            if (u.getEmail().equals(email) && u.getContrasena().equals(contrasenia)) {
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
   
    @Override
    public String toString() {
        return "UsuariosDatos{" + "usuarios=" + usuarios.size() + '}';
    }
}
