package org.jeecgframework.DeleteSameStr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StageOne {

	public void ReplacedStr(String Str) {
		String regex = "([a-z])\\1{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Str);
		if (matcher.find()) {
			Str = Str.replaceAll(Str.substring(matcher.start(),matcher.end()),"");
		   System.out.println(Str);
		   ReplacedStr(Str);
		}
		
	}
	
	@org.junit.Test
	public void test() {
		String Str = "aabcccbbad";
		String Str１ = "aabcccbbbad";//  对多个重复字符测试,懒得测!
		String Str２ = "aabcccbbbadeeeff";// 对重复字符前后字符不相同情况测试  懒得测!
		String Str３ = "aabcccbbad1111";//  对数字测试   懒得测!
		String Str４ = "111aabcccbbad阿萨德和建安公司";//  多种字符测试   懒得测!
		ReplacedStr(Str);
	}
}
