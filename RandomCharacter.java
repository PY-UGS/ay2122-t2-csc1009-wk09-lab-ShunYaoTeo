import java.util.Arrays;
import java.util.Random;

public class RandomCharacter  {
    public char getRandomLowerCaseLetter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        return c;
    }

    public char getRandomUpperCaseLetter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
        return c;
    }

    public int getRandomDigitCharacter(){
        Random r = new Random();
        int i = r.nextInt(10);
        return i;
    }

    public char getRandomCharacter() {
        Random r = new Random();
        char x1 = this.getRandomUpperCaseLetter();
        char x2 = this.getRandomLowerCaseLetter();
        String set = String.format("%s%s",x1,x2);
        char c = set.charAt(r.nextInt(2));
        return c;
    }

    public static void main(String[] args) {
        RandomCharacter c = new RandomCharacter();
        char[] a = new char[15];
        char[] b = new char[15];
        int[] num = new int[15];
        char[] d = new char[15];
        for(int x=0;x<15;x++){
            a[x] = c.getRandomCharacter();
        }
        System.out.println(Arrays.toString(a));
        for(int x=0;x<15;x++){
            num[x] = c.getRandomDigitCharacter();
        }
        System.out.println(Arrays.toString(num));
        for(int x=0;x<15;x++){
            b[x] = c.getRandomUpperCaseLetter();
        }
        System.out.println(Arrays.toString(b));
        for(int x=0;x<15;x++){
            d[x] = c.getRandomLowerCaseLetter();
        }
        System.out.println(Arrays.toString(d));
    }
}


