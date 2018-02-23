/**
 *
 * Parte III - AED I
 * 
 * Autora: Isabelle Hirle Alves Langkammer
 */
 import java.util.Scanner;
 import java.lang.Exception;
 public class dataCalendario{
   public static void main(String[]args){
      boolean cont=true, c=true,continua=true, anobi;
      int dia=1, mes=1,ano=1;
      do{
         try{
            dia= leDia(); 
            continua=false;
         }//fim try
         catch(Exception exception){
            System.err.printf("\nException: %s\n", exception);
            System.out.println("Erro! Digite um valor válido.");
         }//fim catch
      }while (continua); 
      do{
         try{
            mes=leMes();
            cont=false;
         }//fim try
         catch(Exception exception){
            System.err.printf("\nException: %s\n", exception);
            System.out.println("Erro! Digite um valor válido.");
         }//fim catch
      }while (cont); 
      do{
         try{
            ano=leAno(); 
            c=false;
         }//fim try
         catch(Exception exception){
            System.err.printf("\nException: %s\n", exception);
            System.out.println("Erro! Digite um valor válido.");
         }//fim catch
      }while (c);
      boolean bissexto= ehBissexto(ano);
      boolean datavalida=dataValida(dia,mes,ano);
      if(datavalida){
         System.out.println("DATA VÁLIDA");
      }    
      else{
         System.out.println("DATA NÃO VALIDA");
      }
      nomeMes(mes);
      if(bissexto){
         System.out.println("O ano é bissexto.");
      }
      else{
         System.out.println("O ano não é bissexto.");
      }
      escreveData(dia,mes,ano); 
      if(dataRecente(dia,mes,ano,25,11,2015)){
         System.out.println("A data digitada é recente.");
      }  
      else{
         System.out.println("A data não é recente.");
      }
   }//fim main()
   public static int leDia() throws Exception {
      int d;
      Scanner scanner=new Scanner(System.in);
      System.out.print("Digite o dia[1 até 31]:");
      d=scanner.nextInt();
      if (d<1 || d>31){
        throw new Exception();      
      }//fim if
      return d;
   }//fim leDia();
   public static int leMes() throws Exception {
      int m;
      Scanner scanner=new Scanner(System.in);
      System.out.print("Digite o mes[1 até 12]:");
      m=scanner.nextInt();
      if (m<1 || m>12){
        throw new Exception();      
      }//fim if
      return m;
   }//fim leMes();
   public static int leAno() throws Exception {
      int a;
      Scanner scanner=new Scanner(System.in);
      System.out.print("Digite o ano:");
      a=scanner.nextInt();
      if (a<1){
        throw new Exception();      
      }//fim if
      return a;
   }//fim leAno();
   public static boolean dataValida(int dia, int mes, int ano){
      boolean valido=true;
      if(dia>31 || dia<1){
         if(mes>12 || mes<1){
            if(ano<0){
               valido=false;
            }
         }
      }
      return valido;
   }
   public static boolean ehBissexto(int ano){
      boolean bissexto=false;
      if(ano%4==0){
         if(ano%100==0){
            if(ano%400==0){
               bissexto=true;
            }//fim if
            else{
               bissexto=false;
            }//fim else  
         }//fim if
         else{
            bissexto=true;
         }//fim else
      }//fim if
      else{
         bissexto=false;
      }//fim else  
      return bissexto;          
   }//fim ehBissexto()
   public static void nomeMes(int mes){
      switch(mes){
         case 1: System.out.println("Mês:Janeiro");
            break;
         case 2: System.out.println("Mês:Fevereiro");
            break;
         case 3: System.out.println("Mês:Março");
            break;
         case 4: System.out.println("Mês:Abril");
            break;
         case 5: System.out.println("Mês:Maio");
            break;
         case 6: System.out.println("Mês:Junho");
            break;
         case 7: System.out.println("Mês:Julho");
            break;
         case 8: System.out.println("Mês:Agosto");
            break;
         case 9: System.out.println("Mês:Setembro");
            break;
         case 10: System.out.println("Mês:Outubro");
            break;
         case 11: System.out.println("Mês:Novembro");
            break;
         case 12: System.out.println("Mês:Dezembro");
         default: break;
      }//fim switch
   }//fim nomeMes()
   public static boolean dataRecente(int dia1,int mes1, int ano1,int dia2,int mes2, int ano2){
      boolean recente=false;
      if(ano1>ano2){
         recente=true;
      }
      else if(ano1==ano2){
         if(mes1>mes2){
            recente=true;
         }
         else if(mes1==mes2){
            if(dia1>dia2){
               recente=true;
            }
            else{
               recente=false;
            }   
         }
      }
      return recente;
   }
   public static void escreveData(int dia, int mes, int ano){
      System.out.println("Data: "+dia+"/"+mes+"/"+ano);
   }//fim escreveData
}//fim class
 class Data{
   private int dia;
   private int mes;
   private int ano;
   public void setdia(int dia){
      this.dia=dia;
   }
   public void setmes(int mes){
      this.mes=mes;
   }
   public void setano(int ano){
      this.ano=ano;
   }
   public int getdia(){
      return dia;
   }
   public int getmes(){
      return mes;
   }
   public int getano(){
      return ano;
   }
   public int Dia(){
      boolean continua=true;
      Scanner scanner=new Scanner(System.in);
      do{
         try{
            System.out.print("Digite o dia :");
            int dia=scanner.nextInt();
            continua=false;
         }//fim try
         catch(Exception exception){
            System.err.printf("\nException: %s\n", exception);
            System.out.println("Erro! Digite um valor inteiro");
            scanner.nextLine();
         }//fim catch
      }while(continua);   
      return dia;
   }
   public int Mes(){
      boolean continua=true;
      Scanner scanner=new Scanner(System.in);
      do{
         try{
            System.out.print("Digite o mes :");
            int mes=scanner.nextInt();
            continua=false;
         }//fim try
         catch(Exception exception){
            System.err.printf("\nException: %s\n", exception);
            System.out.println("Erro! Digite um valor inteiro");
            scanner.nextLine();
         }//fim catch
      }while(continua);   
      return mes;
   }
   public int Ano(){
   boolean continua=true;
      Scanner scanner=new Scanner(System.in);
      do{
         try{
            System.out.print("Digite o ano :");
            int ano=scanner.nextInt();
            continua=false;
         }//fim try
         catch(Exception exception){
            System.err.printf("\nException: %s\n", exception);
            System.out.println("Erro! Digite um valor inteiro");
            scanner.nextLine();
         }//fim catch
      }while(continua);   
      return ano;
   }
}
