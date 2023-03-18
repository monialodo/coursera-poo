public class VerificadoraNotas {

    //Dessa maneira estamos usando um método que nessa classe que deveria ser responsabilidade da classe Aluno
    // Essa é a maneira da programação estruturada
    public static int mediaAluno (Aluno aluno) {
        int total = 0;
        total += aluno.primeirBimestre;
        total += aluno.segundoBimestre;
        total += aluno.terceiroBimestre;
        total += aluno.quartoBimestre;
        int media = total / 4;
        return media;
    }


    public static boolean aprovado (Aluno aluno) {
        int media = mediaAluno(aluno);
        if (media >= 60) {
            return true;
        } else {
            return false;
        }
    }




}
