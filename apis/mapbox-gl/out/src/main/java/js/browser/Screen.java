package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Screen
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 638270
  * declared in: tsd/browser/lib.es6.d.ts at pos 639236
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Screen")
public class Screen extends EventTarget 
{

    /*
        Constructors
    */
    public Screen () {
    } 

    /*
        Properties
    */

    public Number availHeight;

    public Number availWidth;

    public Number bufferDepth;

    public Number colorDepth;

    public Number deviceXDPI;

    public Number deviceYDPI;

    public Boolean fontSmoothingEnabled;

    public Number height;

    public Number logicalXDPI;

    public Number logicalYDPI;

    public String msOrientation;

    public Function1<Event, Object> onmsorientationchange;

    public Number pixelDepth;

    public Number systemXDPI;

    public Number systemYDPI;

    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "availHeight")
    public native Number getAvailHeight();
    @JsProperty(name = "availWidth")
    public native Number getAvailWidth();
    @JsProperty(name = "bufferDepth")
    public native Number getBufferDepth();
    @JsProperty(name = "colorDepth")
    public native Number getColorDepth();
    @JsProperty(name = "deviceXDPI")
    public native Number getDeviceXDPI();
    @JsProperty(name = "deviceYDPI")
    public native Number getDeviceYDPI();
    @JsProperty(name = "fontSmoothingEnabled")
    public native Boolean getFontSmoothingEnabled();
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "logicalXDPI")
    public native Number getLogicalXDPI();
    @JsProperty(name = "logicalYDPI")
    public native Number getLogicalYDPI();
    @JsProperty(name = "msOrientation")
    public native String getMsOrientation();
    @JsProperty(name = "onmsorientationchange")
    public native Function1<Event, Object> getOnmsorientationchange();
    @JsProperty(name = "pixelDepth")
    public native Number getPixelDepth();
    @JsProperty(name = "systemXDPI")
    public native Number getSystemXDPI();
    @JsProperty(name = "systemYDPI")
    public native Number getSystemYDPI();
    @JsProperty(name = "width")
    public native Number getWidth();
    public native Boolean msLockOrientation(String orientations);
    public native Boolean msLockOrientation(Array<String> orientations);
    /** 
      * tsd/browser/lib.es6.d.ts@638871
     */
    public native Boolean msLockOrientation(UnionOfArrayOfStringAndString orientations);
    /** 
      * tsd/browser/lib.es6.d.ts@638936
     */
    public native void msUnlockOrientation();
    @JsProperty(name = "availHeight")
    public native void setAvailHeight(@DoNotAutobox Number value);
    @JsProperty(name = "availWidth")
    public native void setAvailWidth(@DoNotAutobox Number value);
    @JsProperty(name = "bufferDepth")
    public native void setBufferDepth(@DoNotAutobox Number value);
    @JsProperty(name = "colorDepth")
    public native void setColorDepth(@DoNotAutobox Number value);
    @JsProperty(name = "deviceXDPI")
    public native void setDeviceXDPI(@DoNotAutobox Number value);
    @JsProperty(name = "deviceYDPI")
    public native void setDeviceYDPI(@DoNotAutobox Number value);
    @JsProperty(name = "fontSmoothingEnabled")
    public native void setFontSmoothingEnabled(Boolean value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "logicalXDPI")
    public native void setLogicalXDPI(@DoNotAutobox Number value);
    @JsProperty(name = "logicalYDPI")
    public native void setLogicalYDPI(@DoNotAutobox Number value);
    @JsProperty(name = "msOrientation")
    public native void setMsOrientation(String value);
    @JsProperty(name = "onmsorientationchange")
    public native void setOnmsorientationchange(Function1<Event, Object> value);
    @JsProperty(name = "pixelDepth")
    public native void setPixelDepth(@DoNotAutobox Number value);
    @JsProperty(name = "systemXDPI")
    public native void setSystemXDPI(@DoNotAutobox Number value);
    @JsProperty(name = "systemYDPI")
    public native void setSystemYDPI(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
