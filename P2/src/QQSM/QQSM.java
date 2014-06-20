package QQSM;

import java.io.*;
import java.util.*;

public class QQSM {

    int i, c, wrongInput, wrongAnswer, Ql1Counter, Ql2Counter, Ql3Counter, numberofQuestions, whichQuestion;
    String line, name, answer, finalAnswer;

    ArrayList<String> Ql1 = new ArrayList<String>();
    ArrayList<String> Ql2 = new ArrayList<String>();
    ArrayList<String> Ql3 = new ArrayList<String>();

    String Values[] = {"25", "50", "125", "250",
        "500", "750", "1500", "2500", "5000", "7500",
        "12500", "25000", "50000", "100000", "250000"};

    String Landings[] = {"500", "7500"};

    Scanner sC = new Scanner(System.in);
    Random rN = new Random();
	
	
    //READ FILE > ORGANIZE ALL LEVELS ON COMPATIBLE ARRAYLISTS
    public void readFile(String path) {

        try {
            Scanner in = new Scanner(new FileReader(path));
            while (in.hasNextLine()) {
                line = in.nextLine();
                if (line.equals("1")) {
                    c = 0;
                    while (c < 7) {
                        line = in.nextLine();
                        Ql1.add(line);
                        c++;
                        Ql1Counter++;
                    }
                }
                if (line.equals("2")) {
                    c = 0;
                    while (c < 7) {
                        line = in.nextLine();
                        Ql2.add(line);
                        c++;
                        Ql2Counter++;
                    }
                }
                if (line.equals("3")) {
                    c = 0;
                    while (c < 7) {
                        line = in.nextLine();
                        Ql3.add(line);
                        c++;
                        Ql3Counter++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nFicheiro não encontrado.");
        }
    }
   
    //VERIFY NUMBER LEVEL && CONVERT USER'S ANSWER IN TYPE "R: A" && VERIFY INPUT
    public void counterLevel() {
        while (i < 15) { //Número de níveis
            if (i < 5 && wrongAnswer == 0) { // Número de questoes de primerio nível
                if (Ql1.isEmpty()) {
                    System.out.println("Terminou por hoje o jogo devido a falta de questões.");
                    return;
                }
                if (wrongInput == 0) {
                    numberofQuestions = (Ql1Counter / 7); //Numero de questoes de nível 1 
                    whichQuestion = rN.nextInt(numberofQuestions);

                    System.out.println("Pergunta número " + (i + 1) + ": \n" + Ql1.get(whichQuestion * 7) + "\n");

                    for (c = 0; c < 4; c++) {
                        System.out.println(Ql1.get((whichQuestion * 7) + c + 1));
                    }

                    System.out.println("\n" + "Introduza a opção que acha correcta: ");
                    answer = sC.nextLine();

                    convertAnswer();
                }
                if (wrongInput > 0) {
                    System.out.println("Pergunta número " + (i + 1) + ": \n" + Ql1.get(whichQuestion * 7) + "\n");

                    for (c = 0; c < 4; c++) {
                        System.out.println(Ql1.get((whichQuestion * 7) + c + 1));
                    }

                    System.out.println("\n" + "Introduza a opção que acha correcta: ");
                    answer = sC.nextLine();

                    convertAnswer();

                }

                verifyInput(1);
            }

            if (i > 4 && i < 10 && wrongAnswer == 0) {
                if (Ql2.isEmpty()) {
                    System.out.println("Terminou por hoje o jogo devido a falta de questões.");
                    return;
                }
                if (wrongInput == 0) {
                    numberofQuestions = (Ql2Counter / 7); //Numero de questoes de nível 1 
                    whichQuestion = rN.nextInt(numberofQuestions);

                    System.out.println("Pergunta número " + (i + 1) + ": \n" + Ql2.get(whichQuestion * 7) + "\n");

                    for (c = 0; c < 4; c++) {
                        System.out.println(Ql2.get((whichQuestion * 7) + c + 1));
                    }

                    System.out.println("\n" + "Introduza a opção que acha correcta: ");
                    answer = sC.nextLine();

                    convertAnswer();
                }
                if (wrongInput > 0) {
                    System.out.println("Pergunta número " + (i + 1) + ": \n" + Ql2.get(whichQuestion * 7) + "\n");

                    for (c = 0; c < 4; c++) {
                        System.out.println(Ql2.get((whichQuestion * 7) + c + 1));
                    }

                    System.out.println("\n" + "Introduza a opção que acha correcta: ");
                    answer = sC.nextLine();

                    convertAnswer();

                }

                verifyInput(2);
            }

            if (i > 9 && i < 16 && wrongAnswer == 0) {
                numberofQuestions = 0;
                if (Ql3.isEmpty()) {
                    System.out.println("Terminou por hoje o jogo devido a falta de questões.");
                    return;
                }
                if (wrongInput == 0 && Ql3.size() > 0) {
                    numberofQuestions = (Ql3Counter / 7); //Numero de questoes de nível 1 
                    whichQuestion = rN.nextInt(numberofQuestions);

                    System.out.println("Pergunta número " + (i + 1) + ": \n" + Ql3.get(whichQuestion * 7) + "\n");

                    for (c = 0; c < 4; c++) {
                        System.out.println(Ql3.get((whichQuestion * 7) + c + 1));
                    }

                    System.out.println("\n" + "Introduza a opção que acha correcta: ");
                    answer = sC.nextLine();

                    convertAnswer();
                }
                if (wrongInput > 0) {
                    System.out.println("Pergunta número " + (i + 1) + ": \n" + Ql3.get(whichQuestion * 7) + "\n");

                    for (c = 0; c < 4; c++) {
                        System.out.println(Ql3.get((whichQuestion * 7) + c + 1));
                    }

                    System.out.println("\n" + "Introduza a opção que acha correcta: ");
                    answer = sC.nextLine();

                    convertAnswer();
                }

                verifyInput(3);
            }

            if (wrongAnswer == 1) {
                System.out.println("\nO jogo do Quem Quer Ser Milionário terminou por hoje!");
                return;
            }

            if (answer.equals("DESISTO")) {
                return;
            }

            /*
             if (finalAnswer.equals("R: Desisto")) {
             System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.\n");
             System.out.println("Levou assim para casa o prémio de " + Values[i] + " Euros");
             }

             if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
             if (i != 15) {
             System.out.println("Resposta correcta!\n");
             System.out.println("Parabéns, acabou de ganhar " + Values[i] + " Euros");
             i++;
             } else {
             System.out.println("PARABÉNS, ACABOU DE GANHAR O JOGO DO QUEM QUER SER MILIONÁRIO!\n GANHOU O PŔEMIO DE 250.000 Euros!");
             }
             } else {
             System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.");
             System.out.println("Levou assim para casa o prémio de " + Values[10] + " Euros");
             break;
             }
             */
        }
    }
    
    //USER'S INPUT VERIFICATION
    public void verifyInput(int Ql) {
        if (Ql == 1) {
            switch (answer) {
                case "A":
                    if (finalAnswer.equals(Ql1.get(whichQuestion * 7 + (7 - 2)))) {
                        System.out.println("Resposta correcta!\n");
                        System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                        i++;
                        removeQuestion(1);

                        wrongInput = 0;
                        return;
                    } else {
                        wrongAnswer++;
                        return;
                    }

                case "B":
                    if (finalAnswer.equals(Ql1.get(whichQuestion * 7 + (7 - 2)))) {
                        System.out.println("Resposta correcta!\n");
                        System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                        i++;
                        removeQuestion(1);

                        wrongInput = 0;
                        return;
                    } else {
                        wrongAnswer++;
                        return;
                    }
                case "C":
                    if (finalAnswer.equals(Ql1.get(whichQuestion * 7 + (7 - 2)))) {
                        System.out.println("Resposta correcta!\n");
                        System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                        i++;

                        removeQuestion(1);

                        wrongInput = 0;
                        return;
                    } else {
                        wrongAnswer++;
                        return;
                    }
                case "D":
                    if (finalAnswer.equals(Ql1.get(whichQuestion * 7 + (7 - 2)))) {
                        System.out.println("Resposta correcta!\n");
                        System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                        i++;

                        removeQuestion(1);

                        wrongInput = 0;
                        return;
                    } else {
                        wrongAnswer++;
                        return;
                    }
                case "DESISTO":
                    System.out.println("\nO jogo do Quem Quer Ser Milionário terminou por hoje.");
                    System.out.println("\nLevou assim para casa o prémio de " + Values[i - 1] + " Euros\n");
                    return;
                default:
                    System.out.println("\nResposta inválida, tente novamente\n");
                    wrongInput++;
            }
        }

        if (Ql == 2) {
            switch (answer) {
                case "A":
                    if (finalAnswer.equals(Ql2.get(whichQuestion * 7 + (7 - 2)))) {
                        System.out.println("Resposta correcta!\n");
                        System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                        i++;

                        removeQuestion(2);

                        wrongInput = 0;
                        break;
                    } else {
                        System.out.println("\nLeva assim para casa " + Landings[0] + "Euros\n");
                        wrongAnswer++;
                        return;
                    }

                case "B":
                    if (finalAnswer.equals(Ql2.get(whichQuestion * 7 + (7 - 2)))) {
                        System.out.println("Resposta correcta!\n");
                        System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                        i++;

                        removeQuestion(2);

                        wrongInput = 0;
                        break;
                    } else {
                        System.out.println("\nLeva assim para casa " + Landings[0] + "Euros\n");
                        wrongAnswer++;
                        return;
                    }
                case "C":
                    if (finalAnswer.equals(Ql2.get(whichQuestion * 7 + (7 - 2)))) {
                        System.out.println("Resposta correcta!\n");
                        System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                        i++;

                        removeQuestion(2);

                        wrongInput = 0;
                        break;
                    } else {
                        System.out.println("\nLeva assim para casa " + Landings[0] + "Euros\n");
                        wrongAnswer++;
                        return;
                    }
                case "D":
                    if (finalAnswer.equals(Ql2.get(whichQuestion * 7 + (7 - 2)))) {
                        System.out.println("Resposta correcta!\n");
                        System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                        i++;

                        removeQuestion(2);

                        wrongInput = 0;
                        break;
                    } else {
                        System.out.println("\nLeva assim para casa " + Landings[0] + "Euros\n");
                        wrongAnswer++;
                        return;
                    }
                case "DESISTO":
                    System.out.println("\nO jogo do Quem Quer Ser Milionário terminou por hoje.");
                    System.out.println("\nLevou assim para casa o prémio de " + Values[i - 1] + " Euros\n");
                    return;
                default:
                    System.out.println("\nResposta inválida, tente novamente\n");
                    wrongInput++;
            }
        }

        if (Ql == 3) {
            switch (answer) {
                case "A":
                    if (i < 14) {
                        if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
                            System.out.println("Resposta correcta!\n");
                            System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                            i++;

                            removeQuestion(3);

                            wrongInput = 0;
                            break;
                        } else {
                            System.out.println("\nLeva assim para casa " + Landings[1] + "Euros\n");
                            wrongAnswer++;
                            return;
                        }
                    }
                    if (i == 14) {
                        if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
                            System.out.println("Resposta correcta!\n");
                            System.out.println("PARABÉNS, acabou de ganhar o prémio máximo de 250.000 Euros do Quem Quer Ser Milionário!");
                            i++;
                            return;
                        } else {
                            System.out.println("\nLeva assim para casa " + Landings[1] + "Euros\n");
                            wrongAnswer++;
                            return;
                        }
                    }

                case "B":
                    if (i < 14) {
                        if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
                            System.out.println("Resposta correcta!\n");
                            System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                            i++;

                            removeQuestion(3);

                            wrongInput = 0;
                            break;
                        } else {
                            System.out.println("\nLeva assim para casa " + Landings[1] + "Euros\n");
                            wrongAnswer++;
                            return;
                        }
                    }
                    if (i == 14) {
                        if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
                            System.out.println("Resposta correcta!\n");
                            System.out.println("PARABÉNS, acabou de ganhar o prémio máximo de 250.000 Euros do Quem Quer Ser Milionário!");
                            i++;
                            return;
                        } else {
                            System.out.println("\nLeva assim para casa " + Landings[1] + "Euros\n");
                            wrongAnswer++;
                            return;
                        }
                    }
                case "C":
                    if (i < 14) {
                        if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
                            System.out.println("Resposta correcta!\n");
                            System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                            i++;

                            removeQuestion(3);

                            wrongInput = 0;
                            break;
                        } else {
                            System.out.println("\nLeva assim para casa " + Landings[1] + "Euros\n");
                            wrongAnswer++;
                            return;
                        }
                    }
                    if (i == 14) {
                        if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
                            System.out.println("Resposta correcta!\n");
                            System.out.println("PARABÉNS, acabou de ganhar o prémio máximo de 250.000 Euros do Quem Quer Ser Milionário!");
                            i++;
                            return;
                        } else {
                            System.out.println("\nLeva assim para casa " + Landings[1] + "Euros\n");
                            wrongAnswer++;
                            return;
                        }
                    }
                case "D":
                    if (i < 14) {
                        if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
                            System.out.println("Resposta correcta!\n");
                            System.out.println("Parabéns, acabou de passar o patamar dos " + Values[i] + " Euros\n");
                            i++;

                            removeQuestion(3);

                            wrongInput = 0;
                            break;
                        } else {
                            System.out.println("\nLeva assim para casa " + Landings[1] + "Euros\n");
                            wrongAnswer++;
                            return;
                        }
                    }
                    if (i == 14) {
                        if (finalAnswer.equals(Ql3.get(whichQuestion * 7 + (7 - 2)))) {
                            System.out.println("Resposta correcta!\n");
                            System.out.println("PARABÉNS, acabou de ganhar o prémio máximo de 250.000 Euros do Quem Quer Ser Milionário!");
                            i++;
                            return;
                        } else {
                            System.out.println("\nLeva assim para casa " + Landings[1] + "Euros\n");
                            wrongAnswer++;
                            return;
                        }
                    }
                case "DESISTO":
                    System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.\n");
                    System.out.println("Levou assim para casa o prémio de " + Values[i - 1] + " Euros\n");
                    return;
                default:
                    System.out.println("\nResposta inválida, tente novamente\n");
                    wrongInput++;
            }
        }
    }
    
    public void convertAnswer() {
        finalAnswer = ("R: " + answer);
    }
	
    public void removeQuestion(int Ql) {
        if (Ql == 1) {
            for (c = 0; c < 7; c++) {
                Ql1.remove((whichQuestion * 7));
            }
            Ql1Counter = Ql1Counter - 7;
        }
        if (Ql == 2) {
            for (c = 0; c < 7; c++) {
                Ql2.remove((whichQuestion * 7));
            }
            Ql2Counter = Ql2Counter - 7;
        }
        if (Ql == 3) {
            for (c = 0; c < 7; c++) {
                Ql3.remove((whichQuestion * 7));
            }
            Ql3Counter = Ql3Counter - 7;
        }
    }
        
	//# 1 PLAYER'S REGISTRATION #
	
    public void asknamePlayer() {
        System.out.println("Qual o nome do concorrente?");
        name = sC.nextLine();
        System.out.println("\nBem vindo ao jogo do Quem Quer Ser Milionário " + name + "!\n");
        System.out.println("A qualquer momento poderá desistir escrevendo 'DESISTO'");
    }
	
}