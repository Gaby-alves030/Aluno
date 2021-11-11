public class Principal {
    
    public static void main(String[] args) {
        
        Aluno aluno=new Aluno();
        aluno.disciplinas("Calculo", "Inglês", "Internet das Coisas");

        aluno.notas(9.5, 5.0, 7.0);
        aluno.verificaAprovado();
        
    }
}