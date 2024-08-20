package Proyecto2_RedSocial;
//so kellyan
//Esta parte es para creacion de todo

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class login{
    private String usuario;
    private String password;
    private static login usuarioLogueado;
    private int puntos;
    private String fechaIngreso;
    private boolean activo;
    private static String[] usuarios = new String[100];
    private static String[] contraseñas = new String[100];
    private static String[] fechasIngreso = new String[100];
    private static boolean[] activos = new boolean[100];
    private static int count = 0;

    public login() {
    }

    public login(String user, String password) {
        this.usuario = user;
        this.password = password;
        this.puntos = 0;
        this.fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        this.activo = true;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public int getPuntos() {
        return puntos;
    }

    public String [] getFechaIngreso() {
        return fechasIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    // Método para cambiar la contraseña
    public boolean cambiarContraseña(String nuevaContraseña) {
        if (nuevaContraseña.length() != 5) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener exactamente 5 caracteres.");
            return false;
        }
        this.password = nuevaContraseña;
        JOptionPane.showMessageDialog(null, "Contraseña cambiada exitosamente.");
        return true;
    }

    // Método para cambiar el nombre de usuario
    public boolean cambiarUsuario(String nuevoUsuario) {
        for (int i = 0; i < count; i++) {
            if (usuarios[i].equalsIgnoreCase(nuevoUsuario)) {
                JOptionPane.showMessageDialog(null, "El usuario ya existe, favor elegir otro Nombre de Usuario");
                return false;
            }
        }
        this.usuario = nuevoUsuario;
        JOptionPane.showMessageDialog(null, "Nombre de usuario cambiado exitosamente.");
        return true;
    }

    // Método para eliminar la cuenta
    public boolean eliminarCuenta() {
    boolean eliminacionExitosa = false;
    for (int i = 0; i < count; i++) {
        if (usuarios[i].equalsIgnoreCase(usuario)) {
            usuarios[i] = null;
            contraseñas[i] = null;
            fechasIngreso[i] = null;
            activos[i] = false;
            usuario = null;
            password = null;
            puntos = 0;
            fechaIngreso = null;
            activo = false;
            JOptionPane.showMessageDialog(null, "Cuenta eliminada exitosamente.");
            eliminacionExitosa = true;
            break;
        }
    }
    return eliminacionExitosa;
}
    
    
  
    //de aqui empiza el ingreso de datos
    public boolean ingreso(String usuario, String password) {
        for (int i = 0; i < count; i++) {
            if (usuarios[i].equalsIgnoreCase(usuario)) {
                if (contraseñas[i].equals(password)) {
                    this.usuario = usuario;
                    this.password = password;
                    this.activo = true;
                    usuarioLogueado = this;
                    String message = "Bienvenido " + usuario;
                    System.out.println(message);
                    JOptionPane.showMessageDialog(null, message);
                    return true;
                } else {
                    String message = "Contraseña incorrecta";
                    System.out.println(message);
                    JOptionPane.showMessageDialog(null, message);
                    return false;
                }
            }
        }
        String message = "Favor Registrarse";
        System.out.println(message);
        JOptionPane.showMessageDialog(null, message);
        return false;
    }
    
    public boolean crearUsuario(String usuario, String password) {
        if (usuario.length() == 0 || password.length() != 5) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña no válidos. La contraseña debe tener exactamente 5 caracteres.");
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (usuarios[i].equalsIgnoreCase(usuario)) {
                JOptionPane.showMessageDialog(null, "El usuario ya existe, favor elegir otro Nombre de Usuario");
                return false;
            }
        }

        if (count < usuarios.length) {
            usuarios[count] = usuario;
            contraseñas[count] = password;
            fechasIngreso[count] = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            activos[count] = true;
            count++;
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden registrar más usuarios.");
            return false;
        }
    }
    public String[] obtenerOponentesDisponibles() {
        int countOponentes = 0;
        for (int i = 0; i < count; i++) {
            if (!usuarios[i].equalsIgnoreCase(usuario) && activos[i]) {
                countOponentes++;
            }
        }

        String[] oponentesDisponibles = new String[countOponentes];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (!usuarios[i].equalsIgnoreCase(usuario) && activos[i]) {
                oponentesDisponibles[index++] = usuarios[i];
            }
        }
        return oponentesDisponibles;
    }


    
    

    boolean cambiarNombreUsuario(String nuevoUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

