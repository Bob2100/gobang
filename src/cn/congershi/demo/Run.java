package cn.congershi.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args) {
        Gobang gobang = Gobang.getInstance();
        gobang.initBoard();
        gobang.printBoard();
        System.out.println("---请落子，以x,y的格式输入坐标---");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while (true) {
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    String[] split = line.split(",");
                    int xPos = Integer.parseInt(split[1]);
                    int yPos = Integer.parseInt(split[0]);

                    if(xPos < 1 || xPos >= gobang.getBoardSize() || yPos < 1 || yPos >= gobang.getBoardSize()) {
                        System.out.println("坐标必须在1~19范围");
                        return;
                    }

                    gobang.setStar(xPos, yPos);
                    gobang.printBoard();
                }
            } catch (Exception e) {
                System.out.println("输入格式不合法，请重新输入！！！");
            }
        }


    }
}
