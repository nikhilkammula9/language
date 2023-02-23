import java.util.ArrayList;

public class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> MyPlayList = new ArrayList<String>();
    MyPlayList.add("A");
    MyPlayList.add("B");
    MyPlayList.add("Z");
    MyPlayList.add("C");
    MyPlayList.add("D");
    MyPlayList.add("E");
    System.out.println(MyPlayList);
    System.out.println(MyPlayList.size());
    System.out.println(MyPlayList.remove(1));
    System.out.println(MyPlayList.size());
     System.out.println(MyPlayList);
      System.out.println(MyPlayList.indexOf("D"));
      System.out.println(MyPlayList.indexOf("E"));
      System.out.println(MyPlayList.set(3,"D"));
      System.out.println(MyPlayList.set(4,"E"));
      
  }
  
}
