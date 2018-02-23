package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DeviceOrientationEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 326343
  * declared in: tsd/browser/lib.es6.d.ts at pos 326719
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceOrientationEvent")
public class DeviceOrientationEvent extends Event 
{

    /*
        Constructors
    */
    public DeviceOrientationEvent (String typeArg, DeviceOrientationEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public DeviceOrientationEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Boolean absolute;

    public Number alpha;

    public Number beta;

    public Number gamma;

    /*
        Methods
    */
    @JsProperty(name = "absolute")
    public native Boolean getAbsolute();
    @JsProperty(name = "alpha")
    public native Number getAlpha();
    @JsProperty(name = "beta")
    public native Number getBeta();
    @JsProperty(name = "gamma")
    public native Number getGamma();
    /** 
      * tsd/browser/lib.es6.d.ts@326534
     */
    public native void initDeviceOrientationEvent(String type, Boolean bubbles, Boolean cancelable, @DoNotAutobox Number alpha, @DoNotAutobox Number beta, @DoNotAutobox Number gamma, Boolean absolute);
    @JsProperty(name = "absolute")
    public native void setAbsolute(Boolean value);
    @JsProperty(name = "alpha")
    public native void setAlpha(@DoNotAutobox Number value);
    @JsProperty(name = "beta")
    public native void setBeta(@DoNotAutobox Number value);
    @JsProperty(name = "gamma")
    public native void setGamma(@DoNotAutobox Number value);
}
