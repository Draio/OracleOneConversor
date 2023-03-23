import javax.swing.JOptionPane;

public class Converter {

	//mirar como poner conversion en tiempo real de la moneda
	
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 4850.00;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 5170.00;
		monedaEuro = (double) Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 5900.00;
		monedaLibra = (double) Math.round(monedaLibra*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
	}
	
	public void ConvertirPesosAYenes(double valor) {
		double monedaYen = valor / 36.80;
		monedaYen = (double) Math.round(monedaYen*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}
	
	public void ConvertirPesosAWones(double valor) {
		double monedaWon = valor / 3.70;
		monedaWon = (double) Math.round(monedaWon*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wones");
	}
	
}
