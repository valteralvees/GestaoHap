package gestaohapvida;

public class Paciente {
    String nome;
    long cpf;
    long matricula;
    static boolean deuEntrada = true;
    boolean deuSaida;
    boolean segueInternacao;
    boolean aguardandoAutorizacao;
    boolean segueIML;
    
    
    Paciente (String passaNome, long passaMatricula,long passaCpf ){
        this.nome = passaNome;
        this.matricula = passaMatricula;
        this.cpf = passaCpf;
    }
    boolean atualizaStatus(int numProcedimento){
        switch (numProcedimento){
            case 1:
                deuEntrada = true;
                System.out.println("ENTRADA REGISTADA COM SUCESSO");
            case 2:
                deuSaida = true;
                System.out.println("SAIDA REGISTRADA COM SUCESSO");
            case 3:
                segueInternacao = true;
                System.out.println("INTERNACAO REGISTRADA COM SUCESSO");
            case 4:
                aguardandoAutorizacao = true;
                System.out.println("AGUARDO DE AUTORIZACAO REGISTRADO COM SUCESSO");
            case 5:
                segueIML = true;
                System.out.println("OBITO REGISTRADO COM ");
        }
        boolean atualizacaoConfirmada = true;
        return atualizacaoConfirmada;
    }
}
