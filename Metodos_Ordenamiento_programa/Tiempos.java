public class Tiempos {

    public Tiempos(){

     //   contarTiempos(10000);
    }
    Ordenamiento ordenamiento = new Ordenamiento();
    public String[] contarTiempos(int numDatos){
        String []times= new String [7];
        String burbujaT="";
        String insercionT="";
        String seleccionT="";
        String shellsortT="";
        String quicksortT="";
        String mergesortT="";
        String heapsortT="";
        double burbujaTime= ordenamiento.ordenamientoBurbuja(numDatos);
        double insercionTime= ordenamiento.ordenamientoInsercion(numDatos);
        double seleccionTime= ordenamiento.ordenamientoSeleccion(numDatos);
        double shellsortTime= ordenamiento.ordenamientoShellSort(numDatos);
        double quicksortTime= ordenamiento.ordenamientoQuicksort(numDatos);
        double mergesortTime= ordenamiento.ordenamientoMergeSort(numDatos);
        double heapsortTime=ordenamiento.ordenamientoHeapsort(numDatos);

        if (burbujaTime>=1000){

            burbujaTime=burbujaTime/1000; 

            if(burbujaTime>=60){burbujaTime= burbujaTime/60;
                burbujaT= burbujaTime+ " Minutos";}
            else{burbujaT= burbujaTime+ " Segundos";}

        }
        else{        burbujaT=burbujaTime+ " Milisegundos";}

        if (insercionTime>=1000){insercionTime=insercionTime/1000; 

            if(insercionTime>=60){insercionTime=insercionTime/60;
                insercionT=insercionTime +" Minutos";}
            else{  insercionT= insercionTime +" Segundos";}

        }
        else{insercionT= insercionTime +" Milisegundos";}

        if (seleccionTime>=1000){seleccionTime=seleccionTime/1000;
            if(seleccionTime>=60){seleccionTime= seleccionTime/60;
                seleccionT=seleccionTime+ " Minutos";}
            else{ seleccionT= seleccionTime +" Segundos";}

        }
        else{seleccionT= seleccionTime +" Milisegundos";}

        
        if (shellsortTime>=1000){shellsortTime=shellsortTime/1000;
            if(shellsortTime>=60){shellsortTime=shellsortTime/60;
                shellsortT= shellsortTime+ " Minutos";}
            else{     shellsortT= shellsortTime +" Segundos";}
        }
        else{shellsortT= shellsortTime +" Milisegundos";}

        if (quicksortTime>=1000){quicksortTime=quicksortTime/1000;
            if(quicksortTime>=60){quicksortTime=quicksortTime/60;
                quicksortT= quicksortTime+ " Minutos";}
            else{ quicksortT= quicksortTime +" Segundos";}
        }
        else{quicksortT= quicksortTime +" Milisegundos";}

        if (mergesortTime>=1000){mergesortTime=mergesortTime/1000;
            if(mergesortTime>=60){mergesortTime= mergesortTime/60;
                mergesortT=mergesortTime+ " Minutos";}
            else{ mergesortT= mergesortTime +" Segundos";}    
        }
        else{mergesortT= mergesortTime +" Milisegundos";}

        if (heapsortTime>=1000){heapsortTime=heapsortTime/1000; 
            if(heapsortTime>=60){heapsortTime= heapsortTime/60;
                heapsortT= heapsortTime + " Minutos";}
            else{  heapsortT =heapsortTime   +" Segundos";}
        }
        else{   heapsortT =heapsortTime   +" Milisegundos";}

//         System.out.println (
//             "Burbuja " +burbujaT +"\n"
//             +"Insercion "+insercionT+"\n"
//             +"Seleccion "+seleccionT+"\n"
//             +"Shellsort "+shellsortT+"\n"
//             +"Quicksort "+quicksortT+"\n"
//             +"Mergesort "+mergesortT+"\n"
//             +"Heapsort "   +heapsortT+"\n"
//         );
        
        times[0]=burbujaT;
        times[1]=insercionT;
        times[2]=seleccionT;
        times[3]=shellsortT;
        times[4]=quicksortT;
        times[5]=mergesortT;
        times[6]=heapsortT;
        return times;
    }

}
