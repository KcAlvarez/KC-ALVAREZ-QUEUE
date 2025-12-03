import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-------------------------------------------------");
            System.out.println(" Select a problem to run (1-56)");
            System.out.println(" Enter 0 to exit the program.");
            System.out.print(" Your choice: ");
            choice = input.nextInt();
            System.out.println("-------------------------------------------------");

            if (choice == 0) {
                System.out.println("Thank you for using my program!");
                break;
            }

            if (choice < 0 || choice > 56) {
                System.out.println("This option is not available yet.");
                continue;
            }

            runProblem(choice);

        } while (choice != 0);
    }

    public static void runProblem(int number) {
        MyFunctions func = new MyFunctions();

        switch (number) {
            case 1:  MyFunctions.problemNo1(); break;
            case 2:  MyFunctions.problemNo2(); break;
            case 3:  func.problemNo3(); break;
            case 4:  func.problemNo4(); break;
            case 5:  func.problemNo5(); break;
            case 6:  func.problemNo6(); break;
            case 7:  func.problemNo7(); break;
            case 8:  func.problemNo8(); break;
            case 9:  func.problemNo9(); break;
            case 10: func.problemNo10(); break;
            case 11: func.problemNo11(); break;
            case 12: func.problemNo12(); break;
            case 13: func.problemNo13(); break;
            case 14: func.problemNo14(); break;
            case 15: func.problemNo15(); break;
            case 16: func.problemNo16(); break;
            case 17: func.problemNo17(); break;
            case 18: func.problemNo18(); break;
            case 19: func.problemNo19(); break;
            case 20: func.problemNo20(); break;
            case 21: func.problemNo21(); break;
            case 22: func.problemNo22(); break;
            case 23: func.problemNo23(); break;
            case 24: func.problemNo24(); break;
            case 25: func.problemNo25(); break;
            case 26: func.problemNo26(); break;
            case 27: func.problemNo27(); break;
            case 28: func.problemNo28(); break;
            case 29: func.problemNo29(); break;
            case 30: func.problemNo30(); break;
            case 31: func.problemNo31(); break;
            case 32: func.problemNo32(); break;
            case 33: func.problemNo33(); break;
            case 34: func.problemNo34(); break;
            case 35: func.problemNo35(); break;
            case 36: func.problemNo36(); break;
            case 37: func.problemNo37(); break;
            case 38: func.problemNo38(); break;
            case 39: func.problemNo39(); break;
            case 40: func.problemNo40(); break;
            case 41: func.problemNo41(); break;
            case 42: func.problemNo42(); break;
            case 43: func.problemNo43(); break;
            case 44: func.problemNo44(); break;
            case 45: func.problemNo45(); break;
            case 46: func.problemNo46(); break;
            case 47: func.problemNo47(); break;
            case 48: func.problemNo48(); break;
            case 49: func.problemNo49(); break;
            case 50: func.problemNo50(); break;
            case 51: func.problemNo51(); break;
            case 52: func.problemNo52(); break;
            case 53: func.problemNo53(); break;
            case 54: func.problemNo54(); break;
            case 55: func.problemNo55(); break;
            case 56: func.problemNo56(); break;
            default:
                System.out.println("Not yet implemented.");
        }
    }
}