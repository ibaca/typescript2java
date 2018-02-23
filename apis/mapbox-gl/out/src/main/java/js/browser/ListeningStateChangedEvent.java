package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ListeningStateChangedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 499621
  * declared in: tsd/browser/lib.es6.d.ts at pos 499746
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ListeningStateChangedEvent")
public class ListeningStateChangedEvent extends Event 
{

    /*
        Constructors
    */
    public ListeningStateChangedEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String label;

    public String state;

    /*
        Methods
    */
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "state")
    public native String getState();
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "state")
    public native void setState(String value);
}
