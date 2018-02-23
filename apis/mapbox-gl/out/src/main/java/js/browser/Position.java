package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Position
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 551380
  * declared in: tsd/browser/lib.es6.d.ts at pos 551483
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Position")
public class Position
{

    /*
        Constructors
    */
    public Position () {
    } 

    /*
        Properties
    */

    public Coordinates coords;

    public Number timestamp;

    /*
        Methods
    */
    @JsProperty(name = "coords")
    public native Coordinates getCoords();
    @JsProperty(name = "timestamp")
    public native Number getTimestamp();
    @JsProperty(name = "coords")
    public native void setCoords(Coordinates value);
    @JsProperty(name = "timestamp")
    public native void setTimestamp(@DoNotAutobox Number value);
}
