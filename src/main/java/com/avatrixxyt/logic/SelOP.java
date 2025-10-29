package com.avatrixxyt.logic;

public class SelOP {
    public static int RespuestaCO;
	public String Seleccion(int Dif) {
		int num1, num2, pot, mult;
		GenNum gn = new GenNum();
		Operaciones op = new Operaciones();
		SetDif sd = new SetDif();
		num1 = gn.Num(sd.DifNum(Dif));
		num2 = gn.Num2(sd.DifNum(Dif));
		pot = gn.Pontencia();
		mult = gn.Mult();
		int operacion = gn.OP(sd.DifOP(Dif));
		String resultado;
		switch (operacion) {
			case 0:
				resultado = op.Suma(num1, num2);
                RespuestaCO = num1 + num2;
                System.out.println(RespuestaCO);
				break;
			case 1:
				resultado = op.Resta(num1, num2);
                RespuestaCO = num1 - num2;
                System.out.println(RespuestaCO);
				break;
			case 2:
				resultado = op.Multi(num1, mult);
                RespuestaCO = num1 * mult;
                System.out.println(RespuestaCO);
				break;
			case 3:
				resultado = op.Div(num1, mult);
                RespuestaCO = num1 / mult;
                System.out.println(RespuestaCO);
				break;
			case 4:
				resultado = op.Raiz(num1);
                RespuestaCO = (int) Math.sqrt(num1);
                System.out.println(RespuestaCO);
				break;
			case 5:
				resultado = op.Potencia(num1, pot);
                RespuestaCO = (int) Math.pow(num1, pot);
                System.out.println(RespuestaCO);
				break;
			default:
				resultado = "Operacion no valida";
				break;
		}
		return resultado;
	}
}
