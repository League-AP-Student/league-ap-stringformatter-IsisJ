import java.util.List;

public class StringFormatter{

	public static int totalLetters(List<String> wordList) {
		int totalLetters = 0;
		
		for(String word : wordList) {
			totalLetters = totalLetters + word.length()-1;
		}
		return totalLetters;
	}
	public static int basicGapWidth(List<String> wordList, int formattedLen) {
		return formattedLen-totalLetters(wordList);
	}
	public static int leftOverSpaces(List<String> wordList, int formattedLen) {
		return -1;
	}
	public static String format(List<String> wordList, int formattedLen) {
		String formattedString = wordList.get(0);
		int basicGapWidth = basicGapWidth(wordList, formattedLen);
		
		for(int i=1; i<wordList.size(); i++) {
			//use basicGapWidth when building basic string
			formattedString = formattedString + basicGapWidth + wordList.get(i);
		}
		if(leftOverSpaces(wordList,formattedLen) > 0) {
			//for as many extra spaces
			for(int extraSpaces = leftOverSpaces(wordList, formattedLen); extraSpaces>0; extraSpaces--){
				//insert one extra space for each gap
			}
		}
		return formattedString;
	}
}