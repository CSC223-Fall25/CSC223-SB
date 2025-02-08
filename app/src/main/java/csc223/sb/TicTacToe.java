package csc223.sb;
import java.util.Scanner;

public class TicTacToe implements Game{

    
    char[][] board;
    char current_player;
    Scanner scanner;
    
    
    @Override
    public void startGame(){

        // inialize board
        this.board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                this.board[i][j] = ' ';
            }
        }

        this.scanner = new Scanner(System.in);

        // player chooses X or O
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Choose symbol (X or O):");
        char input = (scanner.next().toUpperCase().charAt(0));

        if (input == 'X'){
            this.current_player = 'X';
        } else {
            this.current_player = 'O';
        }

    }



    @Override
    public void printBoard(){
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }

    }



    @Override
    public void takeTurn(){

        int row, col;
        boolean valid_move = false;

        while (!valid_move){
            System.out.println("Player " + current_player + "enter row and column(0-2):");
            row = this.scanner.nextInt();
            col = this.scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && this.board[row][col] == ' '){
                this.board[row][col] = this.current_player;
                valid_move = true;
            } else {
                System.out.println("Invalid move, try again:");
            }
        }

        if (this.current_player == 'O'){
            this.current_player = 'X';
        } else {
            this.current_player = 'O';
        }


    }



    @Override
    public boolean isGameOver(){
        for (int i = 0; i < 3; i++) {
            if ((this.board[i][0] != ' ' && this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2]) || 
                (this.board[0][i] != ' ' && this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i])) {
                return true;
            }
        }
        // diagonal
        if ((this.board[0][0] != ' ' && this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2]) ||
            (this.board[0][2] != ' ' && this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0])) {
            return true; 
        }
    
        // Check for a draw (no empty spaces left)
        for (char[] row : this.board) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }
        // draw - board is full 
        return true; 
    }




    @Override
    public void endGame(){
        printBoard();
        
        for (int i = 0; i < 3; i++){
            if ((this.board[i][0] != ' ' && this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2]) || 
                (this.board[0][i] != ' ' && this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i]) ||
                (this.board[0][0] != ' ' && this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2]) ||
                (this.board[0][2] != ' ' && this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0])){
                if (this.current_player == 'O'){
                    this.current_player = 'X';
                } else {
                    this.current_player = 'O';
                }
                System.out.println("Player " + this.current_player + " wins!");
            }
        }

        System.out.println("Draw!");
        scanner.close();
    }


    @Override
    public void playGame(){
        startGame();
        while (!isGameOver()){
            printBoard();
            takeTurn();
        }
        printBoard();
        endGame();
    }
    
    public static void main(String[] args){
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
