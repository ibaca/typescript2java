package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtcpParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 276776

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtcpParameters
{

    /*
        Properties
    */

    public String cname;

    public Boolean mux;

    public Boolean reducedSize;

    public Number ssrc;

    /*
        Methods
    */
    @JsProperty(name = "cname")
    public native String getCname();
    @JsProperty(name = "mux")
    public native Boolean getMux();
    @JsProperty(name = "reducedSize")
    public native Boolean getReducedSize();
    @JsProperty(name = "ssrc")
    public native Number getSsrc();
    @JsProperty(name = "cname")
    public native void setCname(String value);
    @JsProperty(name = "mux")
    public native void setMux(Boolean value);
    @JsProperty(name = "reducedSize")
    public native void setReducedSize(Boolean value);
    @JsProperty(name = "ssrc")
    public native void setSsrc(@DoNotAutobox Number value);
}
