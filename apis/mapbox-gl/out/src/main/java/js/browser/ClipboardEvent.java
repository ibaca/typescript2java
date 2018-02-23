package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ClipboardEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 315604
  * declared in: tsd/browser/lib.es6.d.ts at pos 315703
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ClipboardEvent")
public class ClipboardEvent extends Event 
{

    /*
        Constructors
    */
    public ClipboardEvent (String type, ClipboardEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public ClipboardEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public DataTransfer clipboardData;

    /*
        Methods
    */
    @JsProperty(name = "clipboardData")
    public native DataTransfer getClipboardData();
    @JsProperty(name = "clipboardData")
    public native void setClipboardData(DataTransfer value);
}
