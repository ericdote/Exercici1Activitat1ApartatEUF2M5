
public class MatriculasDam {

    public static int matricula(int numero) throws noEnteros {
        //Calcula el precio de matricula en funcion del numeros de UF's
        int uf = 0, precio = 0;

        uf = numero;

        if (uf < 12) {
            precio = uf * 30;

        } else {
            precio = 380;
        }

        return precio;
    }
}
