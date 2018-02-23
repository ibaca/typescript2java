package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ImageData
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 497033
  * declared in: tsd/browser/lib.es6.d.ts at pos 497157
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ImageData")
public class ImageData
{

    /*
        Constructors
    */
    public ImageData (@DoNotAutobox Number width, @DoNotAutobox Number height) {
    } 
    public ImageData (Uint8ClampedArray array, @DoNotAutobox Number width, @DoNotAutobox Number height) {
    } 

    /*
        Properties
    */

    public Uint8ClampedArray data;

    public Number height;

    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "data")
    public native Uint8ClampedArray getData();
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "width")
    public native Number getWidth();
    @JsProperty(name = "data")
    public native void setData(Uint8ClampedArray value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
