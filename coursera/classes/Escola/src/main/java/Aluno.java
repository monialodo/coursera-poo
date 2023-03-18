public class Aluno {

    int primeirBimestre;
    int segundoBimestre;
    int terceiroBimestre;
    int quartoBimestre;

    //Agora a classe Aluno é responsável por calcular a média e saber se foi aprovado

    public int media () {
        int total = 0;
        total += primeirBimestre;
        total += segundoBimestre;
        total += terceiroBimestre;
        total += quartoBimestre;
        int media = total / 4;
        return media;
    }


    public boolean aprovado () {
        int media = media();
        if (media >= 60) {
            return true;
        } else {
            return false;
        }
    }

}
