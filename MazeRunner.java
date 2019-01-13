package mazeFinal;

import java.util.Scanner;

public class MazeRunner {

    public static Maze myMap = new Maze();
    //public static Scanner scan = new Scanner(System.in);
    public static int userStep=0;
    public static  boolean jumped;
    public static void main(String[] args){
        intro();
        //userMove();
        while (myMap.didIWin()==false){
            String uDirection = userMove();
            if (uDirection.equalsIgnoreCase("R")||uDirection.equalsIgnoreCase("L")||uDirection.equalsIgnoreCase("U")||uDirection.equalsIgnoreCase("D"))
                navigatePit(uDirection);
        }
        if (myMap.didIWin()==true){
            System.out.println("Congratulations, you made it out alive!");
            System.out.println("you did it  "+MazeRunner.userStep + "moves");
        }


    }
    public static void intro(){
        System.out.println("Welcome to Maze Runner! \n" +
                "Here is your current position:");
        myMap.printMap();

    }
    public static void movesMessage(int move){
        switch (move){
            case 50:
                System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
                break;
            case 75:
                System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
                break;
            case 90:
                System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
                break;
            case 100:
                System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
                System.out.println(0);
                break;
                default:
                    break;
        }

    }
    public static String userMove() {
        Scanner scan = new Scanner(System.in);
        String userDirection = "";
        do {
            if (MazeRunner.userStep != 101)
            {
                System.out.print("Where would you like to move? (R, L, U, D) ");
                userDirection = scan.next();
            }

            if (userDirection.equalsIgnoreCase("R") || userDirection.equalsIgnoreCase("L") || userDirection.equalsIgnoreCase("U") || userDirection.equalsIgnoreCase("D")) {
                movesMessage(++MazeRunner.userStep);

                if (myMap.canIMoveDown() == true && userDirection.equalsIgnoreCase("D")) {
                    myMap.moveDown();
                }
                else if (myMap.canIMoveUp() == true && userDirection.equalsIgnoreCase("U")) {
                    myMap.moveUp();
                }
                else if (myMap.canIMoveLeft() == true && userDirection.equalsIgnoreCase("L")) {
                    myMap.moveLeft();
                }
                else if (myMap.canIMoveRight() == true && userDirection.equalsIgnoreCase("R")) {
                    myMap.moveRight();
                }
                else {
                    if (MazeRunner.userStep != 100) {

                        System.out.println("sorry, you have hit wall");
                        System.out.print("where would like to move? (R,L,U,D) ");
                        userDirection = scan.next();
                        movesMessage(++MazeRunner.userStep);
                    }
                }
                myMap.printMap();
                break;
            }
        } while (userDirection.matches("RLUD") == false);
        return userDirection;

    }
    public static void navigatePit(String uDirection){//handles pit
        Scanner scan = new Scanner(System.in);
        if (myMap.isThereAPit(uDirection) == true)
        {
            System.out.println("Watch out! There's a pit ahead, jump it? ");
            String jump = scan.next();

        if (jump.equalsIgnoreCase("yes"))
            myMap.jumpOverPit(uDirection);

            else{
            System.out.println("Sorry you didnt jump");
            System.exit(0);
        }

        }else{
            System.out.println("Sorry you hitted a wall");
        }




    }
}
