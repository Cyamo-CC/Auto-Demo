package auto;

public class MainAutoTest {

	public static void main(String[] args) {
		Auto sahkoauto = EnumAutoFactory.SÄHKÖ.createAuto();
		sahkoauto.setMoottori("Sahko");
		sahkoauto.setMoottori("Bensiini");
		sahkoauto.setMoottori("Diesel");
		sahkoauto.setKorimalli("Van");
		sahkoauto.setKorimalli("Sedan");
		sahkoauto.setVaihteisto("A");
		sahkoauto.setVaihteisto("M");
		
		Auto diesel = EnumAutoFactory.DIESEL.createAuto();
		diesel.setMoottori("Sahko");
		diesel.setMoottori("Bensiini");
		diesel.setMoottori("Diesel");
		diesel.setKorimalli("Van");
		diesel.setKorimalli("Sedan");
		diesel.setVaihteisto("A");
		diesel.setVaihteisto("M");
		
		Auto bensiini = EnumAutoFactory.BENSIINI.createAuto();
		bensiini.setMoottori("Sahko");
		bensiini.setMoottori("Bensiini");
		bensiini.setMoottori("Diesel");
		bensiini.setKorimalli("Van");
		bensiini.setKorimalli("Sedan");
		bensiini.setVaihteisto("A");
		bensiini.setVaihteisto("M");
	}
}
