package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebSocket
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 702364
  * declared in: tsd/browser/lib.es6.d.ts at pos 703280
  * 4 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebSocket")
public class WebSocket extends EventTarget 
{

    /*
        Constructors
    */
    public WebSocket (String url, UnionOfArrayOfStringAndString protocols /* optional */) {
    } 
    public WebSocket (String url, Array<String> protocols /* optional */) {
    } 
    public WebSocket (String url, String protocols /* optional */) {
    } 
    public WebSocket (String url) {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="WebSocket", name="CLOSED")
    public static Number CLOSED;

    @JsProperty(namespace="WebSocket", name="CLOSING")
    public static Number CLOSING;

    @JsProperty(namespace="WebSocket", name="CONNECTING")
    public static Number CONNECTING;

    @JsProperty(namespace="WebSocket", name="OPEN")
    public static Number OPEN;

    /*
        Properties
    */

    public String binaryType;

    public Number bufferedAmount;

    public String extensions;

    public Function1<CloseEvent, Object> onclose;

    public Function1<Event, Object> onerror;

    public Function1<MessageEvent, Object> onmessage;

    public Function1<Event, Object> onopen;

    public String protocol;

    public Number readyState;

    public String url;

    /*
        Methods
    */
    public native void close();
    public native void close(@DoNotAutobox Number code /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@702809
     */
    public native void close(@DoNotAutobox Number code /* optional */, String reason /* optional */);
    @JsProperty(name = "binaryType")
    public native String getBinaryType();
    @JsProperty(name = "bufferedAmount")
    public native Number getBufferedAmount();
    @JsProperty(name = "CLOSED")
    public native Number getCLOSED();
    @JsProperty(name = "CLOSING")
    public native Number getCLOSING();
    @JsProperty(name = "CONNECTING")
    public native Number getCONNECTING();
    @JsProperty(name = "extensions")
    public native String getExtensions();
    @JsProperty(name = "OPEN")
    public native Number getOPEN();
    @JsProperty(name = "onclose")
    public native Function1<CloseEvent, Object> getOnclose();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onmessage")
    public native Function1<MessageEvent, Object> getOnmessage();
    @JsProperty(name = "onopen")
    public native Function1<Event, Object> getOnopen();
    @JsProperty(name = "protocol")
    public native String getProtocol();
    @JsProperty(name = "readyState")
    public native Number getReadyState();
    @JsProperty(name = "url")
    public native String getUrl();
    /** 
      * tsd/browser/lib.es6.d.ts@702858
     */
    public native void send(Object data);
    @JsProperty(name = "binaryType")
    public native void setBinaryType(String value);
    @JsProperty(name = "bufferedAmount")
    public native void setBufferedAmount(@DoNotAutobox Number value);
    @JsProperty(name = "CLOSED")
    public native void setCLOSED(@DoNotAutobox Number value);
    @JsProperty(name = "CLOSING")
    public native void setCLOSING(@DoNotAutobox Number value);
    @JsProperty(name = "CONNECTING")
    public native void setCONNECTING(@DoNotAutobox Number value);
    @JsProperty(name = "extensions")
    public native void setExtensions(String value);
    @JsProperty(name = "OPEN")
    public native void setOPEN(@DoNotAutobox Number value);
    @JsProperty(name = "onclose")
    public native void setOnclose(Function1<CloseEvent, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onmessage")
    public native void setOnmessage(Function1<MessageEvent, Object> value);
    @JsProperty(name = "onopen")
    public native void setOnopen(Function1<Event, Object> value);
    @JsProperty(name = "protocol")
    public native void setProtocol(String value);
    @JsProperty(name = "readyState")
    public native void setReadyState(@DoNotAutobox Number value);
    @JsProperty(name = "url")
    public native void setUrl(String value);
}
