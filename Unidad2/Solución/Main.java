
public class Main {

	public static void main(String[] args) {
		
		Vehiculo a=new Vehiculo("Onix", 18000, "asc1234");
		Vehiculo b=new Vehiculo("Fiat",10000,"sde2323");
		System.out.println("El Vehiculo a es:"+a.toString());
		System.out.println("El Vehiculo b queda: "+b.toString());
		b.setMarca("Gol");
        System.out.println("El Vehiculo b queda:"+b.getMarca());
        System.out.println("El descuento de la patente de b queda en:"+b.descontarPatente());
}
	

}