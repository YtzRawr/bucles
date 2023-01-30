public class contador {

    public static void main(String[] args) {
        int contador = 10;
        //ciclo repetitivo 
        //mientras
        while (contador > 0) {
            //hiteracion se termina el codigo y vuelve a 
            //ejecutarse desde arriba
            System.out.println(contador);
            contador = contador -1;
            // or contador --;
        }
        // mi contador sigue por aqui
    }
}

public class dowhile {

    public static void main(String[] args) {
        int contador = 12;
       do
       {
           //primero se ejecuta la expresion
           System.out.println(contador);
           contador = contador -1;
       }while(contador > 2);
    }
}