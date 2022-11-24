package org.jeecgframework.DeleteSameStr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StageTwo {

	public void ReplacedStr(String Str) {
		String regex = "([a-z])\\1{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Str);
		if (matcher.find()) {
		   Str = Str.replaceAll(Str.substring(matcher.start(),matcher.end()),"");
		   //此处应该对字符串下标进行判断，以及对重复字符串两边字符判断是否相等，懒得写！！！！！！
		   System.out.println(Str +", "+ Str.substring(matcher.start()-1,matcher.end()-1)+" is replaced by b "+Str.charAt(matcher.end()-1));
		   ReplacedStr(Str);
		}
		
	}
	
	@org.junit.Test
	public void test() {
		String Str = "aabcccbbad";
		ReplacedStr(Str);
	}
}
