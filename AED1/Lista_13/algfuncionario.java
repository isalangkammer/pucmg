import java.util.Scanner;
import java.lang.Exception;
public class algfuncionario{   
   public static void main(String[]args){
      String nome;
      double salario;
      int diad,mesd,anod, dian,mesn,anon;
      nome=nomeFuncionario();
      dian=DiaNascimento();
      mesn=MesNascimento();
      anon=AnoNascimento();
      salario=salario();
      diad=DiaAdmissao();
      mesd=MesAdmissao();
      anod=AnoAdmissao();
      imprimeFuncionario(nome);
   }//fim main()
      public static String nomeFuncionario(){
         String nome;
         Scanner scanner=new Scanner(System.in);
         System.out.print("Digite o nome do Funcionário:");
         nome=scanner.nextLine();
         return nome;
      }
      public static double salario(){
         double salario;
         Scanner scanner=new Scanner (System.in);
         System.out.print("Digite o valor do Salário:");
         salario=scanner.nextDouble();
         return salario;
      }
      public static void imprimeFuncionario(String nome){
         System.out.println("Nome: "+nome);
      }
      public static int DiaAdmissao(){
         int dia;
         Scanner scanner= new Scanner(System.in);
         System.out.print("Digite o dia de admissão:");
         dia=scanner.nextInt();
         return dia;
      }
      public static int MesAdmissao(){
         int mes;
         Scanner scanner= new Scanner(System.in);
         System.out.print("Digite o mes de admissão:");
         mes=scanner.nextInt();
         return mes;
      }
      public static int AnoAdmissao(){
         int ano;
         Scanner scanner= new Scanner(System.in);
         System.out.print("Digite o ano de admissão:");
         ano=scanner.nextInt();
         return ano;
      }
      public static int DiaNascimento(){
         int dia;
         Scanner scanner= new Scanner(System.in);
         System.out.print("Digite o dia de Nascimento:");
         dia=scanner.nextInt();
         return dia;
      }
      public static int MesNascimento(){
         int mes;
         Scanner scanner= new Scanner(System.in);
         System.out.print("Digite o mes de Nascimento:");
         mes=scanner.nextInt();
         return mes;
      }
      public static int AnoNascimento(){
         int ano;
         Scanner scanner= new Scanner(System.in);
         System.out.print("Digite o ano de Nascimento:");
         ano=scanner.nextInt();
         return ano;
      }            
}//fim class   
 class Funcionario{
   private String nome;
   private double salario;
   private int dataAdmissao;
   private int dataNascimento;
   public void setnome(String nome){
      this.nome=nome;
   }
   public void setsalario(double salario){
      this.salario=salario;
   }
   public void setdataAdmissao(int dataAdmissao){
      this.dataAdmissao=dataAdmissao;
   }
   public void setdataNascimento(int dataNascimento){
      this.dataNascimento=dataNascimento;
   }
   public String getnome(){
      return nome;
   }
   public double getsalario(){
      return salario;
   }
   public int getdataAdmissao(){
      return dataAdmissao;
   }
   public int getdataNascimento(){
      return dataNascimento;
   }   
 }//fim class