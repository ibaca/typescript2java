package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScriptNotifyEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 639290
  * declared in: tsd/browser/lib.es6.d.ts at pos 639411
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScriptNotifyEvent")
public class ScriptNotifyEvent extends Event 
{

    /*
        Constructors
    */
    public ScriptNotifyEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String callingUri;

    public String value;

    /*
        Methods
    */
    @JsProperty(name = "callingUri")
    public native String getCallingUri();
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "callingUri")
    public native void setCallingUri(String value);
    @JsProperty(name = "value")
    public native void setValue(String value);
}
