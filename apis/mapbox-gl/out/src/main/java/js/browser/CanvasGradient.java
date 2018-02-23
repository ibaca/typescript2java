package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: CanvasGradient
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 311235
  * declared in: tsd/browser/lib.es6.d.ts at pos 311333
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CanvasGradient")
public class CanvasGradient
{

    /*
        Constructors
    */
    public CanvasGradient () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@311268
     */
    public native void addColorStop(@DoNotAutobox Number offset, String color);
}
