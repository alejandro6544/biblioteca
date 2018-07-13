/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.ConnectBD;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dacastro
 */
public class Autor {
    private String nombreautor;
    private String apellidoautor;
    private String paisautor;

    public Autor() {
    }

    public Autor(String nombreautor, String apellidoautor, String paisautor) {
        this.nombreautor = nombreautor;
        this.apellidoautor = apellidoautor;
        this.paisautor = paisautor;
    }

    public String getNombreautor() {
        return nombreautor;
    }

    public void setNombreautor(String nombreautor) {
        this.nombreautor = nombreautor;
    }

    public String getApellidoautor() {
        return apellidoautor;
    }

    public void setApellidoautor(String apellidoautor) {
        this.apellidoautor = apellidoautor;
    }

    public String getPaisautor() {
        return paisautor;
    }

    public void setPaisautor(String paisautor) {
        this.paisautor = paisautor;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombreautor=" + nombreautor + ", apellidoautor=" + apellidoautor + ", paisautor=" + paisautor + '}';
    }

    public boolean insertAutor(String sql) {
        ConnectBD objCon = new ConnectBD();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
