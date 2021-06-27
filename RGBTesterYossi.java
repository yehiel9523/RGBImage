
/**
 * Tester for mmn16
 * 
 * This tester does not claim to cover all possible errors, but he definitely try to do so. 
 *
 * @author (Yossi Berkowitz)
 * @version (06.02.2021)
 */
import java.util.Scanner;
public class RGBTesterYossi
{
    public static void main(String[] args) {
        
        
        
        
        Scanner scan = new Scanner (System.in);

        RGBColor[][] rgbArray = new RGBColor[6][4];
        for (int i=0; i<rgbArray.length;i++)
            for (int j=0; j<rgbArray[0].length;j++)    
                rgbArray[i][j] = new RGBColor(i,i,i);

        RGBColor[][] rgbArray0 = new RGBColor[6][4];
        for (int i=0; i<rgbArray0.length;i++)
            for (int j=0; j<rgbArray0[0].length;j++)    
                rgbArray0[i][j] = new RGBColor(5-i,5-i,5-i);

        RGBColor[][] rgbArray1 = new RGBColor[3][4];
        for (int i=0; i<rgbArray1.length;i++)
            for (int j=0; j<rgbArray1[0].length;j++)    
                rgbArray1[i][j] = new RGBColor(i,i,i);

        RGBColor[][] rgbArray2 = new RGBColor[3][4];
        for (int i=0; i<rgbArray2.length;i++)
            for (int j=0; j<rgbArray2[0].length;j++)    
                rgbArray2[i][j] = new RGBColor(2-i,2-i,2-i);

        RGBColor[][] rgbArray3 = new RGBColor[4][3];
        for (int i=0; i<rgbArray3[0].length;i++)
            for (int j=0; j<rgbArray3.length;j++)    
                rgbArray3[j][i] = new RGBColor(i,i,i);

        RGBColor[][] rgbArray4 = new RGBColor[4][3];
        for (int i=0; i<rgbArray4[0].length;i++)
            for (int j=0; j<rgbArray4.length;j++)    
                rgbArray4[j][i] = new RGBColor(2-i,2-i,2-i);                          

        RGBColor[][] rgbArray5 = new RGBColor[4][6];
        for (int i=0; i<rgbArray5[0].length;i++)
            for (int j=0; j<rgbArray5.length;j++)    
                rgbArray5[j][i] = new RGBColor(i,i,i);

        RGBColor[][] rgbArray6 = new RGBColor[4][6];
        for (int i=0; i<rgbArray6[0].length;i++)
            for (int j=0; j<rgbArray6.length;j++)    
                rgbArray6[j][i] = new RGBColor(5-i,5-i,5-i);

        RGBColor[][] rgbArray7 = {{ new RGBColor(0,0,0)},
                { new RGBColor(1,1,1)},
                { new RGBColor(2,2,2)},
                { new RGBColor(3,3,3)}};

        RGBColor[][] rgbArray10 = {{ new RGBColor(3,3,3)},
                { new RGBColor(2,2,2)},
                { new RGBColor(1,1,1)},
                { new RGBColor(0,0,0)}};

        RGBColor[][] rgbArray8 = {{ new RGBColor(0,0,0),new RGBColor(1,1,1),new RGBColor(2,2,2),new RGBColor(3,3,3)}};

        RGBColor[][] rgbArray9 = {{ new RGBColor(3,3,3),new RGBColor(2,2,2),new RGBColor(1,1,1),new RGBColor(0,0,0)}};

        RGBColor[][] rgbArray11 = new RGBColor[6][4];
        for (int i=0; i<rgbArray11.length;i++)
            for (int j=0; j<rgbArray11[0].length;j++)    
                rgbArray11[i][j] = new RGBColor(i,i,i);
        for (int i=0; i<rgbArray11.length;i++)
            for (int j=0; j<rgbArray11[0].length;j++)    
                rgbArray11[i][j].invert();

        RGBColor[][] rgbArray12 = {{ new RGBColor(2,2,2),new RGBColor(3,3,3),new RGBColor(4,4,4),new RGBColor(5,5,5),new RGBColor(0,0,0),new RGBColor(0,0,0)},
                                   { new RGBColor(2,2,2),new RGBColor(3,3,3),new RGBColor(4,4,4),new RGBColor(5,5,5),new RGBColor(0,0,0),new RGBColor(0,0,0)},
                                   { new RGBColor(2,2,2),new RGBColor(3,3,3),new RGBColor(4,4,4),new RGBColor(5,5,5),new RGBColor(0,0,0),new RGBColor(0,0,0)},
                                   { new RGBColor(2,2,2),new RGBColor(3,3,3),new RGBColor(4,4,4),new RGBColor(5,5,5),new RGBColor(0,0,0),new RGBColor(0,0,0)},};

        RGBColor[][] rgbArray13 = {{ new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(1,1,1),new RGBColor(2,2,2),new RGBColor(3,3,3)},
                                   { new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(1,1,1),new RGBColor(2,2,2),new RGBColor(3,3,3)},
                                   { new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(1,1,1),new RGBColor(2,2,2),new RGBColor(3,3,3)},
                                   { new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(1,1,1),new RGBColor(2,2,2),new RGBColor(3,3,3)}};

        RGBColor[][] rgbArray16 = {{ new RGBColor(2,2,2),new RGBColor(2,2,2),new RGBColor(2,2,2),new RGBColor(2,2,2)},
                { new RGBColor(3,3,3),new RGBColor(3,3,3),new RGBColor(3,3,3),new RGBColor(3,3,3)},
                { new RGBColor(4,4,4),new RGBColor(4,4,4),new RGBColor(4,4,4),new RGBColor(4,4,4)},
                { new RGBColor(5,5,5),new RGBColor(5,5,5),new RGBColor(5,5,5),new RGBColor(5,5,5)},
                { new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0)},
                { new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0)}};

        RGBColor[][] rgbArray17 = {{ new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0)},
                { new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0)},
                { new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0),new RGBColor(0,0,0)},
                { new RGBColor(1,1,1),new RGBColor(1,1,1),new RGBColor(1,1,1),new RGBColor(1,1,1)},
                { new RGBColor(2,2,2),new RGBColor(2,2,2),new RGBColor(2,2,2),new RGBColor(2,2,2)},
                { new RGBColor(3,3,3),new RGBColor(3,3,3),new RGBColor(3,3,3),new RGBColor(3,3,3)}};
                                   
            
            
        RGBImage rgbImg = new RGBImage(rgbArray);    
        RGBImage rgbImg0 = new RGBImage(rgbArray0);
        RGBImage rgbImg2 = new RGBImage(rgbArray2);
        RGBImage rgbImg3 = new RGBImage(rgbArray3);
        RGBImage rgbImg4 = new RGBImage(rgbArray4);
        RGBImage rgbImg5 = new RGBImage(rgbArray5);
        RGBImage rgbImg6 = new RGBImage(rgbArray6);
        RGBImage rgbImg7 = new RGBImage(rgbArray7);
        RGBImage rgbImg8 = new RGBImage(rgbArray8);
        RGBImage rgbImg9 = new RGBImage(rgbArray9);
        RGBImage rgbImg10 = new RGBImage(rgbArray10);
        RGBImage rgbImg11 = new RGBImage(rgbArray11);
        RGBImage rgbImg12 = new RGBImage(rgbArray12);
        RGBImage rgbImg13 = new RGBImage(rgbArray13);
        RGBImage rgbImg14 = new RGBImage(4,6);
        RGBImage rgbImg15 = new RGBImage(rgbArray5);
        RGBImage rgbImg16 = new RGBImage(rgbArray16);
        RGBImage rgbImg17 = new RGBImage(rgbArray17);
        RGBImage rgbImg18 = new RGBImage(6,4);
        RGBImage rgbImg19 = new RGBImage(rgbArray);

        RGBColor pixel1= new RGBColor(0,0,0);
        RGBColor pixel2= new RGBColor(1,1,1);
        RGBColor pixel3= new RGBColor(2,2,2);
        
        System.out.println("\uD83E\uDD26"+"\uD83E\uDD26"+" Welcome to the best tester for the worst mmn (16) (Version 4) "+"\uD83E\uDD26"+"\uD83E\uDD26"+"\n");
        
        System.out.println("Testing the Constructors and the Getrs methods"+"\n");
        boolean okOrEror= true;

        System.out.println("Test 1 - **Black Image Constructor** , and **getPixel** method");
        RGBImage rgbImgBlack = new RGBImage(3,4);
        RGBColor pixel0= new RGBColor();
        if (pixel0.equals(rgbImgBlack.getPixel(0,0)) && pixel0.equals(rgbImgBlack.getPixel(2,3)) && pixel0.equals(rgbImgBlack.getPixel(1,2)))
            System.out.println ("\uD83C\uDFC6"+"OK. the black Image Constructor and the getPixel method is Work properly."+"\n"
                +"The created object: "+"\n"+rgbImgBlack+"\n");
        else{
            System.out.println ("\uD83D\uDC4C"+"EROR. the black Image Constructor or the getPixel method is not ok."+"\n"
                +"The created object: "+"\n"+rgbImgBlack+"\n");
            okOrEror= false;
        }

        
        System.out.println("Test 2 - **Constructor with RGBColor[][] Array Parameter** , and **getPixel** method");                        
        RGBImage rgbImg1 = new RGBImage(rgbArray1);
        if (pixel1.equals(rgbImg1.getPixel(0,3)) && pixel2.equals(rgbImg1.getPixel(1,2)) && pixel3.equals(rgbImg1.getPixel(2,0)))
            System.out.println ("\uD83C\uDFC6"+"OK. the Constructor with RGBColor[][] and the getPixel method is Work properly."+"\n"
                +"The created object: "+"\n"+rgbImg1);
        else{
            System.out.println ("\uD83C\uDFF4"+"EROR. the Constructor with RGBColor[][] or the getPixel method is not ok."+"\n"
                +"The created object: "+"\n"+rgbImg1);
            okOrEror= false;
        }
        System.out.println("Test 2 - **aliasing test** for Constructor with RGBColor[][] Array Parameter");
        rgbArray1[0][1].setRed(25);
        if (!rgbImg1.getPixel(0,1).equals(rgbArray1[0][1]))
            System.out.println("\uD83C\uDFC6"+"OK. Constructor with RGBColor[][] Without aliasing"+"\n");
        else
            System.out.println("\uD83C\uDFF4"+"2 - EROR. You have aliasing in Constructor with RGBColor[][]"+"\n");
        rgbArray1[0][1].setRed(0);

        
        System.out.println("Test 3 - **Copy Constructor** , and **getPixel** method");
        RGBImage rgbImgCopy = new RGBImage(rgbImg1);
        if (pixel1.equals(rgbImgCopy.getPixel(0,3)) && pixel2.equals(rgbImgCopy.getPixel(1,2)) && pixel3.equals(rgbImgCopy.getPixel(2,0)))
            System.out.println ("\uD83C\uDFC6"+"OK. the Copy Constructor and the getPixel method is Work properly."+"\n"
                +"The created object: "+"\n"+rgbImgCopy);
        else{
            System.out.println ("\uD83C\uDFF4"+"EROR. the Copy Constructor or the getPixel method is not ok."+"\n"
                +"The created object: "+"\n"+rgbImgCopy);
            okOrEror= false;
        }
        System.out.println("Test 3 - **aliasing test** for Copy Constructor");
        rgbImg1.setPixel(0,0,pixel3);
        if (!rgbImg1.getPixel(0,0).equals(rgbImgCopy.getPixel(0,0)))
            System.out.println("\uD83C\uDFC6"+"OK. Copy Constructor Without aliasing"+"\n");
        else
            System.out.println("\uD83C\uDFF4"+"2 - EROR. You have aliasing in Copy Constructor"+"\n");
        rgbImg1.setPixel(0,0,pixel1);

        
        if (okOrEror){
        
            
            System.out.println("Test 4 - **getHeight** , and **getWidth** methods");
            if (rgbImg1.getHeight()==3 && rgbImg1.getWidth()==4)
                System.out.println ("\uD83C\uDFC6"+"OK. **getHeight** expecting: \"3\". accept: \""+rgbImg1.getHeight()+"\"."+"\n"+
                    "**getWidth** expecting: \"4\". accept: \""+rgbImg1.getWidth()+"\""+"\n");
            else
                System.out.println ("\uD83C\uDFF4"+"EROR. **getHeight** expecting: \"3\". accept: \""+rgbImg1.getHeight()+"\"."+"\n"+
                    "**getWidth** expecting: \"4\". accept: \"getWidth()"+rgbImg1.getWidth()+"\""+"\n");

            
            
            System.out.println("Test 5 - **equals** method");
            if (rgbImg1.equals(rgbImgCopy) && !rgbImgCopy.equals(rgbImgBlack) && !rgbImg13.equals(rgbImg12) && !rgbImg7.equals(rgbImg19)){
                System.out.println ("\uD83C\uDFC6"+"OK. the equals method is Work properly"+"\n");

            
            
                System.out.println("Test 6 - **getPixel** and **setPixel** methods");
                rgbImg1.setPixel(1,0,rgbImgBlack.getPixel(0,0));
                rgbArray1[1][0]= new RGBColor();
                RGBImage rgbImgForTest = new RGBImage (rgbArray1);
                if (rgbImgForTest.equals(rgbImg1))
                    System.out.println("\uD83C\uDFC6"+"1 - OK. getPixel and setPixel methods is Work properly");
                else
                    System.out.println("\uD83C\uDFF4"+"1 - EROR. getPixel or setPixel method is not ok");
                rgbArray1[1][0]= new RGBColor(1,1,1);    
                rgbImg1 = new RGBImage(rgbArray1);
                if (rgbImg1.getPixel(0,4).equals(pixel1) && rgbImg1.getPixel(3,0).equals(pixel1) && rgbImg1.getPixel(2,-1).equals(pixel1))
                    System.out.println("\uD83C\uDFC6"+"2 - OK. getPixel Returns a black pixel when the get requests is out of range");
                else
                    System.out.println("\uD83C\uDFF4"+"2 - EROR. getPixel is not Returns black pixel when the get requests is out of range");
                pixel1= rgbImg1.getPixel(0,0);
                pixel2= new RGBColor (0,0,0);
                rgbImg1.setPixel(0,1,pixel2);
                pixel1.setRed(25);
                pixel2.setRed(25);
                if (!pixel1.equals(rgbImg1.getPixel(0,0)) && !pixel2.equals(rgbImg1.getPixel(0,1)))
                    System.out.println("\uD83C\uDFC6"+"3 - OK. getPixel and setPixel Without aliasing"+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"3 - EROR. You have aliasing in getPixel or setPixel method"+"\n");
                rgbImg1 = new RGBImage(rgbArray1);

            
            
            
                System.out.println("Test 7 - **flipHorizontal** method");
                System.out.println("1- the image before flipHorizontal:"+"\n"+rgbImg3);
                rgbImg3.flipHorizontal();
                if (rgbImg3.equals(rgbImg4))
                    System.out.println("\uD83C\uDFC6"+"1- OK. flipHorizontal method is Work properly."+"\n"+
                        "the image after flipHorizontal:"+"\n"+rgbImg3);
                else
                    System.out.println("\uD83C\uDFF4"+"1 - EROR. flipHorizontal method is not ok."+"\n"+
                        "the image after flipHorizontal:"+"\n"+rgbImg3);
                rgbImg3 = new RGBImage(rgbArray3);
                System.out.println("2- the image before flipHorizontal:"+"\n"+rgbImg5);
                rgbImg5.flipHorizontal();
                if (rgbImg5.equals(rgbImg6))
                    System.out.println("\uD83C\uDFC6"+"2- OK. flipHorizontal method is Work properly."+"\n"+
                        "the image after flipHorizontal:"+"\n"+rgbImg5);
                else
                    System.out.println("\uD83C\uDFF4"+"2 - EROR. flipHorizontal method is not ok."+"\n"+
                        "the image after flipHorizontal:"+"\n"+rgbImg5);
                rgbImg5 = new RGBImage(rgbArray5);
                System.out.println("3- the image before flipHorizontal:"+"\n"+rgbImg8);
                rgbImg8.flipHorizontal();
                if (rgbImg8.equals(rgbImg9))
                    System.out.println("\uD83C\uDFC6"+"3- OK. flipHorizontal method is Work properly."+"\n"+
                        "the image after flipHorizontal:"+"\n"+rgbImg8+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"3 - EROR. flipHorizontal method is not ok."+"\n"+
                        "the image after flipHorizontal:"+"\n"+rgbImg8+"\n");
                rgbImg8 = new RGBImage(rgbArray8);

            
            
                System.out.println("Test 8 - **flipVertical** method");
                rgbImg1 = new RGBImage(rgbArray1);
                System.out.println("1- the image before flipVertical:"+"\n"+rgbImg1);
                rgbImg1.flipVertical();
                if (rgbImg1.equals(rgbImg2))
                    System.out.println("\uD83C\uDFC6"+"1- OK. flipVertical method is Work properly."+"\n"+
                        "the image after flipVertical:"+"\n"+rgbImg1);
                else
                    System.out.println("\uD83C\uDFF4"+"1 - EROR. flipVertical method is not ok."+"\n"+
                        "the image after flipVertical:"+"\n"+rgbImg1);
                rgbImg1 = new RGBImage(rgbArray1);
                System.out.println("2- the image before flipVertical:"+"\n"+rgbImg);
                rgbImg.flipVertical();
                if (rgbImg.equals(rgbImg0))
                    System.out.println("\uD83C\uDFC6"+"2- OK. flipVertical method is Work properly."+"\n"+
                        "the image after flipVertical:"+"\n"+rgbImg);
                else
                    System.out.println("\uD83C\uDFF4"+"2 - EROR. flipVertical method is not ok."+"\n"+
                        "the image after flipVertical:"+"\n"+rgbImg);
                rgbImg = new RGBImage(rgbArray);
                System.out.println("3- the image before flipVertical:"+"\n"+rgbImg7);
                rgbImg7.flipVertical();
                if (rgbImg7.equals(rgbImg10))
                    System.out.println("\uD83C\uDFC6"+"3- OK. flipVertical method is Work properly."+"\n"+
                        "the image after flipVertical:"+"\n"+rgbImg7+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"3 - EROR. flipVertical method is not ok."+"\n"+
                        "the image after flipVertical:"+"\n"+rgbImg7+"\n");
                rgbImg7 = new RGBImage(rgbArray7);

            
            
                System.out.println("Test 9 - **invertColors** method");
                System.out.println("the image before invertColors:"+"\n"+rgbImg);
                rgbImg.invertColors();
                if (rgbImg.equals(rgbImg11))
                    System.out.println("\uD83C\uDFC6"+"OK. invertColors method is Work properly."+"\n"+
                        "the image after invertColors:"+"\n"+rgbImg+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"EROR. invertColors method is not ok."+"\n"+
                        "the image after invertColors:"+"\n"+rgbImg+"\n");
                rgbImg = new RGBImage(rgbArray);

            
            
                System.out.println("Test 10 - **rotateClockwise** method");
                System.out.println("the image before rotateClockwise:"+"\n"+rgbImg5);
                rgbImg5.rotateClockwise();
                if (rgbImg5.equals(rgbImg))
                    System.out.println("\uD83C\uDFC6"+"OK. rotateClockwise method is Work properly."+"\n"+
                        "the image after rotateClockwise:"+"\n"+rgbImg5+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"EROR. rotateClockwise method is not ok."+"\n"+
                        "the image after rotateClockwise:"+"\n"+rgbImg5+"\n");
                rgbImg5 = new RGBImage(rgbArray5);

            
            
                System.out.println("Test 11 - **rotateCounterClockwise** method");
                System.out.println("the image before rotateClockwise:"+"\n"+rgbImg5);
                rgbImg5.rotateCounterClockwise();
                if (rgbImg5.equals(rgbImg0))
                    System.out.println("\uD83C\uDFC6"+"OK. rotateCounterClockwise method is Work properly."+"\n"+
                        "the image after rotateCounterClockwise:"+"\n"+rgbImg5+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"EROR. rotateCounterClockwise method is not ok."+"\n"+
                        "the image after rotateCounterClockwise:"+"\n"+rgbImg5+"\n");
                rgbImg5 = new RGBImage(rgbArray5);

            
                System.out.println("Test 12 - **shiftCol** method");
                System.out.println("1- the image[0].length is *6*. the number entered is *-2*"+"\n"+
                    "the image before shiftCol:"+"\n"+rgbImg5);
                rgbImg5.shiftCol(-2);
                if (rgbImg5.equals(rgbImg12))
                    System.out.println("\uD83C\uDFC6"+"1- OK. shiftCol method is Work properly."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5);
                else
                    System.out.println("\uD83C\uDFF4"+"1- EROR. shiftCol method is not ok."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5);
                rgbImg5 = new RGBImage(rgbArray5);
                System.out.println("2- the image[0].length is *6*. the number entered is *2*"+"\n"+
                    "the image before shiftCol:"+"\n"+rgbImg5);
                rgbImg5.shiftCol(2);
                if (rgbImg5.equals(rgbImg13))
                    System.out.println("\uD83C\uDFC6"+"2- OK. shiftCol method is Work properly."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5);
                else
                    System.out.println("\uD83C\uDFF4"+"2- EROR. shiftCol method is not ok."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5);
                rgbImg5 = new RGBImage(rgbArray5);
                System.out.println("3- the image[0].length is *6*. the number entered is *6*"+"\n"+
                    "the image before shiftCol:"+"\n"+rgbImg5);
                rgbImg5.shiftCol(6);
                if (rgbImg5.equals(rgbImg14))
                    System.out.println("\uD83C\uDFC6"+"3- OK. shiftCol method is Work properly."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5);
                else
                    System.out.println("\uD83C\uDFF4"+"3- EROR. shiftCol method is not ok."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5);
                rgbImg5 = new RGBImage(rgbArray5);
                System.out.println("4- the image[0].length is *6*. the number entered is *-6*"+"\n"+
                    "the image before shiftCol:"+"\n"+rgbImg5);
                rgbImg5.shiftCol(-6);
                if (rgbImg5.equals(rgbImg14))
                    System.out.println("\uD83C\uDFC6"+"4- OK. shiftCol method is Work properly."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5);
                else
                    System.out.println("\uD83C\uDFF4"+"4- EROR. shiftCol method is not ok."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5);
                rgbImg5 = new RGBImage(rgbArray5);
                System.out.println("5- the image[0].length is *6*. the number entered is *8*"+"\n"+
                    "the image before shiftCol:"+"\n"+rgbImg5);
                rgbImg5.shiftCol(8);
                if (rgbImg5.equals(rgbImg15))
                    System.out.println("\uD83C\uDFC6"+"5- OK. shiftCol method is Work properly."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"5- EROR. shiftCol method is not ok."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5+"\n");
                rgbImg5 = new RGBImage(rgbArray5);
                System.out.println("6- the image[0].length is *6*. the number entered is *-8*"+"\n"+
                    "the image before shiftCol:"+"\n"+rgbImg5);
                rgbImg5.shiftCol(-8);
                if (rgbImg5.equals(rgbImg15))
                    System.out.println("\uD83C\uDFC6"+"6- OK. shiftCol method is Work properly."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"6- EROR. shiftCol method is not ok."+"\n"+
                        "the image after shiftCol:"+"\n"+rgbImg5+"\n");
                rgbImg5 = new RGBImage(rgbArray5);

            
            
                System.out.println("Test 13 - **shiftRow** method");
                System.out.println("1- the image.length is *6*. the number entered is *-2*"+"\n"+
                    "the image before shiftRow:"+"\n"+rgbImg);
                rgbImg.shiftRow(-2);
                if (rgbImg.equals(rgbImg16))
                    System.out.println("\uD83C\uDFC6"+"1- OK. shiftRow method is Work properly."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg);
                else
                    System.out.println("\uD83C\uDFF4"+"1- EROR. shiftRow method is not ok."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg);
                rgbImg = new RGBImage(rgbArray);
                System.out.println("2- the image.length is *6*. the number entered is *2*"+"\n"+
                    "the image before shiftRow:"+"\n"+rgbImg);
                rgbImg.shiftRow(2);
                if (rgbImg.equals(rgbImg17))
                    System.out.println("\uD83C\uDFC6"+"2- OK. shiftRow method is Work properly."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg);
                else
                    System.out.println("\uD83C\uDFF4"+"2- EROR. shiftRow method is not ok."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg);
                rgbImg = new RGBImage(rgbArray);
                System.out.println("3- the image.length is *6*. the number entered is *6*"+"\n"+
                    "the image before shiftRow:"+"\n"+rgbImg);
                rgbImg.shiftRow(6);
                if (rgbImg.equals(rgbImg18))
                    System.out.println("\uD83C\uDFC6"+"3- OK. shiftRow method is Work properly."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg);
                else
                    System.out.println("\uD83C\uDFF4"+"3- EROR. shiftRow method is not ok."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg);
                rgbImg = new RGBImage(rgbArray);
                System.out.println("4- the image.length is *6*. the number entered is *-6*"+"\n"+
                    "the image before shiftRow:"+"\n"+rgbImg);
                rgbImg.shiftRow(-6);
                if (rgbImg.equals(rgbImg18))
                    System.out.println("\uD83C\uDFC6"+"4- OK. shiftRow method is Work properly."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg);
                else
                    System.out.println("\uD83C\uDFF4"+"4- EROR. shiftRow method is not ok."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg);
                rgbImg = new RGBImage(rgbArray);
                System.out.println("5- the image.length is *6*. the number entered is *8*"+"\n"+
                    "the image before shiftRow:"+"\n"+rgbImg);
                rgbImg.shiftRow(8);
                if (rgbImg.equals(rgbImg19))
                    System.out.println("\uD83C\uDFC6"+"5- OK. shiftRow method is Work properly."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"5- EROR. shiftRow method is not ok."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg+"\n");
                rgbImg = new RGBImage(rgbArray);
                System.out.println("6- the image.length is *6*. the number entered is *-8*"+"\n"+
                    "the image before shiftRow:"+"\n"+rgbImg);
                rgbImg.shiftRow(-8);
                if (rgbImg.equals(rgbImg19))
                    System.out.println("\uD83C\uDFC6"+"6- OK. shiftRow method is Work properly."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"6- EROR. shiftRow method is not ok."+"\n"+
                        "the image after shiftRow:"+"\n"+rgbImg+"\n");
                rgbImg = new RGBImage(rgbArray);

            
                System.out.println("Test 14 - **toGrayscaleArray** method");
                double[][] grayscaleArray = new double[rgbArray5.length][rgbArray5[0].length];
                for (int i=0 ; i<rgbArray5.length ; i++){
                    for (int j=0 ; j<rgbArray5[0].length ; j++){
                        grayscaleArray[i][j] = rgbArray5[i][j].convertToGrayscale();
                    }
                }
                double[][] grayscaleArray1= rgbImg5.toGrayscaleArray();
                if (grayscaleArray1[2][0]==grayscaleArray[2][0] && grayscaleArray1[0][5]==grayscaleArray[0][5] && grayscaleArray1[1][2]==grayscaleArray[1][2]){
                    System.out.println("\uD83C\uDFC6"+"OK. toGrayscaleArray method is Work properly."+"\n"+
                        "the accept Array:");
                    for(int i=0;i<grayscaleArray1.length;i++){
                        for(int j=0;j<grayscaleArray1[0].length;j++)
                            System.out.print(grayscaleArray1[i][j]+"  ");
                        System.out.println();
                    }
                    System.out.println();
                }
                else{
                    System.out.println("\uD83C\uDFF4"+"EROR. toGrayscaleArray method is not ok."+"\n"+
                        "the accept Array:");
                    for(int i=0;i<grayscaleArray1.length;i++){
                        for(int j=0;j<grayscaleArray1[0].length;j++)
                            System.out.print(grayscaleArray1[i][j]+"  ");
                        System.out.println();
                    }
                    System.out.println();
                }

            
                System.out.println("Test 15 - **toString**");
                String str= "(0,0,0) (0,0,0) (0,0,0) (0,0,0)"+"\n"+
                    "(1,1,1) (1,1,1) (1,1,1) (1,1,1)"+"\n"+
                    "(2,2,2) (2,2,2) (2,2,2) (2,2,2)"+"\n"+
                    "(3,3,3) (3,3,3) (3,3,3) (3,3,3)"+"\n"+
                    "(4,4,4) (4,4,4) (4,4,4) (4,4,4)"+"\n"+
                    "(5,5,5) (5,5,5) (5,5,5) (5,5,5)"+"\n";
                String str0= "(0,0,0) (1,1,1) (2,2,2) (3,3,3)"+"\n";
                if (str.equals(rgbImg.toString()) && str0.equals(rgbImg8.toString()))
                    System.out.println("\uD83C\uDFC6"+"OK. toString working just as expected"+"\n"+
                        "the accept string is"+"\n"+rgbImg+"\n");
                else
                    System.out.println("\uD83C\uDFF4"+"EROR. toString working wrong"+"\n"+
                        "the accept string is"+"\n"+rgbImg+"\n"+"the expected string is"+"\n"+str+"\n");

            
                System.out.println("Test 14 - **toRGBColorArray** method");
                RGBColor[][] toRGBColorArray = rgbImg.toRGBColorArray();
                RGBImage rgbImg20 = new RGBImage(toRGBColorArray);
                if (rgbImg20.equals(rgbImg))
                    System.out.println("\uD83C\uDFC6"+"OK. toRGBColorArray method is Work properly.");
                else
                    System.out.println("\uD83C\uDFF4"+"EROR. toRGBColorArray method is not ok.");
                toRGBColorArray[3][2].setRed(0);
                if (!toRGBColorArray[3][2].equals(rgbImg.getPixel(3,2)))
                    System.out.println("\uD83C\uDFC6"+"OK. toRGBColorArray method is Without aliasing.");
                else
                    System.out.println("\uD83C\uDFF4"+"EROR. you have aliasing in toRGBColorArray method.");

                    
                    
            
            }
            else
                System.out.println ("\uD83C\uDFF4"+"EROR. the equals method is not ok. Therefore we can not continue the test."+"\n"+
                    "Please fix the equals method to continue."+"\n");
        }
        else
            System.out.println ("\uD83C\uDFF4"+"EROR. one of the Constructors is not ok. Therefore we can not continue the test."+"\n"+
                "Please fix the Constructor to continue."+"\n");
    }
}
