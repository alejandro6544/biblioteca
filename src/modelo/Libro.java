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
public class Libro {

    private String idlibro;
    private String nombrelibro;
    private int numpaginaslibro;
    private double preciolibro;
    private String anioedicionlibro;
    private String numEdicion;

    public Libro() {
    }

    public Libro(String idlibro, String nombrelibro, int numpaginaslibro, double preciolibro, String anioedicionlibro, String numEdicion) {
        this.idlibro = idlibro;
        this.nombrelibro = nombrelibro;
        this.numpaginaslibro = numpaginaslibro;
        this.preciolibro = preciolibro;
        this.anioedicionlibro = anioedicionlibro;
        this.numEdicion = numEdicion;

    }

    public String getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(String idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombrelibro() {
        return nombrelibro;
    }

    public void setNombrelibro(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

    public int getNumpaginaslibro() {
        return numpaginaslibro;
    }

    public void setNumpaginaslibro(int numpaginaslibro) {
        this.numpaginaslibro = numpaginaslibro;
    }

    public double getPreciolibro() {
        return preciolibro;
    }

    public void setPreciolibro(double preciolibro) {
        this.preciolibro = preciolibro;
    }

    public String getAnioedicionlibro() {
        return anioedicionlibro;
    }

    public void setAnioedicionlibro(String anioedicionlibro) {
        this.anioedicionlibro = anioedicionlibro;
    }

    public String getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(String numEdicion) {
        this.numEdicion = numEdicion;
    }

    @Override
    public String toString() {
        return "Libro{" + "idlibro=" + idlibro + ", nombrelibro=" + nombrelibro + ", numpaginaslibro=" + numpaginaslibro + ", preciolibro=" + preciolibro + ", anioedicionlibro=" + anioedicionlibro + ", numEdicion=" + numEdicion + '}';
    }

    public boolean insertLibro(String sql) {

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
