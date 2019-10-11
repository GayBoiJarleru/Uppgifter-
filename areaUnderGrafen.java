public class areaUnderGrafen {
	public static void main(String[] args) {
		double start = 0;
		double slut = 3.4;
		double area = 0;
		
		int antalRektanglar = 3;
		double deltax = (slut-start)/antalRektanglar;
		
		double x = start;
		while (x<slut) {
			area += (0.5*x*x*x-2*x*x+x+3)*deltax;
		    x += deltax;
		}
		System.out.println("Arean under grafen är " + area);


	}
}