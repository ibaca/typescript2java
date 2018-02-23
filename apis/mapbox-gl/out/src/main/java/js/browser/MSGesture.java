package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSGesture
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 504113
  * declared in: tsd/browser/lib.es6.d.ts at pos 504231
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSGesture")
public class MSGesture
{

    /*
        Constructors
    */
    public MSGesture () {
    } 

    /*
        Properties
    */

    public Element target;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@504162
     */
    public native void addPointer(@DoNotAutobox Number pointerId);
    @JsProperty(name = "target")
    public native Element getTarget();
    @JsProperty(name = "target")
    public native void setTarget(Element value);
    /** 
      * tsd/browser/lib.es6.d.ts@504203
     */
    public native void stop();
}
