public class wordsearch {
    public boolean dfs(char[][] board,int i,int j,String word, int pos){
        if(i<0 || j<0 || i>board.length-1 || j>board[i].length-1){
            return false;
        }
        if(board[i][j]==word.charAt(pos)){
            char t=board[i][j];
            board[i][j]='#';
            if(pos==word.length()-1){
                return true;
            }
            else if(dfs(board,i+1,j,word,pos+1) || dfs(board,i-1,j,word,pos+1) || dfs(board,i,j+1,word,pos+1) || dfs(board,i,j-1,word,pos+1) ){
                return true;
            }
            board[i][j]=t;
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && dfs(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
}
