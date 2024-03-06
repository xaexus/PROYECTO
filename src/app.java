import co.edu.sena.oop.Data;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;

        int opcion;

        Data data = new Data();


        System.out.println("Ejercicio miscelánea OPP Java");
        System.out.println("-----------------------------");
        System.out.println("Menú Principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");
        System.out.println("99. Salir");
        System.out.println("Ingrese una opción");


        opcion = src.nextInt();
        switch (opcion){
            case 1: {
                System.out.println("Categoría Operadores");
                System.out.println("1. Calcular área triángulo");
                System.out.println("2. Sumar dos números");
                System.out.println("3. Elevar un número al cuadrado");
                System.out.println("4. Pasar euros a dólares");
                System.out.println("5. Área y perímetro de un cuadrado");
                System.out.println("6. Área y volumen de un cilíndro");
                System.out.println("7. Longitud y área de un círculo");
                System.out.println("8. Promedio de tres números");
                System.out.println("  Ingrese una opción");
                opcion = src.nextInt();
                switch (opcion) {
                    case 1: {
                        System.out.println("-------------------------------");
                        System.out.println("1. Calcular el área de un triángulo");
                        System.out.println("Ingrese la base");
                        numero1 = src.nextDouble();
                        System.out.println("Ingrese la altura");
                        numero2 = src.nextDouble();
                        System.out.println("El área del triángulo es : " + data.areaTriangulo(numero1, numero2));

                    }
                    break;
                    case 2: {
                        System.out.println("-------------------------------");
                        System.out.println("2. Sumar dos números");
                        System.out.println("Ingrese el primer número");
                        numero1 = src.nextDouble();
                        System.out.println("Ingrese el segundo número");
                        numero2 = src.nextDouble();
                        System.out.println("La sumatoria de los números es  : " + data.sumarDosnumeros(numero1, numero2));

                    }
                    break;
                    case 3: { System.out.println("-------------------------------");
                        System.out.println("3. Elevar un número al cuadrado");
                        System.out.println("Ingrese el número a elevar");
                        numero1 = src.nextDouble();
                        System.out.println("El número elevado al cuadrado es : " + data.elevadoCuadrado(numero1));
                    }
                    break;
                    case 4:{ System.out.println("-------------------------------");
                        System.out.println("4. Pasar euros a dólares");
                        System.out.println("Ingrese el valor");
                        numero1 = src.nextDouble();
                        System.out.println("El cambio es : " + data.eurosADolares(numero1));
                    }
                    break;
                    case 5:{System.out.println("-------------------------------");
                        System.out.println("5. área y perímetro de un cuadrado");
                        System.out.println("Ingrese el lado del cuadrado");
                        numero1 = src.nextDouble();
                        System.out.println("El perímetro es  : " + data.perimetroCuadrado(numero1));
                        System.out.println("El área es : " +  data.areaCuadrado(numero1));
                    }
                    break;
                    case 6:{System.out.println("-------------------------------");
                        System.out.println("6. Área y volumen de un cilíndro");
                        System.out.println("Ingrese el radio del cilíndro");
                        numero1 = src.nextDouble();
                        System.out.println("Ingrese la altura del cilíndro");
                        numero2 = src.nextDouble();
                        System.out.println("El área del cilíndro es  : " + data.areaCilindro(numero1, numero2) + "cm2");
                        System.out.println("El volumen del cilíndro es : " + data.volumenCilindro(numero1, numero2) + "cm3");
                    }
                    break;
                    case 7:{System.out.println("-------------------------------");
                        System.out.println("7. Longitud y área de un círculo");
                        System.out.println("Ingrese el lado en cm");
                        numero1 = src.nextDouble();
                        System.out.println("La longitud del círculo es  : " + data.areaCirculo(numero1) + "cm2");
                        System.out.println("El área del círculo es : " + data.radioCirculo(numero1) + "cm");
                    }
                    case 8:{System.out.println("-------------------------------");
                        System.out.println("8. Promedio de tres números");
                        System.out.println("Ingrese el primer número");
                        numero1 = src.nextDouble();
                        System.out.println("Ingrese el segundo número");
                        numero2 = src.nextDouble();
                        System.out.println("Ingrese el tercer número");
                        numero3 = src.nextDouble();
                        System.out.println("El promedio de los números es : " + data.promedio(numero1, numero2, numero3));
                    }
                }

            }
            case 2:{};
            break;
            case 3:{};
            break;
            case 99:{};
            break;
            default:
                System.out.println("opcion no valida");
                break;
        }

    }

}
