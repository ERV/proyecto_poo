package controlador;

import java.net.BindException;

public class Controlador {

	private String mensajeError;

	public boolean validarUsuario(String contrasena, String correo,
			String valorcontrasena,String ConfirmacionClave,boolean estado) throws BindException {
		mensajeError = "";
		boolean valCorreo = true;
		Funcion funcion = new Funcion();
		
		if (correo == null || correo.isEmpty()) {
            mensajeError = "Ingresar correo";
        } else {
            valCorreo = funcion.valCorreo(correo);
            if (valCorreo == false) {
                mensajeError = "El correo no es v�lido";
            } else {
                if (contrasena == null || contrasena.isEmpty()) {
                    mensajeError = "Ingrese su contrase�a";
                } else {
                    if (ConfirmacionClave == null || ConfirmacionClave.isEmpty()) {
                        mensajeError = "Confirme Contrase�a";
                    } else {

                        if (!contrasena.equals(ConfirmacionClave)) {
                            mensajeError = "No es valida su contrase�a";
                        }
                    }
                }
            }
		
        }// TODO Auto-generated method stub
		if (!mensajeError.isEmpty()){
			throw new BindException(mensajeError);
			//return true;
		}
		return true;
	}

}
