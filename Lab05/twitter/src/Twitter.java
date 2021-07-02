public class Twitter {

  public String loadTweet()
  {
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {}

    double r =  Math.random();
    if (r <= 0.45) {
      return "I am tweet that likes to talk about @me";
    } else if (r <= 0.9) {
      return "Hello to @you";
    } else {
      return null;
    }
  }

  public boolean isMentionned(String name) {
	    String tweet = loadTweet();
	    if (tweet==null){
	      return false;
	    }
	    int k = tweet.indexOf("@");
	    int j = tweet.indexOf(" ",k);//count the length starting from "@"
	    if (j==-1){//null
	      tweet = tweet.substring(k); //"@"
	    }else{
	      tweet = tweet.substring(k,j);// "@XXXXX"
	    }
	    return tweet.equals("@" + name); 
	  }

}