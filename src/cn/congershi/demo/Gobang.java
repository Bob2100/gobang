package cn.congershi.demo;

public class Gobang {

    private Gobang() {
    }

    private static Gobang gobang;

    public static Gobang getInstance() {
        if (gobang == null) {
            gobang = new Gobang();
        }
        return gobang;
    }


    //定义棋盘大小
    private int boardSize = 19;

    //用于记录棋子的黑白
    private boolean flag = true;

    //二位数组作为棋盘
    private String[][] board = new String[boardSize][boardSize];

    public void initBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = "┼";
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }

    //走棋
    public void setStar(int x, int y) {
        if(!board[x][y].equals("┼")) {
            System.out.println("该位置已经落子，请重下!!!");
            return;
        }

        if(flag) {
            System.out.println("---请黑方落子---");
            board[x][y] = "●";
            flag = false;
        }else{
            System.out.println("---请白方落子---");
            board[x][y] = "○";
            flag = true;
        }

    }



}
