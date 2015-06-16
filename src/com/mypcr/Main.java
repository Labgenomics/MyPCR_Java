package com.mypcr;

import javax.swing.JOptionPane;

import com.hidapi.HidClassLoader;
import com.mypcr.ui.MainUI;

/**
 * Main �Լ��� �����ϴ� Ŭ����
 * @author YJ
 */
public class Main 
{
	static
	{
		// HID ���� Native ���̺귯���� �ü������ �θ� �� �ִ� �Լ��̴�. ���α׷��� ���۽� 1���� ����ȴ�.
		if( !HidClassLoader.LoadLibrary() )
		{
			// ���� �ε忡 �����ϸ� ���� �޽���â�� ����, ���α׷��� �����Ų��.
			JOptionPane.showMessageDialog(null, "Not Supported OS.. Exit the Program.");
			System.exit(-1);
		}
	}
	/**
	 * MainUI Ŭ������ Run() �Լ��� ȣ���Ͽ� MainUI�� ����ִ� ����.
	 * @param args ���⼭�� ������� ����.
	 * @see MainUI#Run()
	 */
	public static void main(String[] args)
	{
		MainUI ui = new MainUI();
		/*
		if( args.length != 1 ){
			JOptionPane.showMessageDialog(null, "mPCR �� �ݵ�� multiple mPCR �� ���� �����ϼž� �մϴ�.");
			return;
		}
		
		if( args[0].length() != 11 ){
			JOptionPane.showMessageDialog(null, "Serial Number �� �߸��Ǿ����ϴ�.");
			return;
		}
		*/
		ui.setSerialNumber("MyPCR222222");
		ui.Run();
	}
}