package auto;

public interface Auto {
	
	void setVaihteisto(String jotain);
	void setMoottori (String jotain);
	void setKorimalli(String jotian);
	
	String getVaihteisto();
	String getMoottori();
	String getKorimalli();
}

class SÄHKÖ implements Auto {
	//Sähköautot ovat aina sedan automaatteja
	public String vaihteisto="A";
	public String korimalli="Sedan";
	public String moottori="Sähkö";
	
	@Override
	public void setVaihteisto (String jotain){
		System.out.println(this.moottori + "-autossa vaihteisto on aina tyyppiä ->" + this.vaihteisto);
	}
	public void setMoottori(String jotain){
		System.out.println(this.moottori +"-autossa moottori on aina tyyppiä ->"+ this.moottori);
	}
	public void setKorimalli(String jotain){
		System.out.println(this.moottori + "-autossa kori on aina tyyppiä ->"+ this.korimalli);
	}
	
	public String getVaihteisto(){
		return this.vaihteisto;
	}
	public String getMoottori(){
		return this.moottori;
	}
	public String getKorimalli(){
		return this.korimalli;
	}
}

class DIESEL implements Auto{
	//Dieselit ovat aina manuaaleja (M) ja korimalliltaan joko Sedan tai Van
		public String vaihteisto="M";
		public String korimalli="Sedan";
		public String moottori="Diesel";
		
		@Override
		public void setVaihteisto (String jotain){
			System.out.println(this.moottori + "-autossa vaihteisto on aina tyyppiä ->" + this.vaihteisto);
		}
		public void setMoottori(String jotain){
			System.out.println(this.moottori +"-autossa moottori on aina tyyppiä ->"+ this.moottori);
		}
		public void setKorimalli(String korimalli){
		if (korimalli=="Sedan"){
			this.korimalli=korimalli;
		}
		else{
			this.korimalli="Van";
		}
		System.out.println("Korimalli on tarkastettu ja on nyt ->"+ this.korimalli);
		}
		
	
		public String getVaihteisto(){
			return this.vaihteisto;
		}
		public String getMoottori(){
			return this.moottori;
		}
		public String getKorimalli(){
			return this.korimalli;
		}
	}	

class BENSIINI implements Auto{
	//Bensa voi olla joko manuaali tai automaatti. Kori voi olla Van tai Sedan
	public String vaihteisto= null;
	public String korimalli= null;
	public String moottori="Bensiini";
	
	@Override
	public void setVaihteisto (String vaihteisto){
		if (vaihteisto=="A"){
			this.vaihteisto="A";
		}
		else{
			this.vaihteisto="M";
		}
		System.out.println("Tässä autossa vaihteisto on tyyppiä ->" + this.vaihteisto);
	}
	public void setMoottori(String jotain){
		System.out.println(this.moottori +"-autossa moottori on aina tyyppiä ->"+ this.moottori);
	}
	public void setKorimalli(String korimalli){
	if (korimalli=="Sedan"){
		this.korimalli="Sedan";
	}
	else{
		this.korimalli="Van";
	}
	System.out.println("Korimalli on tarkastettu ja on nyt ->"+ this.korimalli);
	}
	

	public String getVaihteisto(){
		return this.vaihteisto;
	}
	public String getMoottori(){
		return this.moottori;
	}
	public String getKorimalli(){
		return this.korimalli;
	}
}		
