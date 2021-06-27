
/**
 * this class is a structure to make an image from arrays of pixels and some
 * mathodes on that .
 *
 * @author Yehiel Toporowitch
 * @version 27/05/2021
 */
public class RGBImage {
    private RGBColor[][] _image;

    /**
     * this constructor make a black image with the rows and columns from the params
     * 
     * @params rows num of the rows
     * @params cols num of the columns
     */
    public RGBImage(int rows, int cols) {
        _image = new RGBColor[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                _image[i][j] = new RGBColor();
    }

    /**
     * this constructor recieved an RGBVColor tow dimensional array and make a
     * RGBImage with an image from taht;
     * 
     * @params pixels a RGBVColor tow dimansional array
     */
    public RGBImage(RGBColor[][] pixels) {
        _image = new RGBColor[pixels.length][pixels[0].length];
        for (int i = 0; i < pixels.length; i++)
            for (int j = 0; j < pixels[i].length; j++)
                _image[i][j] = new RGBColor(pixels[i][j]);
    }

    /**
     * a copy constructor
     * 
     * @params other the other RGBImage that we copy from
     */
    public RGBImage(RGBImage other) {
        this(other._image);
    }

    /**
     * returens the num of columns of the image
     * 
     * @return num of columns;
     */
    public int getHeight() {
        return _image.length;
    }

    /**
     * returns the num of rows of the image
     * 
     * @return num of rows
     */
    public int getWidth() {
        return _image[0].length;
    }

    /**
     * get the pixel in spacipic place by the index of row and column
     * 
     * @params row index of row
     * @params col index of column
     * @return a RGBColor of the pixel
     */
    public RGBColor getPixel(int row, int col) {
        if (row < _image.length && row >= 0 && col < _image[0].length && col >= 0)
            return new RGBColor(_image[row][col]);
        else
            return new RGBColor();
    }

    /**
     * set the pixel in the recieved index
     * 
     * @params row the index of row
     * @params col the index of column
     */
    public void setPixel(int row, int col, RGBColor pixel) {
        if (row < _image.length && row >= 0 && col < _image[0].length && col >= 0)
            _image[row][col] = new RGBColor(pixel);
    }

    /**
     * returens if the given RGBImage equals to this RGBImage
     * 
     * @params other the other RGBImage
     * @return if they are equals
     */
    public boolean equals(RGBImage other) {
        boolean result = true;
        if (other._image.length > _image.length || other._image[0].length > _image[0].length)
            result = false;
        for (int i = 0; i < _image.length && result == true; i++)
            for (int j = 0; j < _image[0].length && result == true; j++)
                result = _image[i][j].equals(other._image[i][j]);

        return result;
    }

    /**
     * flip the image in Horizontal direction
     */
    public void flipHorizontal() {
        RGBColor[][] image2 = toRGBColorArray();
        for (int i = 0; i < _image.length; i++)
            for (int j = 0, k = _image[i].length - 1; j < _image[i].length; j++, k--)
                _image[i][j] = image2[i][k]; // for all rows change the first column to the last and so on
    }

    /**
     * flip the image in vartical direction
     */
    public void flipVertical() {
        RGBColor[][] image2 = toRGBColorArray();
        for (int i = _image.length - 1, j = 0; i >= 0; i--, j++)
            _image[j] = image2[i]; // change the line of the last image to the first and so on
    }

    /**
     * invert the all coolors of the image
     */
    public void invertColors() {
        RGBColor[][] image2 = toRGBColorArray();
        for (int i = 0; i < _image.length; i++)
            for (int j = 0; j < _image[i].length; j++)
                image2[i][j].invert(); // use the invert mathode in the RGBColor class to invert the all pixels
        _image = image2;
    }
    
    /**
     * rotate the image to th clockwise direction
     */
    public void rotateClockwise() {
        RGBColor[][] image2 = toRGBColorArray();
        _image = new RGBColor[_image[0].length][_image.length]; // make new image with the oposite rows and columns
        for (int i = 0, j = image2.length - 1; i < image2.length; i++, j--)
            for (int k = 0; k < image2[i].length; k++)
                _image[k][j] = image2[i][k]; // change all the pixels from the row in image2 to the column in _image
    }

    /**
     * rotate the image to the CounterClockwise direction
     */
    public void rotateCounterClockwise() {
        RGBColor[][] image2 = toRGBColorArray();
        _image = new RGBColor[_image[0].length][_image.length]; // make new image with the oposite rows and columns
        for (int i = 0; i < image2.length; i++)
            for (int j = 0, k = image2[i].length - 1; j < image2[i].length; j++, k--)
                _image[j][i] = image2[i][k]; // change all the pixels from the row in image2 to the column in _image
    }

    /**
     * shift the image height by the recieved num if the num biger of the image
     * coloumns it's not do anything
     * 
     * @params offset the num to shift from
     */
    public void shiftCol(int offset) {
        RGBImage blackImage = new RGBImage(_image.length, _image[0].length); // make new black image
        if (Math.abs(offset) <= _image[0].length) // if offset big then the columns we dont do nothing
        {
            for (int i = 0, j = offset; i < _image[0].length && j < _image[0].length; i++, j++)
                if (j >= 0) // if j is under 0 we dont do nothing
                {
                    for (int k = 0; k < _image.length; k++)
                        blackImage._image[k][j] = new RGBColor(_image[k][i]); // put the start col of image in the j
                    // that it the start offset and so on
                }
            _image = blackImage._image;
        }
    }

    /**
     * smae like the shiftCol mathode but in the width of the image
     * 
     * @params offset the num to shift from
     */
    public void shiftRow(int offset) { // same the shiftCol but in the columns
        RGBImage blackImage = new RGBImage(_image.length, _image[0].length);
        if (Math.abs(offset) <= _image.length) {
            for (int i = 0, j = offset; i < _image.length && j < _image.length; i++, j++)
                if (j >= 0) {
                    for (int k = 0; k < _image[i].length; k++)
                        blackImage._image[j][k] = new RGBColor(_image[i][k]);
                }
            _image = blackImage._image;
        }
    }

    /**
     * returens a tow dimensional array of double of the gary scale of the pixels of
     * the image
     * 
     * @return tow dimensional array of double of the gary scale of the pixels of
     *         the image
     */
    public double[][] toGrayscaleArray() {
        double[][] grayscaleArray = new double[_image.length][_image[0].length];
        for (int i = 0; i < _image.length; i++)
            for (int j = 0; j < _image[i].length; j++)
                grayscaleArray[i][j] = _image[i][j].convertToGrayscale(); // use the convertToGrayscale RBGBColor
        // mathode to get the gray scale of all pixels
        return grayscaleArray;
    }

    /**
     * returens a string of the all pixels in the image
     * 
     * @returen string of the pixels
     */
    public String toString() {
        String str = "";
        for (int i = 0; i < _image.length; i++) {

            for (int j = 0; j < _image[i].length - 1; j++)
                str += _image[i][j] + " ";
            str += _image[i][_image[i].length - 1];
            str += "\n";
        }
        return str;
    }

    /**
     * returens a copy of the image
     * 
     * @return RGBColor[][] that is copy of the image
     */
    public RGBColor[][] toRGBColorArray() { // copy the image by use the copy constractor and get the _image of it .
        // RGBImage other = new RGBImage(this);
        // return other._image;
        RGBColor[][] image2 = new RGBImage(this)._image;
        return image2;
    }

}
