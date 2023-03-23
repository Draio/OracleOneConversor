import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Function monedas = new Function();
		
		boolean flag = true;
		
		 while(flag) {
			 
			 String opciones = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE,
					 null, new Object[] {"Conversor de Moneda", "Conversor de temperatura"}, "Selección")).toString();
		 
			 
			 switch(opciones) {
			 case "Conversor de Moneda":
				 String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
				 
				 if(ValidarNumero(input)) {
					 double Minput = Double.parseDouble(input);
					 monedas.Converter(Minput);
					 
					 int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					 
					 
					 if (JOptionPane.OK_OPTION == respuesta) {
						 System.out.println("Selecciona opción Afirmativa");
						}else {
							
							flag= false;
							JOptionPane.showMessageDialog(null, "Programa terminado");
						}	
						} else {
							
							JOptionPane.showMessageDialog(null, "Valor invalido");
						}
						
						break;
						
			/*
						case "Conversor de temperatura":
							input = JOptionPane.showInputDialog("Ingrese el valor de la temperatura que desead convertir ");
							if (ValidarNumero(input) == true) {
								double Minput = Double.parseDouble(input);
							}
							*/
				}
				 
			 }
		 }
	
	
	
	
	
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0);
			return true;		
				
		} catch (NumberFormatException e) {
			return false;
		}
	}

	
}
