import java.util.Scanner;
public class CompraDelArregloFloral {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int PrecioDelArregloFloralTipo1 = 70;
      int PrecioDelArregloFloralTipo2 = 120;

        System.out.println("Ingrese la cantidada de dinero que usted tiene disponible: ");
      int DineroDisponible = input.nextInt();

      int CantidadDeArregloFloralDelTipo1 = DineroDisponible / PrecioDelArregloFloralTipo1;
      int CantidadDeArregloFloralDelTipo2 = DineroDisponible / PrecioDelArregloFloralTipo2;

        System.out.println("Con "+ DineroDisponible +" pesos,puedes comprar: ");
        System.out.println(CantidadDeArregloFloralDelTipo1 + " arreglo floral de " + PrecioDelArregloFloralTipo1 + " pesos cada uno" );
        System.out.println(CantidadDeArregloFloralDelTipo2 + " arreglo floral de " + PrecioDelArregloFloralTipo2 + " pesos cada uno");
   }
}