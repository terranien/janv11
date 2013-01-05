package q2_classe;

import java.util.StringTokenizer;

import q2_exception.DateException;

public class Date {
	private int jj;
	private int mm;
	private int aaaa;
	
	public Date() {
		this.jj = 1;
		this.mm = 1;
		this.aaaa = 2000;
	}
	public Date(String date) throws DateException{
		if(!isCorrectStringDate(date)){
			throw new DateException("Chaine de caractères non correcte");
		}
		StringTokenizer st = new StringTokenizer(date, "/");
		jj = Integer.parseInt(st.nextToken());
		if(jj < 0 || jj > 31){
			throw new DateException("j invalide");
		}
		mm = Integer.parseInt(st.nextToken());
		if(mm < 0 || mm > 12)
			throw new DateException("m invalide");
		aaaa = Integer.parseInt(st.nextToken());
	}
	public int getJj() {
		return jj;
	}
	public void setJj(int jj) {
		this.jj = jj;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getAaaa() {
		return aaaa;
	}
	public void setAaaa(int aaaa) {
		this.aaaa = aaaa;
	}
	@Override
	public String toString() {
		return "Date [jj=" + jj + ", mm=" + mm + ", aaaa=" + aaaa + "]";
	}
	public boolean isCorrectStringDate(String date){
		if(date.length() < 8 || date.length() > 10){
			return false;
		}
		int ascii1 = date.charAt(0);
		int ascii2 = date.charAt(1);
		int ascii3 = date.charAt(2);
		int ascii4 = date.charAt(3);
		int ascii5 = date.charAt(4);
		int ascii6 = date.charAt(5);
		int ascii7 = date.charAt(6);
		int ascii8 = date.charAt(7);
		int ascii9;
		int ascii10;
		if(ascii1 < 48 || ascii1 > 57) return false;
		if(ascii2 < 48 || ascii2 > 57) return false;
		if(ascii4 < 48 || ascii4 > 57) return false;
		if(ascii5 < 48 || ascii5 > 57) return false;	
		if(ascii7 < 48 || ascii7 > 57) return false;
		if(ascii8 < 48 || ascii8 > 57) return false;
		if(ascii3 != 47 || ascii6 != 47) return false;
		if(date.length() == 9){
			ascii9 = date.charAt(8);
			if(ascii9 < 48 || ascii9 > 57) return false;
		}
		if(date.length() == 10){
			ascii9 = date.charAt(8);
			ascii10 = date.charAt(9);
			if(ascii9 < 48 || ascii9 > 57) return false;
			if(ascii10 < 48 || ascii10 > 57) return false;
		}
		return true;
	}
	
}
