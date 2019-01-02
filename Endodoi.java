import java.util.Scanner;
/**
 * @author Isaah Gray
 * @version semester 1
 */

public class Endodoi {
    /**
     * @author Isaah Gray
     * @param args
     * @ version semester 1
     */
    /**
     * This game uses alot of data structures we've learned.
     *implements a bunch of methods
     * @param args this program takes into effect rounded decimal
     */
    // @Isaah Gray: version : Pay Stub Calculator//
    public static void main(String[] args) {
        /**This plays mancalla.
         * 2d arrays.
         * @param args this was one of the hardest assignments yet.
         *
         *
         */
        // @Isaah Gray: version : Pay Stub Calculator//

        Scanner scan = new Scanner(System.in);
        String selector = scan.nextLine();
        char sp = selector.charAt(0);
        int pitsPerRow = scan.nextInt();
        int numSeeds = scan.nextInt();
        int indicatePlayerTurn = scan.nextInt();
        Integer storePlayerA = scan.nextInt();
        Integer storePlayerB = scan.nextInt();
        System.out.println();


        drawBoard(createNewPits(pitsPerRow, numSeeds),
                storePlayerA, storePlayerB, sp, indicatePlayerTurn);
    }


    /**
     * this draws the board.
     *
     * @param pits               determines pits.
     * @param storePlayer1       player 1s score.
     * @param storePlayer2       player two score.
     * @param sp                 checks for letter.
     * @param indicatePlayerTurn whos up next.
     */
    public static void drawBoard(int[][] pits, int
            storePlayer1, int storePlayer2, char sp, int indicatePlayerTurn) {


        System.out.print(" +====++==++");
        for (int i = 0; i < pits[0].length; i++) {
            System.out.print("----+");

        }
        System.out.println();
        if (indicatePlayerTurn == 1 && storePlayer1 != 0) {
            System.out.print("1|(");
            if (storePlayer1 > 9) {
                System.out.print(storePlayer1 + ")||\\/||");
            } else {
                System.out.print(" " + storePlayer1 + ")||\\/||");
            }

        } else if (indicatePlayerTurn == 1) {
            System.out.print("1|(");
            System.out.print("  )||\\/||");

        } else if (storePlayer1 == 0) {
            System.out.print("1|(  )||  ||");
        } else {

            System.out.print("1|( " + storePlayer1 + ")||  ||");

        }
        for (int i = 0; i < pits[0].length; i++) {
            if (pits[0][i] != 0) {
                System.out.print("( " + pits[0][i] + ")|");
            } else {
                System.out.print("(  )|");
            }
        }
        System.out.println();
        if (indicatePlayerTurn == 1) {
            System.out.print(" | st ||/\\||");
        } else {
            System.out.print(" | st ||  ||");
        }

        for (int i = 0; i < pits[1].length; i++) {
            if ((playerPitLabels(pits)[0][i]) == sp) {
                System.out.print("  * |");
            } else if (indicatePlayerTurn == 2) {
                System.out.print("    |");
            } else {
                System.out.print("  " + (playerPitLabels(pits)[0][i]) + " |");
            }
        }
        System.out.println();
        System.out.print(" +====++==++");
        for (int i = 0; i < pits[0].length; i++) {
            System.out.print("----+");

        }


        //        Second half of board


        System.out.println();
        int count = 0;
        if (indicatePlayerTurn == 2 && storePlayer2 != 0) {
            System.out.print("2|( ");
            if (storePlayer2 < 9) {
                System.out.print(storePlayer2 + ")||\\/||");
            } else {
                System.out.print(" " + storePlayer2 + ")||\\/||");
            }
        } else if (indicatePlayerTurn == 2) {
            System.out.print("2|(");
            System.out.print("  )||\\/||");

        } else if (storePlayer2 == 0) {
            System.out.print("2|(  )||  ||");
        } else {
            System.out.print("2|(");
            if (storePlayer1 > 9) {
                System.out.print(storePlayer2 + ")||  ||");
            } else {
                System.out.print(" " + storePlayer2 + ")||  ||");
            }

        }
        for (int i = 0; i < pits[0].length; i++) {
            if (pits[1][i] != 0) {
                System.out.print("( " + pits[1][i] + ")|");

                count++;
            } else {
                System.out.print("(  )|");
                count++;
            }

        }
        System.out.println();
        if (indicatePlayerTurn == 2) {
            System.out.print(" | st ||/\\||");
        } else {
            System.out.print(" | st ||  ||");
        }
        for (int i = 0; i < pits[0].length; i++) {
            if ((playerPitLabels(pits)[1][i]) == sp) {
                System.out.print("  * |");
            } else if (indicatePlayerTurn == 1) {
                System.out.print("    |");
            } else {
                System.out.print("  " + (playerPitLabels(pits)[1][i]) + " |");
            }
        }
        System.out.println();
        System.out.print(" +====++==+");
        System.out.print("+");
        for (int i = 0; i < pits[0].length; i++) {
            System.out.print("----+");

        }
        System.out.println();

    }


    /**
     * creates the 2d array of letters.
     *
     * @param pits hopes adding this helps me pass checkstyle.
     * @return arr
     */
    public static char[][] playerPitLabels(int[][] pits) {
        /**creates the 2d array of letters.
         * @param pits
         *hopes adding this helps me pass checkstyle.
         * @return arr
         *
         */

        char temp = 'a';

        char[][] arr = new char[2][pits[1].length];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < pits[1].length; col++) {
                arr[row][col] = temp++;
            }
        }
        return arr;
    }


    /**
     * detmines the size of game.
     *
     * @param pitsPerRow how many pits.
     * @param numSeeds   how many seeds.
     * @return 2d game.
     */
    public static int[][] createNewPits(int pitsPerRow, int numSeeds) {


        int[][] pits = new int[2][pitsPerRow];
        for (int rows = 0; rows < pits.length; rows++) {
            for (int cols = 0; cols < pits[1].length; cols++) {
                pits[rows][cols] = numSeeds;
            }
        }
        return pits;

    }

    /**
     * @param b
     * starter lab given.
     * @param ints
     * 2d array.
     * @return
     * returns reg array.
     */
    public static int[] pit2Coordinates(char b, int[][] ints) {
        int[] a = new int[2];
        char[][] let = playerPitLabels(ints);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                if (let[i][j] == b) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }


    /**
     * @param b
     * char given in starter lab.
     * @param ints
     * not sure what this does.
     * @return
     * returns a char for a method check to pass.
     *
     */
    public static char getOpposingPit(char b, int[][] ints) {
        char[][] labels = playerPitLabels(ints);
        int[] c = pit2Coordinates(b, ints);
        if (c[0] == 0) {
            c[0] = 1;
        } else if (c[0] == 1) {
            c[0] = 0;
        }
        return labels[c[0]][c[1]];
    }


    /**
     * @param player
     * determines what player is up.
     * @param pit
     * what pit they control.
     * @param playersPits
     * 2d array.
     * @return
     * returns boolean.
     */
    public static boolean isPitInPlayerRow(int player,
                                           char pit, int[][] playersPits) {
        boolean determine = false;

        if (pit2Coordinates(pit, playersPits)[0] == player - 1) {

            determine = true;

        }

        return determine;
    }

    /**
     * @param currentPit
     * what pit they started in.
     * @param playersPits
     * 2d array.
     * @return
     * char.
     */
    public static char nextPit(char currentPit, int[][] playersPits) {
        char temp = currentPit;
        int[] down = {0, 0};
        int[] tempArray = pit2Coordinates(currentPit, playersPits);
        char[][] letters = playerPitLabels(playersPits);
        int[] up = {1, playersPits[1].length - 1};
        if (currentPit == 'a') {
            temp = letters[1][0];

        } else if (tempArray[0] == up[0] && up[1] == tempArray[1]) {
            temp = getOpposingPit(currentPit, playersPits);
        } else {
            if (pit2Coordinates(currentPit, playersPits)[0] == 0) {
                temp -= 1;
            } else {
                temp += 1;
            }
        }


        return temp;
    }

    /**
     * @param pit
     * char to choose.
     * @param playersPits
     * 2 d array chosen.
     * @return
     * returning an integer of seed count.
     */
    public static int getPitSeedCount(char pit, int[][] playersPits) {
        int x = 0;
        for (int i = 0; i < playersPits.length; i++) {
            for (int j = 0; j < playersPits[i].length; j++) {
                if ((playerPitLabels(playersPits)[i][j]) == pit) {
                    x = playersPits[i][j];
                }
            }
        }

        return x;
    }


    /**
     * @param pickPit
     * what pit they want.
     * @param playersPits
     * 2 d array.
     * @return
     * returns a char for single sow.
     */
    public static char singleSow(char pickPit, int[][] playersPits) {
        char futurePit = pickPit;
        int next = 0;
        int rowOne;
        int colOne;

        int counted = getPitSeedCount(pickPit, playersPits);
        rowOne = pit2Coordinates(futurePit, playersPits)[0];
        colOne = pit2Coordinates(futurePit, playersPits)[1];
        playersPits[rowOne][colOne] = next;
        for (int i = 0; i < counted; i++) {
            futurePit = nextPit(futurePit, playersPits);
            next = getPitSeedCount(futurePit, playersPits) + 1;
            rowOne = pit2Coordinates(futurePit, playersPits)[0];
            colOne = pit2Coordinates(futurePit, playersPits)[1];
            playersPits[rowOne][colOne] = next;
        }
        return futurePit;
    }


    /**
     * @param playersPits
     * from beginning.
     * @param isPlayer1Turn
     * if player 1 turn or not.
     * @return
     * checks to see if game is over.
     */
    public static boolean checkEndGame(int[][] playersPits,
                                       boolean isPlayer1Turn) {
        boolean statement;
        if (isPlayer1Turn) {
            int sum = 0;
            for (int i = 0; i < playerPitLabels(playersPits)[0].length;
                 i++) {
                sum = sum + getPitSeedCount(playerPitLabels(playersPits)[0][i],
                        playersPits);

            }
            if (sum == 0) {
                statement = true;
            } else {
                statement = false;
            }
        } else {
            int sum = 0;
            for (int i = 0; i < playerPitLabels(playersPits)[0].length; i++) {
                sum = sum + getPitSeedCount(playerPitLabels(playersPits)[1][i],
                        playersPits);

            }
            if (sum == 0) {
                statement = true;
            } else {
                statement =  false;
            }

        }
        return statement;
    }





    /**
     * @param playersPits
     * from part 1.
     * @return
     * should return an int.
     */
    public static int totalSeedsOnBoard(int[][] playersPits) {
        int sum = 0;
        for (int row = 0; row < playersPits.length; row++) {
            for (int col = 0; col < playersPits[row].length; col++) {
                sum = sum + playersPits[row][col];
            }
        }

        return sum;
    }


    /**
     * from part1.
     * @param playersPits
     * from part1.
     */
    public static void clearBoard(int[][] playersPits) {
        // easiest method thus far.
        // still confused on where it comes into play.
        for (int row = 0; row < playersPits.length; row++) {
            for (int col = 0; col < playersPits[1].length; col++) {
                playersPits[row][col] = 0;
            }
        }

    }


    /**
     * @param playersPits
     * following from part 1 and two.
     * @param player1Store
     * how much they have.
     * @param player2Store
     * how much they have.
     * Had to use a for loop.
     * @param isPlayer1Turn
     * if player ones turn.
     */
    public static void playGame(int[][] playersPits, int player1Store,
                                int player2Store, boolean isPlayer1Turn) {
        // Does't use clear board.
        // Come back to
        int player2Stores =  player2Store;
        int player1Stores =  player1Store;
        System.out.println("Starting game of Endodoi");
        int whoTurn = 2;
        boolean oneUp = false;
        if (isPlayer1Turn) {
            whoTurn = 1;
        }
        drawBoard(playersPits, player1Stores, player2Stores, ' ',
                whoTurn);
        Scanner scan = new Scanner(System.in);
        char pitSelected;
        int numCaptured;
        int numLaps;
        int seeds;
        boolean looping = true;
        boolean sowing = true;
        playerPitLabels(playersPits);
        while (looping) { // This is where the sequence will begin.
            for (int i = whoTurn; i < 3; i++) {
                // ran it 3 times because two would be max.
                if (i == 1) {
                    oneUp = true;
                }
                if (checkEndGame(playersPits, oneUp)) {
                    System.out.println("Player " + i + " can't move.");
                    seeds = totalSeedsOnBoard(playersPits);
                    if (oneUp) {
                        player2Stores = player2Stores + seeds;
                        System.out.println(
                                "The remaining " + seeds
                                        + " seeds go to Player 2");
                    } else {
                        player1Stores = player1Stores + seeds;
                        System.out.println("The remaining " + seeds
                                + " seeds go to Player 1");
                    }
                    clearBoard(playersPits);
                    drawBoard(
                            playersPits, player1Stores, player2Stores, ' ', 0);
                    if (i == 2) {
                        System.out.println("Player 1 is the winner!");
                    } else {
                        System.out.println("Player 2 is the winner!");
                    }
                    looping = false;
                    break;
                }
                numLaps = 0;
                System.out.println("Player " + i + " chose a pit: ");
                pitSelected = scan.next().charAt(0);
                if (pitSelected == '!') {
                    System.out.println("Game ended");
                    looping = false;
                    break;
                } else if (getPitSeedCount(pitSelected, playersPits) == 0) {
                    if (isPitInPlayerRow(i, pitSelected,
                            playersPits)) {
                        System.out.println(
                                "Can't pick from "
                                        + "an empty pit. Please pick again.");
                    } else {
                        System.out.println(
                                "Not a valid pit. "
                                        + "Please pick again.");
                        // a lot of if statements
                    }
                } else {
                    while (sowing) {
                        pitSelected = singleSow(pitSelected, playersPits);
                        if (getPitSeedCount(pitSelected, playersPits) == 1) {
                            drawBoard(playersPits, player1Stores,
                                    player2Stores, pitSelected, i);
                            if (getPitSeedCount(getOpposingPit(pitSelected,
                                    playersPits), playersPits) == 0) {
                                numCaptured = 0;
                                System.out.println("Player "
                                        + i + "'s turn ended.");
                                // where it switches.
                            } else {
                                numCaptured =
                                        playersPits
                                                [pit2Coordinates(pitSelected,
                                        playersPits)[0]]
                                                [pit2Coordinates(pitSelected,
                                        playersPits)[1]]
                                                + playersPits
                                                [pit2Coordinates(
                                                        getOpposingPit(
                                                                pitSelected,
                                        playersPits), playersPits)
                                                [0]]
                                                [pit2Coordinates(
                                                        getOpposingPit(
                                                                pitSelected,
                                        playersPits), playersPits)[1]];
                                // gotta be a cleaner
                                // way to write this.. come Back to it 12/03/18
                                if (i == 1) {
                                    player1Stores
                                            = player2Stores + numCaptured;
                                } else {
                                    player2Stores = player2Stores + numCaptured;
                                }
                                System.out.println(
                                        "Player " + i + "'s turn ended.");
                                System.out.println(
                                        "Player " + i + " captured "
                                                + numCaptured + " seeds");
                                playersPits[pit2Coordinates(
                                        pitSelected,
                                        playersPits)[0]]
                                        [pit2Coordinates(pitSelected,
                                        playersPits)[1]] = 0;
                                playersPits[pit2Coordinates(
                                        getOpposingPit(pitSelected,
                                                playersPits),
                                        playersPits)[0]]
                                        [pit2Coordinates(getOpposingPit(
                                                pitSelected, playersPits),
                                        playersPits)[1]] = 0;
                            }
                            if (i == 1) {
                                whoTurn = 2;
                            } else {
                                whoTurn = 1;
                            }
                            drawBoard(
                                    playersPits, player1Stores,
                                            player2Stores, ' ', whoTurn);
                            sowing = false;
                        } else {

                            numLaps = numLaps + 1;
                            drawBoard(
                                    playersPits,
                                            player1Stores,
                                    player2Stores, pitSelected, i);
                            System.out.println(
                                    "Sowing ended"
                                    + " in non-empty pit. Multi-lap "
                                    + numLaps + ". Resowing seeds...");
                        }
                    }
                }
            }
        }
    }









}



