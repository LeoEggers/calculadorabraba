/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorabraba_uniesp;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leove
 */
public class CalculadoraBraba {
    private String op;
    private double n1;
    private double n2;
    private int c; //contador de brabeza

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    private static boolean verificarNome(String a){
        return a.matches("[a-zA-Z]+");
    }
    
    private static boolean verificarNumero(String a) {
        return a.matches("[0-9]+");
    }
    
    private void cumprimentar(){
        String hora = LocalDateTime.now().toString();
        Character c1 = hora.charAt(11);
        Character c2 = hora.charAt(12);
        String h = c1.toString() + c2.toString();
        int horaFinal = Integer.parseInt(h);
        
            if (horaFinal >= 0 && horaFinal < 12) {
                System.out.println("Ola, bom dia! Eu sou a sua calculadora.");
            } else if (horaFinal >= 12 && horaFinal < 18) {
                System.out.println("Ola, boa tarde! Eu sou a sua calculadora.");
            } else {
                System.out.println("Ola, boa noite! Eu sou a sua calculadora.");
            }
    }
    
    private void perguntarNome() {
        Scanner entry = new Scanner (System.in);
        System.out.print("Diga o seu nome SEM ACENTO, SEM NUMERO, SEM FRUFRU, APENAS LETRA: ");
        String nome = entry.nextLine();
            if (nome.isBlank()) {
                System.out.println("Rapaz... seu nome eh \"" + nome + "\" ??? Pq vc nao digitou nada!");
                c++;
            } else if (!verificarNome(nome)) {
                System.out.println("""
                                   Mermao, tu ja ta de brincadeira neh???
                                   Tu ja meteu o louco no teu nome num foi???
                                   Olhe, eu ja to comecando a perder a paciencia contigo!""");
                c++;
            } else if (nome.length()>15) {
                System.out.println("Ta danado meuamigo, que nome grande da porra... eu vou te chamar de Zé.");
            } else {
                System.out.println("Ola, " + nome + "! Prazer em te conhecer."
                        + "\n Se tu nao ficar de gracinha comigo eu te ajudo com teu calculo certo?");
            }
    }
    
    private void buscarN1(){
        System.out.print("Agora diga logo um numero, tenho o dia inteiro nao: ");
        Scanner entry = new Scanner (System.in);
        String r1 = entry.next();
            if (!verificarNumero(r1)) {
                System.out.println("""
                                   Tu ta de brincadeira neh vei?
                                   Eu disse UM NUMERO!!
                                   Isso ai que vc digitou eh numero por acaso???
                                   Eu vou considerar ZERO viu??? To nem ai, problema seu!""");
                c++;
            } else {
               this.n1 = Double.valueOf(r1);
            }
    }
    
    private void buscarN2() {
        System.out.print("""
                         Pronto, agora eu quero mais um numero...
                         e se vier com gracinha lembre que eh vc quem ta perdendo seu tempo!
                         Bora... digite logo ai, agiliza: """);
        Scanner entry = new Scanner (System.in);
        String r2 = entry.next();
            if (!verificarNumero(r2)) {
                if (n1!=0) {
                System.out.println("""
                                   Deixe de frescar meuamigo!!!
                                   Eu aqui lhe atendendo direito e voce fica ai brincando?!?!?
                                   Eu vou considerar que o valor eh ZERO e sua vida eh um problema SEU!""");
                c++;
                } else {
                    System.out.println("""
                                   Ate quando JESUS?!?!?
                                   O que foi que eu fiz pra merecer um usuario CHATO desses hein?!?!
                                   Eu vou considerar ZERO DE NOVO e sua vida eh um problema SEU!""");
                c++;
                }
            } else {
               this.n2 = Double.valueOf(r2);
            }
    }
    
    private void buscarOperador(){
        System.out.println("Beleza, continuando... \nAgora voce vai me dizer a operacao que vc quer fazer, certo?");
        System.out.println("""
                           Escolha UUMMMMMMM (01!!!) SIMBOLO
                           (E se voce escolher errado eu nao posso fazer nada, problema seu.) """);
        System.out.println("""
                           Soma: +
                           Subtracao: -
                           Multiplicacao: *
                           Divisao: /
                           (Soh sei esses 4 mermo, se estiver achando ruim arrume outra calculadora...)
                           escolha ai: """);
        Scanner entry = new Scanner (System.in);
        this.op = entry.next();
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                System.out.println("MUITO OBRIGADO!!!");
            } else {
                System.out.println("""
                                   Eu nao aguento mais nao po... 
                                   Na moral mrm, tu nao tem nada melhor pra fazer nao??
                                   Va varrer o deserto do Saara va!!!
                                   Enxugar o Oceano Atlantico!!""");
                c++;
                Random r = new Random();
                int a = r.nextInt(2);
                    if (a == 0) {
                        System.out.println("[Pois eu vou meter o louco tbm!]"); // String op não é corrigida. Resolve default.
                    } else {
                        System.out.println("[Eu vou fazer o seguinte...]");
                        int b = r.nextInt(4);

                        switch(b) {
                            case 0 -> {
                                System.out.println("Eu vou somar teus numeros.");
                                this.setOp("+");
                        }
                            case 1 -> {
                                System.out.println("Eu vou subtrair teus numeros.");
                                this.setOp("-");
                        }
                            case 2 -> {
                                System.out.println("Eu vou multiplicar teus numeros.");
                                this.setOp("+");
                        }
                            default -> {    
                                System.out.println("Eu vou dividir teus numeros.");
                                this.setOp("/");
                        }
                    }
                }
            }
    }
    
    private void resolver(){
        double s = 0.0;
        switch (this.getOp()) {
            case "+" -> {
                s = n1 + n2;
                System.out.println("PRONTO! Seu resultado eh [" + s + "]! Agora me deixe em paz! TCHAU!");
            }
            case "-" -> {
                s = n1 - n2 ;
                System.out.println("PRONTO! Seu resultado eh [" + s + "]! Agora me deixe em paz! TCHAU!");
            }
            case "*" -> {
                s = n1 * n2;
                System.out.println("PRONTO! Seu resultado eh [" + s + "]! Agora me deixe em paz! TCHAU!");
            }
            case "/" -> {
                s = n1 / n2;
                System.out.println("PRONTO! Seu resultado eh [" + s + "]! Agora me deixe em paz! TCHAU!");
            }
            default -> {
                s = n1*n2+3475;
                System.out.println("PRONTO! Seu resultado eh [" + s + "]! MAS SE ESTA CERTO EU NAO SEI!!!"
                        + "\nCONFERE AI SOZINHO!!! QUEM MANDOU FICAR DE GRACINHA??");
            }
        }
    }
    
    private void reclamar(){
        switch (this.getC()) {
            case 0 -> System.out.println("E obrigado por nao ser babaca!");
            case 1 -> System.out.println("E oh, tu foi meio chato visse! Mas vou deixar passar pq tem uma galera muito pior...");
            case 2 -> System.out.println("E tu testou minha paciencia viu! Pra eu mandar se lascar FALTOU QUASE NADA!");
            case 3 -> System.out.println("E QUASE QUE LEVAVA UMA MAOZADA! CLIENTE CHATO DO CARAI!!");
            default -> System.out.println("""
                                          E NAO VOLTE MAIS AQUI NAO!!!
                                          TODA VEZ QUE TU PODIA TIRAR UMA ONDINHA TU TESTOU MINHA PACIENCIA NE, MIZERINHA???""");
        }
    }
    
    public void executar(boolean repetir){
        if (repetir) {
            this.reclamar();
        }
        
        this.cumprimentar();
        this.perguntarNome();
        this.buscarN1();
        this.buscarOperador();
        this.buscarN2();
        this.resolver();
        this.executar(true);
    }
       
    }
}
