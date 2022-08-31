
public class TestaCondicionalAliquotas {
	public static void main(String[] args) {
		double salario = 4000.0;
		double impostoDeRenda;
		double deducao;
		
		if (salario < 1900) {
			impostoDeRenda = 0;
			deducao = 0;
			System.out.println("Valor do imposto de renda: " + impostoDeRenda + ". Valor a ser deduzido: " + deducao);
		} else if(salario <= 2800) {
			impostoDeRenda = salario * 0.075;
			deducao = 142;
			System.out.println("Valor do imposto de renda: " + impostoDeRenda + ". Valor a ser deduzido: " + deducao);
		} else if (salario <= 3751) {
			impostoDeRenda = salario * 0.15;
			deducao = 350;
			System.out.println("Valor do imposto de renda: " + impostoDeRenda + ". Valor a ser deduzido: " + deducao);
		} else if (salario <= 4664) {
			impostoDeRenda = salario * 0.225;
			deducao = 636;
			System.out.println("Valor do imposto de renda: " + impostoDeRenda + ". Valor a ser deduzido: " + deducao);
		} else {
			System.out.println("Ganha bem hein!!!");
		}
	}
}
