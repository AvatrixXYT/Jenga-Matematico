package com.avatrixxyt.logic;

public class SetDif {	
	public int DifOP(int dif){
		if (dif == 1) {
			return 3;
		} else if (dif == 2) {
			return 5;
		} else if (dif == 3) {
			return 6;
		}
		return 0;
	}
	public int DifNum(int dif){
		if (dif == 1) {
			return 100;
		} else if (dif == 2) {
			return 1000;
		} else if (dif == 3) {
			return 2000;
		}
		return 0;
	}
	public String DifText(int dif){
		if (dif == 1) {
			return "Fácil";
		} else if (dif == 2) {
			return "Medio";
		} else if (dif == 3) {
			return "Difícil";
		}
		return "Error";
	}
}
