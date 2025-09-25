package com.avatrixxyt.logic;

public class SelOP {
	public String Seleccion(int Dif) {
		GenNum gn = new GenNum();
		Operaciones op = new Operaciones();
		SetDif sd = new SetDif();
		int operacion = gn.OP(sd.DifOP(Dif));
		String resultado;
		switch (operacion) {
			case 0:
				resultado = op.Suma(gn.Num(sd.DifNum(Dif)), gn.Num2(sd.DifNum(Dif)));
				break;
			case 1:
				resultado = op.Resta(gn.Num(sd.DifNum(Dif)), gn.Num2(sd.DifNum(Dif)));
				break;
			case 2:
				resultado = op.Multi(gn.Num(sd.DifNum(Dif)), gn.Num2(sd.DifNum(Dif)));
				break;
			case 3:
				resultado = op.Div(gn.Num(sd.DifNum(Dif)), gn.Num2(sd.DifNum(Dif)));
				break;
			case 4:
				resultado = op.Raiz(gn.Num2(sd.DifNum(Dif)));
				break;
			case 5:
				resultado = op.Potencia(gn.Num(sd.DifNum(Dif)), gn.Pontencia());
				break;
			default:
				resultado = "Operacion no valida";
				break;
		}
		return resultado;
	}
	
	public int RespuestaCo(int Dif){
        return 0;
    }
}
