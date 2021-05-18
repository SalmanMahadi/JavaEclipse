package DrawingTool;

public class Door {

	
// properties 	
private int width , height ;

// Constructor 

//public Door(int width, int height )
//{
//  this.width = width;
//  this.height = height;
//  
//
//}

// Draw() Method
  
public void drawAt(int left, int bottom) {
 int x = left;
 int y = bottom - height;
drawRect(x, y, width, height);
 }




	
	
	
}
