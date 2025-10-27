public class SortSeleccion {
    public SortSeleccion(){
        System.out.println("Se creó mi clase SortSeleccion\n");
    }
    public void sortAscendente(int[] numeros){
        int len = numeros.length;
        int aux;
        for (int i = 0; i < len; i++) {
            int ind=i;
            for (int j = i+1; j < len; j++) {
                if (numeros[j]<numeros[ind]) {
                    ind=j;
                }
            }
            if (i != ind) {
                aux= numeros[ind];
                numeros[ind]=numeros[i];
                numeros[i]=aux;
            }
        }
    }
    public void sortDescendente(int[] numeros){
        int len = numeros.length;
        int aux;
        for (int i = 0; i < len; i++) {
            int ind=i;
            for (int j = i+1; j < len; j++) {
                if (numeros[j]>numeros[ind]) {
                    ind=j;
                }
            }
            if (i != ind) {
                aux= numeros[ind];
                numeros[ind]=numeros[i];
                numeros[i]=aux;
            }
        }
    }
    public void printArray(int[] numeros){
        int len = numeros.length;
        for(int i=0; i<len; i++)
        {
            if (i==0) {
                System.out.print("["+numeros[i]+",");
            } else if(i==len-1) {
                System.out.println(numeros[i]+"]");
            } else {
                System.out.print(numeros[i]+",");
            }
        }
    }
}
