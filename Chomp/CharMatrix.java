// Implements a 2-D array of characters

public class CharMatrix
{
  // Fields:
  private char [][] values;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    values = new char[rows][cols];
    for(int row = 0; row <rows; row++)
     {
         for (int col = 0; col <cols; col++)
         {
             values[row][col] = ' ';
         }
     }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    values = new char[rows][cols];
    for(int row = 0; row <rows; row++)
     {
         for (int col = 0; col <cols; col++)
         {
             values[row][col] = fill;
         }
     }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
      return values.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
      return values[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
     return values[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    values[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    if ( values[row][col] == ' ' )
    {
        return true;
    }
    else
    {
        return false;
    }
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
     for(int rows = row0; rows <= row1; rows++)
     {
         for (int cols = col0; cols <= col1; cols++)
         {
             values[rows][cols] = fill;
         }
     }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
     for(int rows = row0; rows <= row1; rows++)
     {
         for (int cols = col0; cols <= col1; cols++)
         {
             values[rows][cols] = ' ';
         }
     }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int count = 0;
    for(int i = 0; i < values[row].length; i++ )
    {
       if ( values[row][i] != ' ' )
        {
            count++;
        }
    }
    return count;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
      int count = 0;
      for(int i = 0; i < values[col].length; i++ )
      {
          if ( values[col][i] != ' ' )
          {
              count++;
            }
      }
      return count;
  }
}
