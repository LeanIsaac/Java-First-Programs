
public class Prueba {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;// Compila
        System.out.println(valor);
        
        				//65 + 1 = (66 = B en Ascii)
        valor = (char) (valor + 1);// Compila
        System.out.println(valor);

        String palabra = "Alura cursos online de tecnología";
        System.out.println(palabra);

        palabra = palabra + 2020; //Java convierte automáticamente el número a String
        System.out.println(palabra);
    }//FIN METODO MAIN // FIN SCOPE
}