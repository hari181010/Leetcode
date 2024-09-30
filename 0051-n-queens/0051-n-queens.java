class Solution {

    public boolean issafe(int row,int col,char[][]board){
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        for(int i=0;i<board[0].length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        int r=row;
        for(int c=col;c>=0&& r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false;

            }

        }
        r=row;
        for(int c=col;c>=0 && r<board.length;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        for(int c=col;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;





    }
    public void sboard(char[][] board,List<List<String>> allb){
          String row="";
          List<String> newboard=new ArrayList<>();
          for(int i=0;i<board.length;i++ ){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                row+='Q';
                else
                row+='.';

            }
            newboard.add(row);


          }
        allb.add(newboard);


    }


    public void help(char[][] board,List<List<String>> allb,int col ){
     if(col==board.length){
        sboard(board,allb);
        return;

     }
     
     for(int row=0;row<board.length;row++){
        if(issafe(row,col,board)){
            board[row][col]='Q';
            help(board,allb,col+1);
            board[row][col]='.';
        }
     }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allb=new ArrayList<>();
        char[][] board =new char[n][n];
        help(board,allb,0);
        return allb;

        
    }
}