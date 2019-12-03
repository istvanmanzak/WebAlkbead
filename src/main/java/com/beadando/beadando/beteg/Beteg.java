package com.beadando.beadando.beteg;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Beteg 
{

	@Id
	private int taj;
	private String vnev;
	private String knev;
	private int irsz;
	private String varos;
	private String utca;
	private int hsz;
	private String tel;
	
	
	public int getTaj() {
		return taj;
	}
	public void setTaj(int taj) {
		this.taj = taj;
	}
	public String getVnev() {
		return vnev;
	}
	public void setVnev(String vnev) {
		this.vnev = vnev;
	}
	public String getKnev() {
		return knev;
	}
	public void setKnev(String knev) {
		this.knev = knev;
	}
	public int getIrsz() {
		return irsz;
	}
	public void setIrsz(int irsz) {
		this.irsz = irsz;
	}
	public String getVaros() {
		return varos;
	}
	public void setVaros(String varos) {
		this.varos = varos;
	}
	public String getUtca() {
		return utca;
	}
	public void setUtca(String utca) {
		this.utca = utca;
	}
	public int getHsz() {
		return hsz;
	}
	public void setHsz(int hsz) {
		this.hsz = hsz;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
