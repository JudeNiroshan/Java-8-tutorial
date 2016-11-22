package com.company.gui;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by JNiroshan on 11/22/2016.
 */
public class FisherManMainWindow extends JFrame
{

  private static FisherManMainWindow instance = null;
  private JLabel label = new JLabel("Fisher man");
  private JButton button = new JButton();
  private JLabel historyLbl = new JLabel("Your fishing history :");
  private JLabel result = new JLabel();

  private static String[] resultArr = new String[10];
  private static int counter = 0;

  public static FisherManMainWindow getFisherManMainWindow(){
    if(instance == null)
      instance = new FisherManMainWindow();
    return instance;
  }

  private FisherManMainWindow(){
    /**
     * Initializing the frame with defaults
     */
    button.setText("Catch Fishes!");
    this.setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(5,5,5,5);
    this.add(label, gbc);


    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.BOTH;
    this.add(button, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(5,5,5,5);
    this.add(historyLbl, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(5,5,5,5);
    this.add(result, gbc);

    button.addActionListener(new ActionListener()
    {
      @Override public void actionPerformed(ActionEvent e)
      {
        if(counter < 10)
        {
          int fishCount = (int) (Math.random() * 10);
          resultArr[counter++] = String.valueOf(fishCount);
          result.setText(Arrays.deepToString(resultArr));
          result.setVisible(true);
        }else{
          JOptionPane.showMessageDialog(null, "Your basket is full");
        }
      }
    });
  }



}
