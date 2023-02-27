package homework002;

import java.util.ArrayList;

public class Takim {
	
	private String name;
	private int puan;
	private int kasa;
	
	private ArrayList<Takim> takimlarArrayList;
	


	public Takim(String name, int puan, int kasa) {
		super();
		this.name = name;
		this.puan = puan;
		this.kasa = kasa;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getKasa() {
		return kasa;
	}

	public void setKasa(int kasa) {
		this.kasa = kasa;
	}

	public ArrayList<Takim> getTakimlarArrayList() {
		return takimlarArrayList;
	}

	public void setTakimlarArrayList(ArrayList<Takim> takimlarArrayList) {
		this.takimlarArrayList = takimlarArrayList;
	}


	@Override
	public String toString() {
		return  name ;
	}

	

	

	

}
