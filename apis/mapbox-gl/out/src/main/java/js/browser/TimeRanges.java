package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TimeRanges
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 657913
  * declared in: tsd/browser/lib.es6.d.ts at pos 658047
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TimeRanges")
public class TimeRanges
{

    /*
        Constructors
    */
    public TimeRanges () {
    } 

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@657971
     */
    public native Number end(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@658003
     */
    public native Number start(@DoNotAutobox Number index);
}
