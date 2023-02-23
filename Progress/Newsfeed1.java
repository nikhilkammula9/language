import java.util.Arrays;

public class Newsfeed1 {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed1(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public int getNumTopics(){
    return topics.length;
  }
  
  public static void main(String[] args){
    Newsfeed1 sampleFeed = new Newsfeed1();
    
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
   
  }
}
