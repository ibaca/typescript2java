package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DeviceAcceleration
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 325210
  * declared in: tsd/browser/lib.es6.d.ts at pos 325350
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceAcceleration")
public class DeviceAcceleration
{

    /*
        Constructors
    */
    public DeviceAcceleration () {
    } 

    /*
        Properties
    */

    public Number x;

    public Number y;

    public Number z;

    /*
        Methods
    */
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    @JsProperty(name = "z")
    public native Number getZ();
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
    @JsProperty(name = "z")
    public native void setZ(@DoNotAutobox Number value);
}
