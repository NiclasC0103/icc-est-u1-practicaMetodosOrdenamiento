public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        View menu = new View();

        SortBubble metodoBurbuja = new SortBubble();

        while (true) {
            menu.showMenu();
            menu.order();

            boolean ascendente = (menu.ascDes == 1);
            boolean pasos = false;

            switch (menu.metSelec) {
                case 1 -> { // Método de Selección
                    
                }
                case 2 -> { // Método de Inserción
                    
                }
                case 3 -> { // Método Burbuja Mejorado
                    System.out.println("Arreglo Original:");
                    metodoBurbuja.printArray(numeros);

                    metodoBurbuja.sortBurbuja(numeros, ascendente, pasos);

                    System.out.println("Arreglo Ordenado:");
                    metodoBurbuja.printArray(numeros);
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

