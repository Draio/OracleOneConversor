import javax.swing.JOptionPane;

public class Function  {
	Converter monedas = new Converter();
	
	//ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
	public void Converter(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"De pesos a Dolar", "De pesos a Euro", "De pesos a libras", "De pesos a Yen","De pesos a Won"}, 
						"Seleccion")).toString();
		
		switch(opcion){
		case "De pesos a Dolar":
			monedas.ConvertirPesosADolares(Minput);
			break;
			
		case "De pesos a Euro":
			monedas.ConvertirPesosAEuros(Minput);
			break;
			
		case "De pesos a libras" :
			monedas.ConvertirPesosALibras(Minput);
			break;
			
		case "De pesos a Yen":
			monedas.ConvertirPesosAYenes(Minput);
			break;
			
		case "De pesos a Won":
			monedas.ConvertirPesosAWones(Minput);
			break;
		}
		
	}

}
