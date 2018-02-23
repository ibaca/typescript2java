package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaKeyStatusMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 519054
  * declared in: tsd/browser/lib.es6.d.ts at pos 519232
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeyStatusMap")
public class MediaKeyStatusMap
{

    /*
        Constructors
    */
    public MediaKeyStatusMap () {
    } 

    /*
        Properties
    */

    public int size;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@519117
     */
    public native void forEach(ForEachCallback callback);
    /** 
      * tsd/browser/lib.es6.d.ts@519163
     */
    public native String get(Object keyId);
    @JsProperty(name = "size")
    public native Number getSize();
    /** 
      * tsd/browser/lib.es6.d.ts@519192
     */
    public native Boolean has(Object keyId);
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
}
