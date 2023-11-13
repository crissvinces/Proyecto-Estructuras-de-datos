/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Lenovo
 */
public class ContactoEmpresa extends Contacto{
    private Contacto contactoDirector;
    private Contacto contactoAsistente;

    // Constructor
    public ContactoEmpresa(String nombre, String numeroTelefono, String foto, String direccion, String emailPersonal) {
        super(nombre, numeroTelefono, foto, direccion, emailPersonal);
        this.contactoDirector = null;
        this.contactoAsistente = null;
    }

    public Contacto getContactoDirector() {
        return contactoDirector;
    }

    public void setContactoDirector(Contacto contactoDirector) {
        this.contactoDirector = contactoDirector;
    }

    public Contacto getContactoAsistente() {
        return contactoAsistente;
    }

    public void setContactoAsistente(Contacto contactoAsistente) {
        this.contactoAsistente = contactoAsistente;
    }
    
    
}
