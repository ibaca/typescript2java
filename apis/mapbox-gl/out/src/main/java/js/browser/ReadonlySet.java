package js.browser;

import fr.lteconsulting.prebuilt.Action3;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ReadonlySet
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 216523

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ReadonlySet<T>
{

    /*
        Properties
    */

    public int size;

    /*
        Methods
    */
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@216556
     */
    public native void forEach(Action3<T, T, ReadonlySet<T>> callbackfn);
    @JsProperty(name = "size")
    public native Number getSize();
    /** 
      * tsd/browser/lib.es6.d.ts@216654
     */
    public native Boolean has(@DoNotAutobox T value);
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
}
