package bytebank;
//                   extiende de
public class Gerente extends Funcionario {
	private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        if(this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }
    
    // Sobre-escritura del método
    public double getBonificacion() {
    	System.out.println("Ejecutando desde Gerente");
        return super.getBonificacion() + super.getSalario();
    }
}
