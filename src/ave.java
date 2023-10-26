package laboratorio.herencia;

public class ave extends animal{
	  public String raza = " soy un ave ";
	 public int años= 0;
	 
	 public void años () {
		 System.out.println (" tengo 20 años");
	 }
      public void aguila() {
          System.out.println(" mi desendencia es de aguila");
      }
      public static void main(String[] args) {
          ave ave = new ave();
          ave.ave();
          ave.aguila();
          ave.años();

          System.out.println(ave.raza);
          System.out.println(ave.mascota + " voladora");
          System.out.println(ave.años);
      }
  }

