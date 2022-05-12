package heranca;

public class Panimal {

	public static void main(String[] args) {
	
		Animal ani = new Animal();
		Cachorro ca = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica preg= new Preguica();
		
		ca.nome="Nasus";
		ca.idade="3";
		ca.som="Late";	
		ca.correr="Corre";
		
		cav.nome="Hecarim";
		cav.idade="20";
		cav.som="Relincha";
		cav.correr="Corre";
		
		preg.nome="Yummi";
		preg.idade="30";
		preg.som="Não Sei";
		preg.escalando="Subindo";
		
		System.out.println("Cachorro: "+ "/"+ ca.nome  + "/"  + ca.idade + "/"+ca.som  + "/"+ ca.correr);
		System.out.println("Cavalo: " + "/" + cav.nome + "/" + cav.idade + "/" +cav.som+ "/" + cav.correr);
		System.out.println("Preguiça: "+ "/"+ preg.nome + "/" + preg.idade + "/"+ preg.som + "/"+preg.escalando);
	
	
	
	
	}
	
	
	
	
	

}
