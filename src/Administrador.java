
public class Administrador {
	String usuario="admin", contrase�a="admin2020";

	Administrador() {
		
	}
	
	Administrador(String usuario, String contrase�a) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}

	protected String getUsuario() {
		return usuario;
	}

	protected void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	protected String getContrase�a() {
		return contrase�a;
	}

	protected void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
}
