package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaEncryptedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 517379
  * declared in: tsd/browser/lib.es6.d.ts at pos 517519
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaEncryptedEvent")
public class MediaEncryptedEvent extends Event 
{

    /*
        Constructors
    */
    public MediaEncryptedEvent (String type, MediaEncryptedEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public MediaEncryptedEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public ArrayBuffer initData;

    public String initDataType;

    /*
        Methods
    */
    @JsProperty(name = "initData")
    public native ArrayBuffer getInitData();
    @JsProperty(name = "initDataType")
    public native String getInitDataType();
    @JsProperty(name = "initData")
    public native void setInitData(ArrayBuffer value);
    @JsProperty(name = "initDataType")
    public native void setInitDataType(String value);
}
