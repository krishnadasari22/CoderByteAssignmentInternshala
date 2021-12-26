package com.programs;
public class CoderByteStringChallengeQuestion {

	  public static String StringChallenge(String str) {
	String encoding=" ";
	if(str==null){
	  return encoding;
	}
	int count;
	for(int i=0;i<str.length();i++){
	  count=1;
	  while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1))
	  {
	    count++;
	    i++;
	  }
	  encoding +=String.valueOf(count)+str.charAt(i);
	}
	return encoding;
	  }
	  public static void main(String[] args){
	    String str="aabbcde";
	    System.out.print(StringChallenge(str));
	  }
	  }