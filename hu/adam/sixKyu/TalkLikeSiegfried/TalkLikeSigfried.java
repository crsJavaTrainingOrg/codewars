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

        if (week >= 3) {
            translatedSentence = week3(translatedSentence);
        }

        return translatedSentence;
    }

    private static String week1(String sentence) {
        return week1Rule3(week1Rule2(week1Rule1(sentence)));
    }

    private static String week2(String sentence) {
        return sentence.replaceAll("p(?i)h", "f")
                .replaceAll("P(?i)h", "F");
    }

    private static String week3(String sentence) {
        return week3Rule2(week3Rule1(sentence));
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

    private static String week3Rule1(String sentence) {
        return sentence.replaceAll("(\\w{3,})(e)(?!\\w)", "$1");
    }

    private static String week3Rule2(String sentence) {
        return sentence.replaceAll("(\\w)\\1", "$1");
    }
}

