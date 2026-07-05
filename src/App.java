public class App {
    public static void main(String[] args) throws Exception {

//realizamos la lista de tamano 4 para agregar los elementos.
        Lista<String> lista = new ArrayList<>(4);

        System.out.println("==Agregamos elementos a la lista.==\n");

        lista.agregarFinal("a");
        lista.agregarFinal("b");
        lista.agregarFinal("c");

            //Imprimimos la lista para verificar los elementos en ella.
            System.out.println("\nLista:" + java.util.Arrays.toString(lista.convertirArreglo()));

            //Probamos el metodo de agregar un elemento al iniciio.
            lista.agregarInicio("d");

            //Imprimimos la lsita con 'd' agregado al inicio de la lista
            System.out.println("\nLista con elemento agregado al inicio: \n\n" + java.util.Arrays.toString(lista.convertirArreglo()));

            //Probamos el metodo de agregar elemento al final de la lista
            lista.agregarElemento("e");

            //Imprimimos la lista con 'e' agregado al final de la lista
            System.out.println("\nLista con 'e' al final de la lista:" + java.util.Arrays.toString(lista.convertirArreglo()));


        System.out.println("\n\n==Metodos agregar posicion.== \n");


            //Probamos el metodo de agregar elemento en cierta posicion.
            lista.agregarPosicion("f", 3);

            //Imprimimos la lista
            System.out.println("\nLista con elemento en la posicion 3: " + java.util.Arrays.toString(lista.convertirArreglo()));


        System.out.println("\n\n==Metodo consultar, numero de Elementos, Verificar si es Vacia, iterator.==\n");

            //Probamos el metodo consultar para erificar que sean los elementos en cierta posicion.
            System.out.println("\nconsultar pos 0: " + lista.consultar(0)); // Consultamos la posicion 0.
            System.out.println("\nconsultar pos 3: " + lista.consultar(3)); // Consultamos la posicion 3.

            //Prueba de la cantidad de elementos que hay en la lista.
            System.out.println("\nnumero de Elementos: " + lista.numElementos());

            //Prueba de verificar de la lista si se encuentra con elementos o sin ninguno.
            System.out.println("\nEs vacia?" + lista.esVacia());

        System.out.println("\n\n==Metodos eliminarElemento.== \n");

            //prueba de eliminar elemento por posicion.
            lista.eliminarElementoPosicion(3);

            //Imprimimos la prueba, de la posicion 3.
            System.out.println("\n Lista sin elemento en posicion 3: " + java.util.Arrays.toString(lista.convertirArreglo()));


            //Prueba de eliminar elemento inicial.
            lista.eliminarElementoInicio();

            //Imprimimos la prueba eliminando el elemento inicial
            System.out.println("\nLista sin elemento inicial:" + java.util.Arrays.toString(lista.convertirArreglo()));


            //Prueba de eliminar elemento final.
            lista.eliminarElementoFinal();

            //Imprimimos la prueba elemento final.
            System.out.println("\nLista sin elemento final:" + java.util.Arrays.toString(lista.convertirArreglo()));

            //Prueba de eliminar elemento que sigue.
            lista.eliminarElemento();

            //Imprimimos la prueba sin el elemento.
            System.out.println("\nLista con elemento eliminado: " + java.util.Arrays.toString(lista.convertirArreglo()));


        System.out.println("\n\n ==Metodo para limpiar la lista==\n");

            //Llamamos al metodo para probar limpieza de la lista.
            lista.limpiarLista();

            //Imprimimos y verificamos que sean correcto la nueva lista vacia.
            System.out.println("\nnumElementos despues de limpiar:" + lista.numElementos()); 
            System.out.println("\nLista sin elementos:" + java.util.Arrays.toString(lista.convertirArreglo()));
    }
}
