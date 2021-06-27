
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {
    public static void f(int n) {
        for (int i = n; i > 0; i--) {
            g(i);
        }
    }

    public static void g(int n) {
        for (int i = 0; i < n; i++)
            h(i);
    }

    public static void h(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("?");
        System.out.println();

    }

    public static void main(String[] args) {
        // {
        // RGBImage image1 = new RGBImage(12,22);
        // RGBColor[][] rgbArray1 = new RGBColor[10][10];
        // for(int i=0; i<rgbArray1.length;i++)
        // for(int j=0; j<rgbArray1[0].length;j++)
        // rgbArray1[i][j] = new RGBColor(j,i,j);
        // RGBImage rgbImg1 = new RGBImage(rgbArray1);
        // System.out.println(rgbImg1);

        // RGBImage imageCopy = new RGBImage(rgbImg1);
        // System.out.println(rgbImg1.equals(imageCopy));
        // System.out.println(rgbImg1.equals(image1));

        // double[][] grayscaleArray = rgbImg1.toGrayscaleArray();
        // for(int i=0;i<grayscaleArray.length;i++){
        // for(int j=0;j<grayscaleArray[0].length;j++)
        // System.out.print(grayscaleArray[i][j]+" ");
        // System.out.println();
        // }
        // String a = "abc";
        // String b = a;
        // System.out.println(a + b);
        // a = "a";
        // System.out.println(a + b);
        // String b = "ab";
        // String a = "";

        // System.out.println(10%10);
        // System.out.print("a");
        // System.out.println();
        // System.out.print("a");
        // System.out.println();
        Tester.f(5);
        System.out.print("A");

    }
}
