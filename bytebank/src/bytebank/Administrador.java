package bytebank;

public class Administrador extends Funcionario implements Autenticable {
	
	private String clave;
	
	public String getClave() {
        return clave;
    }

    @Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if(this.clave == clave) {
            return true;
        } else {
            return false;
        }
	}
}