package exercicio4;

public class FabricaCarros {

	private static int proximoNumChassis = 0;
	
	public static Carro criaCarro(String cor) {
		
		Carro carro = new Carro(cor, getProximoNumChassis());
		setProximoNumChassis( getProximoNumChassis() + 1 );
		return carro;
	}

	private static int getProximoNumChassis() {
		return proximoNumChassis;
	}

	private static void setProximoNumChassis(int proximoNumChassis) {
		FabricaCarros.proximoNumChassis = proximoNumChassis;
	}
}
