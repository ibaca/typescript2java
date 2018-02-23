package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ServiceWorkerMessageEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 643004
  * declared in: tsd/browser/lib.es6.d.ts at pos 643258
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerMessageEvent")
public class ServiceWorkerMessageEvent extends Event 
{

    /*
        Constructors
    */
    public ServiceWorkerMessageEvent (String type, ServiceWorkerMessageEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public ServiceWorkerMessageEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Object data;

    public String lastEventId;

    public String origin;

    public Array<MessagePort> ports;

    public UnionOfMessagePortAndServiceWorker source;

    /*
        Methods
    */
    @JsProperty(name = "data")
    public native Object getData();
    @JsProperty(name = "lastEventId")
    public native String getLastEventId();
    @JsProperty(name = "origin")
    public native String getOrigin();
    @JsProperty(name = "ports")
    public native Array<MessagePort> getPorts();
    @JsProperty(name = "source")
    public native UnionOfMessagePortAndServiceWorker getSource();
    @JsProperty(name = "data")
    public native void setData(Object value);
    @JsProperty(name = "lastEventId")
    public native void setLastEventId(String value);
    @JsProperty(name = "origin")
    public native void setOrigin(String value);
    @JsProperty(name = "ports")
    public native void setPorts(Array<MessagePort> value);
    @JsProperty(name = "source")
    public native void setSource(MessagePort value);
    @JsProperty(name = "source")
    public native void setSource(ServiceWorker value);
    @JsProperty(name = "source")
    public native void setSource(UnionOfMessagePortAndServiceWorker value);
}
