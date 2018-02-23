package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DeviceMotionEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 325664
  * declared in: tsd/browser/lib.es6.d.ts at pos 326202
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceMotionEvent")
public class DeviceMotionEvent extends Event 
{

    /*
        Constructors
    */
    public DeviceMotionEvent (String typeArg, DeviceMotionEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public DeviceMotionEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public DeviceAcceleration acceleration;

    public DeviceAcceleration accelerationIncludingGravity;

    public Number interval;

    public DeviceRotationRate rotationRate;

    /*
        Methods
    */
    @JsProperty(name = "acceleration")
    public native DeviceAcceleration getAcceleration();
    @JsProperty(name = "accelerationIncludingGravity")
    public native DeviceAcceleration getAccelerationIncludingGravity();
    @JsProperty(name = "interval")
    public native Number getInterval();
    @JsProperty(name = "rotationRate")
    public native DeviceRotationRate getRotationRate();
    /** 
      * tsd/browser/lib.es6.d.ts@325930
     */
    public native void initDeviceMotionEvent(String type, Boolean bubbles, Boolean cancelable, DeviceAccelerationDict acceleration, DeviceAccelerationDict accelerationIncludingGravity, DeviceRotationRateDict rotationRate, @DoNotAutobox Number interval);
    @JsProperty(name = "acceleration")
    public native void setAcceleration(DeviceAcceleration value);
    @JsProperty(name = "accelerationIncludingGravity")
    public native void setAccelerationIncludingGravity(DeviceAcceleration value);
    @JsProperty(name = "interval")
    public native void setInterval(@DoNotAutobox Number value);
    @JsProperty(name = "rotationRate")
    public native void setRotationRate(DeviceRotationRate value);
}
