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
public class LibroPorAutor {

    private String idlibrolp;
    private int idautorlp;

    public LibroPorAutor() {
    }

    public LibroPorAutor(String idlibrolp, int idautorlp) {
        this.idlibrolp = idlibrolp;
        this.idautorlp = idautorlp;
    }

    public String getIdlibrolp() {
        return idlibrolp;
    }

    public void setIdlibrolp(String idlibrolp) {
        this.idlibrolp = idlibrolp;
    }

    public int getIdautorlp() {
        return idautorlp;
    }

    public void setIdautorlp(int idautorlp) {
        this.idautorlp = idautorlp;
    }

    @Override
    public String toString() {
        return "LibroPorAutor{" + "idlibrolp=" + idlibrolp + ", idautorlp=" + idautorlp + '}';
    }

    public boolean insert(String sql) {
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
