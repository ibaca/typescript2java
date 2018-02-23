package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaDeviceInfo
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 516247
  * declared in: tsd/browser/lib.es6.d.ts at pos 516407
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaDeviceInfo")
public class MediaDeviceInfo
{

    /*
        Constructors
    */
    public MediaDeviceInfo () {
    } 

    /*
        Properties
    */

    public String deviceId;

    public String groupId;

    public String kind;

    public String label;

    /*
        Methods
    */
    @JsProperty(name = "deviceId")
    public native String getDeviceId();
    @JsProperty(name = "groupId")
    public native String getGroupId();
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "deviceId")
    public native void setDeviceId(String value);
    @JsProperty(name = "groupId")
    public native void setGroupId(String value);
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
}
