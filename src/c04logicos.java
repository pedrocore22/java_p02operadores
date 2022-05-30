public class c04logicos {
    public static void main(String[] args) {
        // Parecido a JavaScript
        // & (AND lógico) | (OR inclusivo) ^ (XOR exclusivo)
        // Comparaciones sobre boolean y versión cortocircuito &&, ||
        boolean a = true;
        boolean b = true;
        System.out.println(a & b);
        System.out.println(a | b);
        b = false;
        System.out.println(a ^ b);
        // Idem en versión shortcircuit (más utilizada)
        // Operador unario !
        // idem JavaScript
        boolean esMayorEdad = false;
        esMayorEdad = !esMayorEdad; // Invierte el valor de un boolean
        // Ternario
        // idem JavaScript
        int edad = 20;
        String exitoMensaje = "Bienvenid@";
        String falloMensaje = "Acceso denegado";
        String mensaje = edad >= 18 ? exitoMensaje : falloMensaje;
        System.out.println(mensaje);
    }
}
