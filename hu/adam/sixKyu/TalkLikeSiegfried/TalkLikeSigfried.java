package adam.sixKyu.TalkLikeSiegfried;

//https://www.codewars.com/kata/would-you-believe-dot-dot-dot-talk-like-siegfried
public class TalkLikeSigfried {
    public static String siegfried(final int week, final String str) {

        String translatedSentence = "";
        if (week >= 1) {
            translatedSentence = week1(str);
        }

        if (week >= 2) {
            translatedSentence = week2(translatedSentence);
        }

        return translatedSentence;

        /*String[] words = str.split(" ");

        String result = str;

            if (week >= 1) {
                result = result.replaceAll("ci","si");
                result = result.replaceAll("ce","se");
                result = result.replaceAll("c(?!h)","k");

            }
            if(week >= 2){
                result = result.replaceAll("ph","f");

            }
            if(week >=3){
                result = result.replaceAll("e+(?<=\\w{4})\b", "");
                for(int k = 0; k < words.length; k++){
                    words[k] = words[k].replaceAll("(.)//1","$1");
                }
            }
            if(week >= 4){
                result = result.replaceAll("th","z");
                result = result.replaceAll("wr","v");
                result = result.replaceAll("w","v");
            }
            if(week >= 5){
                result = result.replaceAll("ou","u");
                result = result.replaceAll("an","un");
                result = result.replaceAll("ing*$","ink");
                result = result.replaceAll("^sm*","schm");


        }
        return result;*/
    }

    private static String week1(String sentence) {
        return week1Rule3(week1Rule2(week1Rule1(sentence)));
    }

    private static String week2(String sentence) {
        return sentence.replaceAll("p(?i)h", "f")
                .replaceAll("P(?i)h", "F");
    }

    private static String week1Rule1(String sentence) {
        return sentence.replaceAll("CI", "SI")
                .replaceAll("Ci", "Si")
                .replaceAll("cI", "sI")
                .replaceAll("ci", "si");
    }

    private static String week1Rule2(String sentence) {
        return sentence.replaceAll("CE", "SE")
                .replaceAll("Ce", "Se")
                .replaceAll("cE", "sE")
                .replaceAll("ce", "se");
    }

    private static String week1Rule3(String sentence) {
        return sentence.replaceAll("c(?!h)", "k")
                .replaceAll("C(?!h)", "K");
    }
}

