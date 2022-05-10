import java.util.Scanner;


public class RuanLins {
    Scanner read = new Scanner(System.in);

    private String nome;
    private String numero;
    private int ID;

    public pessoa(String nome, String numero, int ID) {
        this.nome = nome;
        this.numero = numero;
        this.ID = ID;
    }

    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Número
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //ID
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}


public class Agenda {
    Scanner read = new Scanner(System.in);

    Pessoa[] agenda = new Pessoa[10];

    public void cadastrarPessoa(String nome, String numero, int ID){
        while(ID <= 0 || ID > 10){
            System.out.printf("ID inválido, digite novamente: ");
            ID = read.nextInt();
        }
        agenda[ID-1] = new Pessoa(nome, numero, ID);
    }


    public void imprimePessoa(int ID){
        while(ID < 1 || ID > 10 || agenda[ID-1] == null){
            System.out.printf("O ID para imprimir é inválido ou não esta cadastrado, digite novamente: ");
            ID = read.nextInt();
        }
        ID -= 1;
        System.out.println("-----------------------");
        System.out.println("Nome: " + agenda[ID].getNome());
        System.out.println("Número: " + agenda[ID].getNumero());
        System.out.println("ID: " + agenda[ID].getID());
    }

    public void removePessoa(int ID){
        while(ID < 1 || ID > 10 || agenda[ID-1] == null){
            System.out.printf("O ID para remover é inválido ou inexiste, digite novamente: ");
            ID = read.nextInt();
        }
        ID -= 1;
        agenda[ID] = null;
    }

    public void imprimeAgenda(){
        System.out.println("ID cadastrados: ");
        for(int x = 0;x < 10;x++){
            if(agenda[x] != null){
                System.out.println(agenda[x].getID());
            }
        }
    }
}