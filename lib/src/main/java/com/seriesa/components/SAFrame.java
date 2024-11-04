/**
 * @author: Rezvee Rahman
 * @version: SE-21
 * 
 * This is the SAFrame (SeriesA Frame). We extend from JFrame. When
 * cosntructing a SAFrame we setup default values of closing operaitons
 * and such. We also setup the application to use the default resoltuion
 * of the monitor.
 */
package com.seriesa.components;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.seriesa.enumeration.WindowEnum;

public class SAFrame extends JFrame {

    private WindowEnum SAwe = WindowEnum.DEFAULT; 

    /**
     * This constructor is a default constructor for creating a SAFrame.
     * This is a lazy way of creating a new frame but it works.
     */
    public SAFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(SAwe.getWindowDims());
        this.setMaximumSize(SAwe.getWindowDims());
        this.setMinimumSize(WindowEnum.getWindowDims(WindowEnum.VGA));

        this.setTitle("Testing GUI");
        this.setVisible(true);
    }

    /* ------------------------------------------------------------------ 
     * -- Public methods
     * ------------------------------------------------------------------ */

     /**
      * This method set's up the 
      */

    /* ------------------------------------------------------------------ 
     * -- private methods
     * ------------------------------------------------------------------ */

    /* ------------------------------------------------------------------ 
     * -- Inner classes
     * ------------------------------------------------------------------ */


}