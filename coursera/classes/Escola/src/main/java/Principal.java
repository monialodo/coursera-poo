public class Principal {

    public static void main(String[] args) {


        Aluno aluno = new Aluno();
        aluno.primeirBimestre = 70;
        aluno.segundoBimestre = 60;
        aluno.terceiroBimestre = 80;
        aluno.quartoBimestre = 70;

        System.out.println(aluno.media());
        System.out.println(aluno.aprovado());

        //Não preciso chamar uma função para saber a média do aluno, pois a classe Aluno já faz isso
//        System.out.println(VerificadoraNotas.mediaAluno(aluno));
//        System.out.println(VerificadoraNotas.aprovado(aluno));






    }



}
