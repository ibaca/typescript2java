package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: StorageEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 648622
  * declared in: tsd/browser/lib.es6.d.ts at pos 648794
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StorageEvent")
public class StorageEvent extends Event 
{

    /*
        Constructors
    */
    public StorageEvent (String type, StorageEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public StorageEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String key;

    public String newValue;

    public String oldValue;

    public Storage storageArea;

    public String url;

    /*
        Methods
    */
    @JsProperty(name = "key")
    public native String getKey();
    @JsProperty(name = "newValue")
    public native String getNewValue();
    @JsProperty(name = "oldValue")
    public native String getOldValue();
    @JsProperty(name = "storageArea")
    public native Storage getStorageArea();
    @JsProperty(name = "url")
    public native String getUrl();
    @JsProperty(name = "key")
    public native void setKey(String value);
    @JsProperty(name = "newValue")
    public native void setNewValue(String value);
    @JsProperty(name = "oldValue")
    public native void setOldValue(String value);
    @JsProperty(name = "storageArea")
    public native void setStorageArea(Storage value);
    @JsProperty(name = "url")
    public native void setUrl(String value);
}
