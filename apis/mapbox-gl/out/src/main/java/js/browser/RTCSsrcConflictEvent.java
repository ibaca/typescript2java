package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCSsrcConflictEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 565661
  * declared in: tsd/browser/lib.es6.d.ts at pos 565751
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSsrcConflictEvent")
public class RTCSsrcConflictEvent extends Event 
{

    /*
        Constructors
    */
    public RTCSsrcConflictEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number ssrc;

    /*
        Methods
    */
    @JsProperty(name = "ssrc")
    public native Number getSsrc();
    @JsProperty(name = "ssrc")
    public native void setSsrc(@DoNotAutobox Number value);
}
