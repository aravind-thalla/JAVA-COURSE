public class mazeRestrictions {
  public static void main(String[] args) {
    boolean[][] boart = {
      {true,true,true},
      {true,false,true},
      {true,true,true}
    };
    mazeRestrict("", boart, 0, 0);
  }
  static void mazeRestrict(String p,boolean[][] maze,int r,int c){
    if(r == maze.length-1 && c == maze[0].length-1){
      System.out.println(p);
      return;
    }
    if(!maze[r][c]){
      return;
    }

    if(r<maze.length-1){
      mazeRestrict(p+'D', maze, r+1, c);
    }
    if(c<maze[0].length-1){
      mazeRestrict(p+'R', maze, r, c+1);
    }
  }
}
