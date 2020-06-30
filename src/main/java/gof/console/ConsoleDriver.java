package gof.console;

import gof.core.Board;
import gof.core.Cell;
import gof.core.DisplayDriver;

public class ConsoleDriver implements DisplayDriver {
    public void displayBoard(Board board) {
        Cell[][] grid = board.getGrid();
        
        String border = String.format("+%0" + 2*grid.length + "d+", 0).replace("0","-");
        /*
        String border="+";
        for(int i=0;i<2*grid.length;i++)
        	border+='-';
        border+='+';
        */
        System.out.println(border);  
        for (Cell[] row : grid) {
            String r = "|";
            for (Cell c : row) {
                r += c.getState() ? "* " : "  ";
            }
            r += "|";
            System.out.println(r);
        }
        
        System.out.println(border);
    }
}
