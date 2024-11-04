package com.seriesa.enumeration;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

public enum WindowEnum {
    DEFAULT (new int[] {
        GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getMaximumWindowBounds().width,
        GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getMaximumWindowBounds().height}),
    DCI2K   (new int[] {2048, 1080}),
    FHD     (new int[] {1920, 1080}),
    WSXGApls(new int[] {1680, 1050}),
    WSXGA   (new int[] {1600, 900}),
    WXGApls (new int[] {1440, 900}),
    SXGA    (new int[] {1280, 1024}),
    HD720   (new int[] {1280, 720}),
    XGA     (new int[] {1024, 768}),
    WSVGA   (new int[] {1024, 600}),
    SVGA    (new int[] {800, 600}),
    VGA     (new int[] {640, 480}),
    None    (new int[] {0, 0});

    private int         width;
    private int         height;
    private Dimension   windowDims;

    WindowEnum (int dimensions[]) {
        this.width = dimensions[0];
        this.height = dimensions[1];
    }

    /* -------------------------------------------------------------------
     * -- Public methods
     * ------------------------------------------------------------------- */
    /**
     * This method returns a dimension. We basically return the window
     * dims.
     * @param we
     * @return
     */
    public static Dimension getWindowDims(WindowEnum we) {
        return (new Dimension(we.width, we.height));
    }

    public Dimension getWindowDims() {
        if (this.windowDims == null) {
            this.windowDims = new Dimension(width, height);
        }
        return (windowDims);
    }

    /**
     * This method returns a string on the current resoltion identified.
     * @param we
     * @return String
     */
    public String getResolutionNameString (WindowEnum we) {
        switch (we) {
            case DEFAULT:
                return ("Default Screen Resolution...");
            case DCI2K:
                return ("DCI2K");
            case FHD:
                return ("FHD");
            case WSXGApls:
                return ("WSXGApls");
            case WSXGA:
                return ("WSXGA");
            case WXGApls:
                return ("WXGAplus");
            case SXGA:
                return ("SXGA");
            case HD720:
                return ("HD720");
            case XGA:
                return ("XGA");
            case WSVGA:
                return ("WSVGA");
            case SVGA:
                return ("SVGA");
            case VGA:
                return ("VGA");
            default:
                return ("None");
        } 
    }
}
