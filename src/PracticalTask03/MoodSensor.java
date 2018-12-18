package PracticalTask03;

public class MoodSensor {
    public static String calculateKaomoji(int number) {
        String result = "";

        switch (number) {
            case 0:
                result = "(*^.^*)";
            case 1:
                result = "(－.－)...zzz";
            case 2:
                result = "(눈_눈)";
            case 3:
                result = "٩(ఠ益ఠ)۶";
            case 4:
                result = "(づ ◕‿◕ )づ";
            case 5:
                result = "(´• ω •`)ﾉ";
            case 6:
                result = "(⊙_⊙)";
            case 7:
                result = "(↼_↼)";
            case 8:
                result = "ლ(ಠ_ಠ ლ)";
            case 9:
                result = "٩(◕‿◕｡)۶";
            case 10:
                result = "(❤ω❤)";
        }

        return result;
    }
}
