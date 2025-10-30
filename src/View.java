import java.util.Scanner;

public class View {
    private final Scanner scanner;
    int metSelec;
    int ascDes;
    int sn;
    int st;
    public View(){
        System.out.println("****BIENVENIDO AL SELECTOR DE METODOS DE ORDENAMIENTO****");
        scanner = new Scanner(System.in);
    }

    public void showMenu(){
        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1. Selección");
        System.out.println("2. Inserción");
        System.out.println("3. Burbuja Mejorado");
        System.out.print("Respuesta: ");
        metSelec=scanner.nextInt();
        while (metSelec<1 || metSelec>3) { 
            System.err.println("Se ingresó un número invalido - Ingrese Nuevamente");
            System.out.println("Seleccione el método de ordenamiento:");
            System.out.println("1. Selección");
            System.out.println("2. Inserción");
            System.out.println("3. Burbuja Mejorado");
            System.out.print("Respuesta: ");
            metSelec=scanner.nextInt();
        } 
    }
    
    public void order(){
        System.out.println("Como desea ordenar el arreglo?:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        System.out.print("Respuesta: ");
        ascDes=scanner.nextInt();
        while (ascDes<1 || ascDes>2) { 
            System.err.println("Se ingresó un número invalido - Ingrese Nuevamente");
            System.out.println("Como desea ordenar el arreglo?:");
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            System.out.print("Respuesta: ");
            ascDes=scanner.nextInt();
        }

    }

    public void steps(){
        System.out.println("Desea Visualizar los pasos del ordenamiento?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.print("Respuesta: ");
        st=scanner.nextInt();
        while (st<1 || st>2) { 
            System.err.println("Se ingresó un número invalido - Ingrese Nuevamente");
            System.out.println("Desea Visualizar los pasos del ordenamiento?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.print("Respuesta: ");
            st=scanner.nextInt();
        }
    }

    public void restart(){
        System.out.println("Desea Regresar al Menú?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.print("Respuesta: ");
        sn=scanner.nextInt();
        while (sn<1 || sn>2) { 
            System.err.println("Se ingresó un número invalido - Ingrese Nuevamente");
            System.out.println("Desea Regresar al Menú?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.print("Respuesta: ");
            sn=scanner.nextInt();
        }
    }

}
