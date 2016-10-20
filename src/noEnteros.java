class noEnteros extends Exception {
    public noEnteros() {
        //Exception en caso de enviar algo que no sea un entero
        super(" Solo pueden comprobarse factoriales de numeros enteros");
    }
}
