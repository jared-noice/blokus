import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;        //CURRENTLY NEED TO CHANGE HOW ELEVATORS PAUSE AT THE DIFFERENT FLOORS (used resetTime() and getTime() in elevator)
import java.awt.event.ActionEvent;
import java.util.*;

public class Blokus extends JPanel implements MouseListener, MouseMotionListener
{
   private ImageIcon emptySpace = new ImageIcon("EMPTY_SPACE");
   private ImageIcon allPieces = new ImageIcon("ALL_PIECES_GREEN");
   private ImageIcon crossHair = new ImageIcon("CROSSHAIR.GIF");
   
   private static final int SIZE = 60;
   
   private static int[][] board;      
            
}