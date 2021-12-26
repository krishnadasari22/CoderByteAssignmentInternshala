package com.programs;
import java.util.*; 

public class DemoString {

  public static String StringChallenge(String sen) {
    int n=sen.length();
    int i=0;
    int currlen=0;
    int maxlen=0;
    int st=-1;
    while(i<n){
      if(sen.charAt(i)==' '){
        if(currlen%2==0){
          if(maxlen<currlen){
            maxlen=currlen;
            st=i-currlen;
          }
        }
        currlen=0;
      }
      else
    {
      currlen++;
    }
    i++;
    } 
    if(currlen%2==0){
      if(maxlen<currlen){
        maxlen=currlen;
        st=i-currlen;
      }
    }
    if(st==-1)
    return "-1";
    return sen.substring(st,st+maxlen);
  }

  public static void main (String[] args) {  
       
    Scanner s = new Scanner(System.in);
    String sen="I love Dogs";
    System.out.print(StringChallenge(s.nextLine())); 
  }

}