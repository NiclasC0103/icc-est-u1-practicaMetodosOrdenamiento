public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {19, 24, -19, -28, 5, 30, -12, 34, -9, 52, 0, 45};
        View menu = new View();

        SortBubble metodoBurbuja = new SortBubble();
        SortInsercion metodoInsercion = new SortInsercion();
        SortSeleccion metodoSeleccion = new SortSeleccion();

        while (true) {
            menu.showMenu();
            menu.order();
            menu.steps();

            boolean ascendente = (menu.ascDes == 1);
            boolean pasos = (menu.st == 1);            

            switch (menu.metSelec) {
                case 1 -> { // Método de Selección
                    System.out.println("Arreglo Original:");
                    metodoSeleccion.printArray(numeros);

                    metodoSeleccion.sortSelection(numeros, ascendente, pasos);

                    System.out.println("Arreglo Ordenado:");
                    metodoSeleccion.printArray(numeros);

                    System.out.println("Comparaciones Totales -> " + metodoSeleccion.comparaciones);
                    System.out.println("Cambios Totales -> " + metodoSeleccion.cambios);
                }
                case 2 -> { // Método de Inserción
                    System.out.println("Arreglo Original:");
                    metodoInsercion.printArray(numeros);

                    metodoInsercion.sortInsertion(numeros, ascendente, pasos);

                    System.out.println("Arreglo Ordenado:");
                    metodoInsercion.printArray(numeros);

                    System.out.println("Comparaciones Totales -> " + metodoInsercion.comparaciones);
                    System.out.println("Cambios Totales -> " + metodoInsercion.cambios);
                }
                case 3 -> { // Método Burbuja Mejorado
                    System.out.println("Arreglo Original:");
                    metodoBurbuja.printArray(numeros);

                    metodoBurbuja.sortBurbuja(numeros, ascendente, pasos);

                    System.out.println("Arreglo Ordenado:");
                    metodoBurbuja.printArray(numeros);

                    System.out.println("Comparaciones Totales -> " + metodoBurbuja.comparaciones);
                    System.out.println("Cambios Totales -> " + metodoBurbuja.cambios);
                }
            }

            menu.restart();
            if (menu.sn == 2) {
                break;
            }else{
                numeros = new int[]{10, 0, -5, 5, 15, 2};
            }
        }

        System.out.println("SE FINALIZÓ LA EJECUCION...");
    }
}

