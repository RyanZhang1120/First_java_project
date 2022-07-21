/*  
 *  Xingchen Zhang
 *  October 19, 2021
 *  Scenery.java
 *  Create a Cow on the ground
 */

import acm.program.GraphicsProgram;
import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.graphics.GOval;
import java.awt.Color;

class Scenery extends GraphicsProgram 
{
  final int APP_WIDTH = 600;
  final int APP_HEIGHT = 600;
  int tree_WIDTH = 30;
  int tree_HEIGHT = 60;
  int wood_WIDTH = 10;
  int wood_HEIGHT = 20;
  Color skyblue = new Color(33, 28, 173);
  Color lawngreen = new Color(5, 133, 41);
  Color brown = new Color(135, 97, 7);
  Color tree1color = new Color(53, 130, 75);
  Color tree2color = new Color(24, 242, 68);
  Color wood = new Color(115, 100, 7);
  GRect lawn;
  GRect wood1;
  GRect wood2;
  GOval tree1;
  GOval tree2;
  GImage cow;
  

  public static void main(String[] args) 
  {
    Scenery program = new Scenery();
    program.start();
  }

  public void init()
  {
    drawBackground();
  }
  
  public void run()
  {
   drawlawn();
   drawtree();
   drawcow();
   animatecow();

  }//end of run
  
  public void drawBackground()
  {
   setSize(APP_WIDTH,APP_HEIGHT);
   setBackground(skyblue);
  }
  
  public void drawlawn()
  {
   lawn = new GRect(0, APP_HEIGHT*3/5, APP_WIDTH, APP_HEIGHT*2/5); 
   add(lawn);
   lawn.setColor(lawngreen);
   lawn.setFillColor(lawngreen);
   lawn.setFilled(true); 
  }
  
  public void drawtree()
  {
   drawwood1();
   drawwood2();
   drawtree1();
   drawtree2();
  }
   
   public void drawtree1()
   {
    tree1 = new GOval(tree_WIDTH, tree_HEIGHT);
    add(tree1, APP_WIDTH*2/3, APP_HEIGHT/2);
    tree1.setColor(tree1color);
    tree1.setFillColor(tree1color);
    tree1.setFilled(true);
   }
   
   public void drawtree2()
   {
    tree2 = new GOval(tree_WIDTH, tree_HEIGHT);
    add(tree2, APP_WIDTH*2/3 + tree_WIDTH, APP_HEIGHT/2 - 10);
    tree2.setColor(tree2color);
    tree2.setFillColor(tree2color);
    tree2.setFilled(true);
   }
   
   public void drawwood1()
   {
    wood1 = new GRect(wood_WIDTH, wood_HEIGHT);
    add(wood1, APP_WIDTH*2/3 + 10, APP_HEIGHT/2 + tree_HEIGHT - 10);
    wood1.setColor(wood);
    wood1.setFillColor(wood);
    wood1.setFilled(true);
   }
   
   public void drawwood2()
   {
    wood2 = new GRect(wood_WIDTH, wood_HEIGHT);
    add(wood2, APP_WIDTH*2/3 + tree_WIDTH + 10, APP_HEIGHT/2 + tree_HEIGHT - 20);
    wood2.setColor(wood);
    wood2.setFillColor(wood);
    wood2.setFilled(true);
   }
   
   public void drawcow()
   {
    cow = new GImage("cow.png");
    add(cow, 150, 400);
    cow.scale(1.1);
   }
   
   public void animatecow()
   {
    waitForClick();
    while(true)
     {
      cow.move(1, 0);
      pause(10);
     }
   }
   
  
 }//end of class