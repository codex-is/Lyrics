import java.util.Arrays;
import java.util.List;
public class PrintLyrics {
    public static void main(String[] args) {
        List<String[]> Lyrics = Arrays.asList(
                new String[]{"Your morning eyes, I could stare like watching stars", "2000", "90"},
                new String[]{"I could walk you by, and I'll tell you without a thought", "2000", "70"},
                new String[]{"You'd be mine, would you mind if I took your hand tonight?", "3000", "60"},
                new String[]{"Know you are all that I want this life", "3000", "80"},
                new String[]{"I'll imagine we fell in love", "2000", "70"},
                new String[]{"I'll nap under moonlight skies with you", "1000", "60"},
                new String[]{"I think I'll picture us, you with the waves", "800", "70"},
                new String[]{"The ocean's colors on your face", "800", "80"},
                new String[]{"I'll leave my heart with your air", "1000", "70"},
                new String[]{"So let me fly with you", "1500", "80"},
                new String[]{"Will you be forever with me?", "2000", "60"}
        );
        for(String[] lyricLine: Lyrics){
            String lyricText = lyricLine[0];
            int lineDelay = Integer.parseInt(lyricLine[1]);
            int charDelay = Integer.parseInt(lyricLine[2]);

        for(char c: lyricText.toCharArray()) {
            System.out.print(c);
            try{
                Thread.sleep(charDelay);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
            System.out.println();
        try{
            Thread.sleep(lineDelay);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}