public class c03comparacion {
    public static void main(String[] args) {
        // Disponemos de comparación ==
        // y desigualdad !=
        int a = 10;
        int b = 10;
        int c = 1;
        boolean resultado = a == b;
        System.out.println(resultado);
        // En la comparación no se pueden usar
        // tipos distintos salvo los numéricos
        boolean esMayorEdad = true;
        // System.out.println(esMayorEdad == c); Error
        // Si el tipo es numérico se produce promoción
        // para la comparación
        double d = 1.0;
        System.out.println(c == d); // No da error y devuelve true
        // Operadores relaciones idem JavaScript
        // > >= < <=
        System.out.println(a > c);
        // No comparan los tipos "String", y si comparan los
        // tipos char pero pueden dar resultados inesperados
        // porque comparan el código ASCII
        // Operador de comparación instanceof
        // devuelve true si los tipos son iguales
        String nombre = "Juan";
        System.out.println(nombre instanceof String);
    }
}
