import java.util.Scanner;

public class CuerposGeometricos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Metodos metodos = new Metodos();
        int opcion;
        double areaLateral, areaTotal, volumen, areaDeBase, altura, radio, arista, lados, apotema, perimetro,
                generatriz;
        do {
            metodos.Menu();
            if (lector.hasNextInt()) {
                opcion = lector.nextInt();
                lector.nextLine();
                if (opcion >= 0 && opcion <= 16) {
                    switch (opcion) {
                        case 1:
                            // prisma
                            System.out.println("Ingrese los datos del prisma");
                            System.out.print("Ingrese la medida de los lados: ");
                            lados = metodos.validarEntradaNumerica(lector);
                            lados = metodos.validarNumeroPositivo(lector);
                            metodos.setLados(lados);
                            System.out.print("Ingrese la altura: ");
                            altura = metodos.validarEntradaNumerica(lector);
                            altura = metodos.validarNumeroPositivo(lector);
                            metodos.setAltura(altura);
                            System.out.println("Ingrese la medida del apotema: ");
                            apotema = metodos.validarEntradaNumerica(lector);
                            apotema = metodos.validarNumeroPositivo(lector);
                            metodos.setApotema(apotema);
                            metodos.Prisma(lados, altura, apotema);

                            break;
                        case 2:
                            // cilindro
                            System.out.println("Ingrese los datos del cilindro");
                            System.out.print("Ingrese la medida del radio: ");
                            radio = metodos.validarEntradaNumerica(lector);
                            radio = metodos.validarNumeroPositivo(lector);
                            metodos.setRadio(radio);
                            System.out.print("Ingrese la altura: ");
                            altura = metodos.validarEntradaNumerica(lector);
                            altura = metodos.validarNumeroPositivo(lector);
                            metodos.setAltura(altura);
                            metodos.Cilindro(radio, altura);

                            break;
                        case 3:
                            // piramide
                            System.out.println("Ingrese los datos de la pirámide");
                            System.out.print("Ingrese la medida de los lados: ");
                            lados = metodos.validarEntradaNumerica(lector);
                            lados = metodos.validarNumeroPositivo(lector);
                            metodos.setLados(lados);
                            System.out.println("Ingrese la medida del apotema: ");
                            apotema = metodos.validarEntradaNumerica(lector);
                            apotema = metodos.validarNumeroPositivo(lector);
                            metodos.setApotema(apotema);
                            metodos.Piramide(lados, apotema);
                            break;
                        case 4:
                            // cono
                            System.out.println("Ingrese los datos del cono");
                            System.out.println("Ingrese la medida de la generatriz: ");
                            generatriz = metodos.validarEntradaNumerica(lector);
                            generatriz = metodos.validarNumeroPositivo(lector);
                            metodos.setArista(generatriz);
                            System.out.print("Ingrese la medida del radio: ");
                            radio = metodos.validarEntradaNumerica(lector);
                            radio = metodos.validarNumeroPositivo(lector);
                            metodos.setRadio(radio);
                            System.out.print("Ingrese la altura: ");
                            altura = metodos.validarEntradaNumerica(lector);
                            altura = metodos.validarNumeroPositivo(lector);
                            metodos.setAltura(altura);
                            metodos.Cono(generatriz, radio, altura);
                            break;
                        case 5:
                            // esfera
                            System.out.println("Ingrese los datos de la esfera");
                            System.out.print("Ingrese la medida del radio: ");
                            radio = metodos.validarEntradaNumerica(lector);
                            radio = metodos.validarNumeroPositivo(lector);
                            metodos.setRadio(radio);
                            metodos.Esfera(radio);
                            break;
                        case 6:
                            // zona esferica
                            System.out.println("Ingrese los datos de la zona esférica");
                            System.out.print("Ingrese la medida del radio mayor: ");
                            radio = metodos.validarEntradaNumerica(lector);
                            radio = metodos.validarNumeroPositivo(lector);
                            metodos.setRadio(radio);
                            System.out.println("Ingrese la medida del radio menor sub 1: ");
                            double radiosub1 = metodos.validarEntradaNumerica(lector);
                            radiosub1 = metodos.validarNumeroPositivo(lector);
                            metodos.setRadiosub1(radiosub1);
                            System.out.println("Ingrese la medida del radio menor sub 2: ");
                            double radiosub2 = metodos.validarEntradaNumerica(lector);
                            radiosub2 = metodos.validarNumeroPositivo(lector);
                            metodos.setRadiosub2(radiosub2);
                            System.out.print("Ingrese la altura: ");
                            altura = metodos.validarEntradaNumerica(lector);
                            altura = metodos.validarNumeroPositivo(lector);
                            metodos.setAltura(altura);
                            metodos.ZonaEsf(radio, altura, radiosub1, radiosub2);

                            break;
                        case 7:
                            // casquete esferico
                            System.out.println("Ingrese los datos del casquete esférico");
                            System.out.print("Ingrese la medida del radio: ");
                            radio = metodos.validarEntradaNumerica(lector);
                            radio = metodos.validarNumeroPositivo(lector);
                            metodos.setRadio(radio);
                            System.out.print("Ingrese la medida de la altura: ");
                            altura = metodos.validarEntradaNumerica(lector);
                            altura = metodos.validarNumeroPositivo(lector);
                            metodos.setAltura(altura);
                            metodos.CasqueteEsf(radio, altura);
                            break;
                        case 8:
                            // Huso esférico y cuña esférica
                            System.out.println("Ingrese los datos del huso esférico y cuña esférica");
                            System.out.print("Ingrese la medida del radio: ");
                            radio = metodos.validarEntradaNumerica(lector);
                            radio = metodos.validarNumeroPositivo(lector);
                            metodos.setRadio(radio);
                            System.out.print("Ingrese la medida del angulo: ");
                            double angulo = metodos.validarEntradaNumerica(lector);
                            angulo = metodos.validarNumeroPositivo(lector);
                            metodos.setAngulo(angulo);
                            metodos.HusoCuñaEsferica(radio, angulo);
                            break;
                        case 9:
                            // ortoedro
                            System.out.println("Ingrese los datos del ortoedro");
                            System.out.print("Ingrese la medida de la longitud: ");
                            double longitud = metodos.validarEntradaNumerica(lector);
                            longitud = metodos.validarNumeroPositivo(lector);
                            metodos.setLongitud(longitud);
                            System.out.print("Ingrese la medida de la altura: ");
                            altura = metodos.validarEntradaNumerica(lector);
                            altura = metodos.validarNumeroPositivo(lector);
                            metodos.setAltura(altura);
                            System.out.print("Ingrese la medida de la profundidad: ");
                            double profundidad = metodos.validarEntradaNumerica(lector);
                            profundidad = metodos.validarNumeroPositivo(lector);
                            metodos.setProfundidad(profundidad);
                            metodos.Ortoedro(longitud, altura, profundidad);

                            break;
                        case 10:
                            // tetraedro
                            System.out.println("Ingrese los datos del tetraedro");
                            System.out.print("Ingrese la medida de la arista: ");
                            arista = metodos.validarEntradaNumerica(lector);
                            arista = metodos.validarNumeroPositivo(lector);
                            metodos.setArista(arista);
                            metodos.Tetraedro(arista);

                            break;
                        case 11:
                            // hexaedro
                            System.out.println("Ingrese los datos del hexaedro");
                            System.out.print("Ingrese la medida de la arista: ");
                            arista = metodos.validarEntradaNumerica(lector);
                            arista = metodos.validarNumeroPositivo(lector);
                            metodos.setArista(arista);
                            metodos.Hexaedro(arista);

                            break;
                        case 12:
                            // octaedro
                            System.out.println("Ingrese los datos del octaedro");
                            System.out.print("Ingrese la medida de la arista: ");
                            arista = metodos.validarEntradaNumerica(lector);
                            arista = metodos.validarNumeroPositivo(lector);
                            metodos.setArista(arista);
                            metodos.Octaedro(arista);

                            break;
                        case 13:
                            // dodecaedro
                            System.out.println("Ingrese los datos del dodecaedro");
                            System.out.print("Ingrese la medida de la arista: ");
                            arista = metodos.validarEntradaNumerica(lector);
                            arista = metodos.validarNumeroPositivo(lector);
                            metodos.setArista(arista);
                            metodos.Dodecaedro(arista);

                            break;
                        case 14:
                            // icosaedro
                            System.out.println("Ingrese los datos del icosaedro");
                            System.out.print("Ingrese la medida de la arista: ");
                            arista = metodos.validarEntradaNumerica(lector);
                            arista = metodos.validarNumeroPositivo(lector);
                            metodos.setArista(arista);
                            metodos.Icosaedro(arista);

                            break;
                        case 15:
                            // tronco de cono
                            System.out.println("Ingrese los datos del tronco de cono");
                            System.out.print("Ingrese la medida del radio: ");
                            radio = metodos.validarEntradaNumerica(lector);
                            radio = metodos.validarNumeroPositivo(lector);
                            metodos.setRadio(radio);
                            System.out.print("Ingrese la medida del radio sub 1: ");
                            radiosub1 = metodos.validarEntradaNumerica(lector);
                            radiosub1 = metodos.validarNumeroPositivo(lector);
                            metodos.setRadiosub1(radiosub1);
                            System.out.print("Ingrese la medida de la generatriz: ");
                            generatriz = metodos.validarEntradaNumerica(lector);
                            generatriz = metodos.validarNumeroPositivo(lector);
                            metodos.setGeneratriz(generatriz);
                            System.out.print("Ingrese la medida de la altura: ");
                            altura = metodos.validarEntradaNumerica(lector);
                            altura = metodos.validarNumeroPositivo(lector);
                            metodos.setAltura(altura);
                            metodos.TroncoDeCono(radio, radiosub1, generatriz, altura);
                            break;
                        case 16:
                            // tronco de piramide
                            System.out.println("Ingrese los datos del tronco de pirámide");
                            System.out.print("Ingrese la medida del apotema: ");
                            apotema = metodos.validarEntradaNumerica(lector);
                            apotema = metodos.validarNumeroPositivo(lector);
                            metodos.setApotema(apotema);
                            System.out.print("Ingrese la medida de la altura: ");
                            altura = metodos.validarEntradaNumerica(lector);
                            altura = metodos.validarNumeroPositivo(lector);
                            metodos.setAltura(altura);
                            System.out.print("Ingrese la medida de los lado mayor: ");
                            lados = metodos.validarEntradaNumerica(lector);
                            lados = metodos.validarNumeroPositivo(lector);
                            metodos.setLados(lados);
                            System.out.print("Ingrese la medida del lado menor: ");
                            double ladoMenor = metodos.validarEntradaNumerica(lector);
                            ladoMenor = metodos.validarNumeroPositivo(lector);
                            metodos.setLadoMenor(ladoMenor);
                            metodos.TroncoDePiramide(apotema, altura, lados, ladoMenor);
                            break;
                        case 0:
                            System.out.println("Saliendo del programa.");
                            break;
                    }
                } else {
                    System.out.println("Opción no válida. Introduce una opción entre 0 y 12.");
                }
            } else {
                System.out.println("Entrada no válida. Introduce un número entero.");
                lector.nextLine();
                opcion = -1;
            }
        } while (opcion != 0);

        lector.close();

    }
}
