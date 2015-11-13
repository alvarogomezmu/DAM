/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garaje;

/**
 *
 * @author AlumnoT
 */
public class Motor {

    private int aceite = 0;
    protected static int cv;

    public Motor() {
    }

    public Motor(int cv) {
        this.cv = cv;
    }

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

    public int getCv() {
        return cv;
    }
}
