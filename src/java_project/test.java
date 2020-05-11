/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

/**
 *
 * @author Aditya Kumar
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;

public class test extends JFrame
{
	Image newimg;
	test()
	{
	}
	test(Image m)
	{
		newimg=m;
	}
	public void paint(Graphics g)
	{
		g.drawImage(newimg,100,100,null);
	}

	public static void main(String args[])
	{
		test bp=new test();
		bp.setSize(1035,740);
		bp.setVisible(true);
	}
}