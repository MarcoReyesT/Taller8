package capaNegocio;

public class Contacto {

	private int uid;
	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;

	/**
	 * 
	 * @param contacto
	 */
	public String agregarContacto(Contacto contacto) {
		// TODO - implement Contacto.agregarContacto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public String eliminarContacto(Contacto contacto) {
		// TODO - implement Contacto.eliminarContacto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public String editarContacto(Contacto contacto) {
		// TODO - implement Contacto.editarContacto
		throw new UnsupportedOperationException();
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

}