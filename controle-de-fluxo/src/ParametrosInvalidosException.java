class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("É necessário o segundo parâmetro ser maior que o primeiro");
    }
}