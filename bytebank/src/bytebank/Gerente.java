package bytebank;

public class Gerente extends Funcionario implements Autenticable {
	
	private String clave;

    public String getClave() {
        return clave;
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
    
    @Override
    public double getBonificacion() {
    	System.out.println("Ejecutando desde Gerente");
        return super.getSalario();
    }
}
