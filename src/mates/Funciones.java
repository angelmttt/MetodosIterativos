package mates;
import java.util.ArrayList;
 
public class Funciones {
 
// 1. La suma 0 + 1 + 2 + ... + n.
 
    public static int suma(int n)
    {
        int acumulado = 0;
        for(int i = 1; i<=n; i++)
        {
            acumulado += i;
        }
        return acumulado;
    }
 
// 2. El factorial de un número.
 
    public static int factorial(int n)
    {
        if (n == 0)
        return 1;
        else
        return n * factorial(n-1);
    }
// 3. La potencia n-ésima de un número natural.
public static int potencia(int base, int exponente) {
    if (exponente == 0) {
        return 1;
    } else {
        return base * potencia(base, exponente - 1);
    }
}
 
// 4. La suma de los elementos de una lista de números.
 
public static int sumaLista(ArrayList<Integer> lista)
{
    int acumulado = 0;
    for (int num : lista)
    {
        acumulado += num;
    }
    return acumulado;
}

 
// 5. La media aritmética de una lista de números.
 
    public static double mediaAritm(ArrayList<Integer> lista)
    {
        int suma = sumaLista(lista);   //suma de todos los elementos de la lista
        return (double) suma / lista.size();  // divido la suma de los elementos entre el tamaño de la lista.
    }
 
// 6. La desviación típica de una lista de números.
 
    public static double desviacionTipica(ArrayList<Integer> lista) {
        double a = mediaAritm(lista);
        double raizCuadrada = 0;
        for (int num : lista) {
            raizCuadrada += Math.pow(num - a, 2);
        }
        return Math.sqrt(raizCuadrada / lista.size());
    }
 
 
// 7. La suma de los primeros números pares hasta n asumiendo n ≥ 2. 
 
    public static int sumaPares(int n)
    {
        // Caso base. Si n es igual a 2 este es un número par, devuelve 2
        if (n == 2)
        {
            return 2;
 
        //si n es un número par mayor que 2,
        //se suma a la llamada recursiva sumaPares(n - 2).sumamos  n con la suma de los números pares menores a n
        } else if (n % 2 == 0)
        {
            return n += sumaPares(n- 2);
        } else {
            return sumaPares(n - 1);
        }
    }
 
// 8. La suma de los elementos pares de una lista de enteros.

    public static int sumaParLista(ArrayList<Integer> lista)
    {
        int suma = 0;
        for (int num : lista){
            if (num % 2 == 0 ){
                suma += num;
            }
        }
        return suma;
    }
 
// 9. Dada una lista de números naturales mayores o iguales que 2, obtieneotra lista con los números pares de la lista inicial, en el mismo orden yrespetando los números repetidos.
    public static ArrayList<Integer> listaPares(ArrayList<Integer> lista)
    {
        ArrayList<Integer> par = new ArrayList<>();
        for (int num : lista){
            if (num % 2 == 0){
                par.add(num);
            }
        }
        return par;
 
    }
 
 
 
// 10. La lista de los primeros números pares hasta n asumiendo n ≥ 2.
    public static ArrayList<Integer> listaDeSoloPar(int n)
    {
        ArrayList<Integer> soloPar = new ArrayList<>();
        int i = 0;
        for (i = n; i >= 2; i -=2 )
        {
            soloPar.add(i);
        }
        return soloPar;
 
 
    }
 
// 11. Producto escalar de dos listas de números no vacías y del mismo tama-ño.
 
 
public static int productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
    int producto = 0;
    for (int i = 0; i < lista1.size(); i++) {
        producto += lista1.get(i) * lista2.get(i);
    }
    return producto;
}

}