import javax.swing.*;

public class gui 
{
	public JTextArea textArea=new JTextArea("Put your text here");
	public JScrollPane scrollBar=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	public JFrame frame=new JFrame("Simple Secure Messenger");
	public JTextField message = new JTextField();
public static void main(String[]args)
{
 gui gui =new gui();
 //Create JTextArea
 
 gui.textArea.setLineWrap(true);
 //Create JScrollPane that will be use as JTextArea scrollbar from JTextArea object
 

 //Create a window using JFrame
 

 //add created JScrollPane into JFrame
 gui.frame.add(gui.scrollBar);

 //Set default close operation for JFrame
 gui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 //Set JFrame size
 gui.frame.setSize(500,200);

 //Make JFrame get to center
 gui.frame.setLocationRelativeTo(null);

 //Make JFrame visible
 gui.frame.setVisible(true);

}

}