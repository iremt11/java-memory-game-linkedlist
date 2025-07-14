import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SingleLinkList animalList = new SingleLinkList();
        SingleLinkList SLL = new SingleLinkList();
        SingleLinkList TempSLL = new SingleLinkList();
        SingleLinkList SLL1 = new SingleLinkList();
        SingleLinkList TempSLL1 = new SingleLinkList();
        SingleLinkList SLL2 = new SingleLinkList();
        SingleLinkList SLL3 = new SingleLinkList();
        SingleLinkList SLL4 = new SingleLinkList();
        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new FileReader("(D:\\\\animals.txt"));
            String animal;
            while ((animal = br.readLine()) != null) {
                animalList.add(animal);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        System.out.println("------------------------Welcome Memory Game------------------------\n");
        System.out.print("\u001B[34m" + "Animal SLL: " + "\u001B[0m");
        System.out.print("\u001B[34m");
        animalList.display();
        System.out.print("\u001B[0m\n\n");
        System.out.println("Please enter n: ");
        int n = sc.nextInt();
        if (n > animalList.size()) {
            System.out.println("Error.");
        } else {
            //Random selected for SLL
            Random random = new Random();
            int score = 0;
            while (n > 0) {
                if (n == 1) {
                    Node temp = animalList.getHead();
                    SLL.add(temp.getData());
                    n--;
                } else {
                    int randomIndex = random.nextInt(animalList.size());
                    Node temp = animalList.getHead();
                    for (int i = 0; i < animalList.size(); i++) {
                        if (i == randomIndex) {
                            animalList.delete(temp.getData());
                            SLL.add(temp.getData());
                        } else {
                            temp = temp.getLink();
                        }
                    }
                    n--;
                }

            }

            Node temp1 = SLL.getHead();
            while (temp1 != null) {
                TempSLL.add(temp1.getData());
                temp1 = temp1.getLink();
            }


            int a = TempSLL.size();
            //Random selected SLL1
            while (a > 0) {
                if (a == 1) {
                    Node temp2 = TempSLL.getHead();
                    SLL1.add(temp2.getData());
                    a--;
                } else {
                    int randomIndexToSwap = random.nextInt(TempSLL.size());
                    Node temp2 = TempSLL.getHead();
                    for (int i = 0; i < TempSLL.size(); i++) {
                        if (i == randomIndexToSwap) {
                            TempSLL.delete(temp2.getData());
                            SLL1.add(temp2.getData());
                        } else {
                            temp2 = temp2.getLink();
                        }
                    }
                    a--;
                }
            }

            int b = SLL.size();
            //Random selected SLL2
            while (b > 0) {
                if (b == 1) {
                    Node temp2 = SLL.getHead();
                    SLL2.add(temp2.getData());
                    b--;
                } else {
                    int randomIndexToSwap = random.nextInt(SLL.size());
                    Node temp2 = SLL.getHead();
                    for (int i = 0; i < SLL.size(); i++) {
                        if (i == randomIndexToSwap) {
                            SLL.delete(temp2.getData());
                            SLL2.add(temp2.getData());
                        } else {
                            temp2 = temp2.getLink();
                        }
                    }
                    b--;
                }
            }

            Node tmp = SLL1.getHead();
            while (tmp != null) {
                TempSLL1.add(tmp.getData());
                tmp = tmp.getLink();
            }

            int step = 0;
            while (!(SLL1.size() == 0)) {
                int randomNumber1 = random.nextInt(SLL1.size());
                int randomNumber2 = random.nextInt(SLL1.size());
                if (step != 0) {
                    System.out.print("\u001B[36mRandomly generated numbers: " + (randomNumber1 + 1) + "  " + (randomNumber2 + 1) + "\u001B[0m");
                }
                if (step != 0) {
                    System.out.print("\t\t\t\t\t\t\u001B[34mStep:" + step + "\u001B[0m\n");
                }
                if (step == 0) {
                    System.out.print("\u001B[38;5;208m");
                    System.out.print("SLL1: ");
                    SLL1.display();
                    System.out.print("\u001B[0m\n");
                    System.out.print("\u001B[38;5;208m");
                    System.out.print("SLL2: ");
                    SLL2.display();
                    System.out.print("\u001B[0m");
                    System.out.print("\t\t\t\t\t\t\u001B[32mScore:" + score + "\u001B[0m\n");
                }
                if (SLL1.find(randomNumber1) == SLL2.find(randomNumber2)) {
                    SLL1.delete(SLL1.find(randomNumber1));
                    SLL2.delete(SLL2.find(randomNumber2));
                    score += 20;
                    System.out.print("\n\u001B[38;5;208m");
                    System.out.print("SLL1: ");
                    SLL1.display();
                    System.out.print("\u001B[0m");
                    System.out.print("\t\t\t\t\t\u001B[32mScore:" + score + "\u001B[0m\n");
                    System.out.print("\u001B[38;5;208m");
                    System.out.print("SLL2: ");
                    SLL2.display();
                    System.out.print("\u001B[0m\n");
                } else {
                    if (step != 0) {
                        score -= 1;
                        System.out.print("\n\u001B[38;5;208m");
                        System.out.print("SLL1: ");
                        SLL1.display();
                        System.out.print("\u001B[0m");
                        System.out.print("\t\t\t\t\u001B[32m    Score:" + score + "\u001B[0m\n");
                        System.out.print("\u001B[38;5;208m");
                        System.out.print("SLL2: ");
                        SLL2.display();
                        System.out.print("\u001B[0m\n");
                    }
                }
                step++;
            }
            System.out.println("\n\u001B[31mThe game is over.\u001B[0m\n");

            try (BufferedReader reader = new BufferedReader(new FileReader("D:\\\\highscoretable.txt"))) {
                String lne;
                int c = 0;
                while ((lne = reader.readLine()) != null && c < 12) {
                    String[] prt = lne.split("\\s+");
                    if (prt.length == 2) {
                        SLL3.add(prt[0]);
                        SLL4.add(Integer.parseInt(prt[1]));
                        c++;
                    } else
                        System.out.println("Invalid format in line: " + lne);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File is not found.");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Error.");
                e.printStackTrace();
            }

            System.out.println("What is your name ? ");
            String name = sc.next();
            SLL3.add(name);
            SLL4.add(score);

            //High Score Table
            System.out.println("High score Table: ");
            //Write
            try {
                SLL3.display2(SLL3,SLL4);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}




