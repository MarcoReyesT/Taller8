package capaNegocio;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contacto {

    private int uid;
    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;
    private Empresa empresa;
    private Ciudad ciudad;

    /**
     *
     * @param contacto
     */
    public String agregarContacto(Contacto contacto) {
        String respuesta = "";
        respuesta = agregarContactoServicioWeb(contacto.getNombre(), contacto.getApellido(), contacto.getMail(), contacto.getTelefono(), contacto.getCiudad().getNombre(), contacto.getEmpresa().getNombre());
        return respuesta;
    }

    /**
     *
     * @param contacto
     */
    public String eliminarContacto(Contacto contacto) {
        String respuesta = "";
        respuesta = eliminarContactoServicioWeb(contacto.getUid(), contacto.getEmpresa().getUid(), contacto.getCiudad().getUid());
        return respuesta;
    }

    /**
     *
     * @param contacto
     */
    public String editarContacto(Contacto contacto) {
        String respuesta = "";
        respuesta = editarContactoServicioWeb(contacto.getUid(), contacto.getNombre(), contacto.getApellido(), contacto.getTelefono(), contacto.getMail(), contacto.getEmpresa().getUid(), contacto.getEmpresa().getNombre(), contacto.getCiudad().getUid(), contacto.getCiudad().getNombre());
        return respuesta;
    }
    
    public List<Contacto> busquedaAvanzadaCliente(Contacto contacto) {
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String mail = "";
        List<Contacto> lista = new ArrayList<Contacto>();
        if (contacto.getApellido() == null) {
            apellido = "";
        }
        if (contacto.getNombre() == null) {
            nombre = "";
        }
        if (contacto.getTelefono() == null) {
            telefono = "";
        }
        if (contacto.getMail() == null) {
            mail = "";
        }
        String respuestaWS = busquedaAvanzada(contacto.getNombre(), contacto.getApellido(), contacto.getTelefono(), contacto.getMail());
        
        Gson gson = new Gson();
        Contacto[] mcArray = gson.fromJson(respuestaWS, Contacto[].class);
        List<Contacto> mcList = Arrays.asList(mcArray);
        lista = mcList;
        return lista;
    }
    
    public List<Contacto> busquedaSimpleCliente(String textoBusqueda){
        List<Contacto> lista = new ArrayList<Contacto>();
        String respuestaWS = busquedaSimple(textoBusqueda);
        
        Gson gson = new Gson();
        Contacto[] mcArray = gson.fromJson(respuestaWS, Contacto[].class);
        List<Contacto> mcList = Arrays.asList(mcArray);
        lista = mcList;
        return lista;
    }
    

    public int getUid() {
        return this.uid;
    }

    /**
     *
     * @param uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return this.mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return this.telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    private static String agregarContactoServicioWeb(java.lang.String nombreContacto, java.lang.String apellidoContacto, java.lang.String mailContacto, java.lang.String telefonoContacto, java.lang.String nombreCiudad, java.lang.String nombreEmpresa) {
        capaServicio.Servicio_Service service = new capaServicio.Servicio_Service();
        capaServicio.Servicio port = service.getServicioPort();
        return port.agregarContactoServicioWeb(nombreContacto, apellidoContacto, mailContacto, telefonoContacto, nombreCiudad, nombreEmpresa);
    }

    private static String editarContactoServicioWeb(int uid, java.lang.String nuevoNombreContacto, java.lang.String nuevoApellidoContacto, java.lang.String nuevoTelefonoContacto, java.lang.String nuevoMailContacto, int uidEmpresa, java.lang.String nuevoNombreEmpresa, int uidCiudad, java.lang.String nuevoNombreCiudad) {
        capaServicio.Servicio_Service service = new capaServicio.Servicio_Service();
        capaServicio.Servicio port = service.getServicioPort();
        return port.editarContactoServicioWeb(uid, nuevoNombreContacto, nuevoApellidoContacto, nuevoTelefonoContacto, nuevoMailContacto, uidEmpresa, nuevoNombreEmpresa, uidCiudad, nuevoNombreCiudad);
    }

    private static String eliminarContactoServicioWeb(int uidContacto, int uidEmpresa, int uidCiudad) {
        capaServicio.Servicio_Service service = new capaServicio.Servicio_Service();
        capaServicio.Servicio port = service.getServicioPort();
        return port.eliminarContactoServicioWeb(uidContacto, uidEmpresa, uidCiudad);
    }

    private static String busquedaSimple(java.lang.String textoBusqueda) {
        capaServicio.Servicio_Service service = new capaServicio.Servicio_Service();
        capaServicio.Servicio port = service.getServicioPort();
        return port.busquedaSimple(textoBusqueda);
    }

    private static String busquedaAvanzada(java.lang.String nombre, java.lang.String apellido, java.lang.String telefono, java.lang.String mail) {
        capaServicio.Servicio_Service service = new capaServicio.Servicio_Service();
        capaServicio.Servicio port = service.getServicioPort();
        return port.busquedaAvanzada(nombre, apellido, telefono, mail);
    }

}
