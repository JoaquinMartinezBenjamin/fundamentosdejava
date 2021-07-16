public class Ordenamiento  { 
    public Alumno[] listado;
    Generador_Datos datos = new Generador_Datos();
    public Ordenamiento(){}


    
    public double ordenamientoQuicksort(int numeroDatos) {
       
        listado = datos.obtenerDatos(numeroDatos);
        double start = System.currentTimeMillis();
        listado = quicksort (listado,0,listado.length -1);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Quicksort "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");
    return res;
//         String tiempo="Milisegundos: "+res;
//         return tiempo;
    }

    public double ordenamientoBurbuja( int numeroDatos) {

        listado = datos.obtenerDatos(numeroDatos);

        double start = System.currentTimeMillis();
        listado = burbuja (listado);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Burbuja "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");

//            String tiempo="Milisegundos: "+res;
//         return tiempo;
return res;
    }

    public double ordenamientoSeleccion( int numeroDatos) {
        listado = datos.obtenerDatos(numeroDatos);

        double start = System.currentTimeMillis();
        listado = seleccion (listado);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Seleccion "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");
// 
//               String tiempo="Milisegundos: "+res;
        return res;
    }                                     

    public double ordenamientoInsercion( int numeroDatos) {
        listado = datos.obtenerDatos(numeroDatos);

        double start = System.currentTimeMillis();
        listado = insercion(listado);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Insercion "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");
// 
//               String tiempo="Milisegundos: "+res;
        return res;
    }

    public double ordenamientoShellSort( int numeroDatos) {
        listado = datos.obtenerDatos(numeroDatos);

        double start = System.currentTimeMillis();
        listado = shellSort(listado);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Shellsort "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");

//               String tiempo="Milisegundos: "+res;
//         return tiempo;
return res;
    }

    public double ordenamientoMergeSort( int numeroDatos) {
        listado = datos.obtenerDatos(numeroDatos);

        double start = System.currentTimeMillis();
        listado = mergesort(listado,0,listado.length -1);
        double end = System.currentTimeMillis();
        double res = end - start;
System.out.println("Mergesort "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");
//              String tiempo="Milisegundos: "+res;
//         return tiempo;
return res;
    }

    public double ordenamientoHeapsort( int numeroDatos) {
        listado = datos.obtenerDatos(numeroDatos);

        double start = System.currentTimeMillis();
        listado = heapsort(listado);
        double end = System.currentTimeMillis();
        double res = end - start;
System.out.println("Heapsort "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");
//                 String tiempo="Milisegundos: "+res;
//         return tiempo;
return res;
    } 

    public Alumno[] seleccion(Alumno A[]) {
        int i, j, pos;
        Alumno tmp;
        Alumno menor;
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
            menor = A[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j].getNombre().compareTo(menor.getNombre())<0) { // del array algún elemento
                    menor = A[j]; // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){ // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }

        return A;
    }

    public Alumno[] burbuja(Alumno[]matrix){  
        Alumno temp;  
        for(int i=1;i < matrix.length;i++){  
            for (int j=0 ; j < matrix.length- 1; j++){  
                if (matrix[j].getNombre().compareTo(matrix[j+1].getNombre())>0){  
                    temp = matrix[j];  
                    matrix[j] = matrix[j+1];  
                    matrix[j+1] = temp;  
                }  
            }  
        }  
        return matrix;
    }  

    public Alumno[] insercion (Alumno [] vector) {  
        for (int i=1; i < vector.length; i++) {  
            Alumno aux = vector[i];  
            int j;  
            for (j=i-1; j >=0 && vector[j].getNombre().compareTo(aux.getNombre())>0; j--){  
                vector[j+1] = vector[j];  
            }  
            vector[j+1] = aux;  
        }  
        return vector;
    }  

    public Alumno [] quicksort( Alumno x[], int izq, int der){
        Alumno pivote = x[izq];
        int i= izq;
        int j= der;
        Alumno aux;
        while (i<j){

            while(x[i].getNombre().compareTo(pivote.getNombre())<=0 /* <= pivote*/&& i<j )i++;
            while(x[j].getNombre().compareTo(pivote.getNombre())>0)/* >  pivote)*/ j--;
            if (i<=j){

                aux= x[i];
                x[i]= x[j];
                x[j]= aux;
            }
        }
        x[izq]=x[j];
        x[j]= pivote;

        if (izq< j-1) {quicksort(x,izq, j-1);}

        if(j+1 < der){ quicksort(x,j+1, der);}
        return x;

    }

    public Alumno [] shellSort(Alumno[] matrix) {  
        for ( int increment = matrix.length / 2;increment > 0;  
        increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {  
            for (int i = increment; i < matrix.length; i++) {  
                for (int j = i; j >= increment && matrix[j - increment].getNombre().compareTo(matrix[j].getNombre())>0; j -= increment) {  
                    Alumno temp = matrix[j];  
                    matrix[j] = matrix[j - increment];  
                    matrix[j - increment] = temp;  
                }  
            }  
        }  

        return matrix;
    }  

    //*****************************************
    public Alumno[] mergesort(Alumno A[],int izq, int der){  //***************
        if (izq<der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);
            A=merge(A,izq, m, der);
        }
        return A;
    }

    public Alumno[] merge(Alumno A[],int izq, int m, int der){
        int i, j, k;
        Alumno [] B = new Alumno[A.length]; //array auxiliar
        for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
            B[i]=A[i];

        i=izq; j=m+1; k=izq;
        while (i<=m && j<=der) //copia el siguiente elemento más grande
            if (B[i].getNombre().compareTo(B[j].getNombre())<=0)//*********************
                A[k++]=B[i++];
            else
                A[k++]=B[j++];
        while (i<=m) //copia los elementos que quedan de la
            A[k++]=B[i++]; //primera mitad (si los hay)

        return A;                  
    }

    //*****************************************
    public Alumno[] heapsort( Alumno [] v) {

        final int N= v.length;

        for (int nodo = N/2; nodo >=0; nodo--) hacerMonticulo(v,nodo,N-1);
        for (int nodo = N-1; nodo>=0; nodo--) {

            Alumno tmp= v[0];
            v[0]= v[nodo];
            v[nodo]= tmp;
            v=hacerMonticulo(v,0,nodo-1);

        }
        return v;

    }

    public Alumno[] hacerMonticulo(Alumno [] v, int nodo, int fin) {
        int izq= 2* nodo +1;
        int der= izq + 1;

        int may;
        if ( izq>fin) return v;
        if (der>fin) may = izq;
        else may = v[izq].getNombre().compareTo(v[der].getNombre())>0 ? izq:der;

        if (v[nodo].getNombre().compareTo(v[may].getNombre())<0) {

            Alumno tmp = v[nodo];
            v[nodo]= v[may];
            v[may] = tmp;
            hacerMonticulo (v,may,fin);
        }

        return v;
    }
    //*****************************************

}
