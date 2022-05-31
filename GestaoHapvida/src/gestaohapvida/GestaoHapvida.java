package gestaohapvida;
import java.util.Scanner;


public class GestaoHapvida {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Paciente u001 = new Paciente("Valter Alves da Silva Neto", 5859272,706120);
        System.out.println("---------- Sistema Integrado Hapvida ----------");
        System.out.println("Aqui você atualiza o prontuário do paciente de acordo com a sua matrícula no sistema para acompanhamento EAD");
        System.out.println("=====================================================");
        System.out.println("USUÁRIO LOGADO: "+u001.nome.toUpperCase());
        System.out.println("MATRÍCULA:"+ u001.matricula);
        System.out.println("CPF(PRIMEIROS 6 DÍGITOS): "+ u001.cpf);
        System.out.println("=====================================================");
        System.out.println("ESCOLHA A OPÇÃO DESEJADA");
        System.out.println("1- Indicar estado atual do paciente");
        System.out.println("2- Atualizar estado atual do paciente");
        System.out.println("3- Gerar número do protocolo de atendimento do paciente");
        int escolha = teclado.nextInt();
        switch (escolha){
            case 1:
                System.out.println("");
            break;
            case 2:
                System.out.println("Digite o procedimento desejado");
                System.out.println("1- Registrar entrada");
                System.out.println("2- Registrar saída");
                System.out.println("3- Registrar internação");
                System.out.println("4- Registrar autorização");
                System.out.println("5- Registrar óbito");
                int numProcedimento = teclado.nextInt();
                if (numProcedimento==1){
                    u001.atualizaStatus(1);
                } else {
                    
                }
            break;
            case 3:
                System.out.println("Gerar número de protocolo...");
        }
        
    }
    
}
