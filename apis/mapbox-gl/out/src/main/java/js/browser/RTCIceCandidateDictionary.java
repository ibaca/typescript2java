package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceCandidateDictionary
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 274084

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceCandidateDictionary
{

    /*
        Properties
    */

    public String foundation;

    public String ip;

    public String msMTurnSessionId;

    public Number port;

    public Number priority;

    public String protocol;

    public String relatedAddress;

    public Number relatedPort;

    public String tcpType;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "foundation")
    public native String getFoundation();
    @JsProperty(name = "ip")
    public native String getIp();
    @JsProperty(name = "msMTurnSessionId")
    public native String getMsMTurnSessionId();
    @JsProperty(name = "port")
    public native Number getPort();
    @JsProperty(name = "priority")
    public native Number getPriority();
    @JsProperty(name = "protocol")
    public native String getProtocol();
    @JsProperty(name = "relatedAddress")
    public native String getRelatedAddress();
    @JsProperty(name = "relatedPort")
    public native Number getRelatedPort();
    @JsProperty(name = "tcpType")
    public native String getTcpType();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "foundation")
    public native void setFoundation(String value);
    @JsProperty(name = "ip")
    public native void setIp(String value);
    @JsProperty(name = "msMTurnSessionId")
    public native void setMsMTurnSessionId(String value);
    @JsProperty(name = "port")
    public native void setPort(@DoNotAutobox Number value);
    @JsProperty(name = "priority")
    public native void setPriority(@DoNotAutobox Number value);
    @JsProperty(name = "protocol")
    public native void setProtocol(String value);
    @JsProperty(name = "relatedAddress")
    public native void setRelatedAddress(String value);
    @JsProperty(name = "relatedPort")
    public native void setRelatedPort(@DoNotAutobox Number value);
    @JsProperty(name = "tcpType")
    public native void setTcpType(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
