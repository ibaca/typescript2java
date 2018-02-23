package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSSiteModeEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 513495
  * declared in: tsd/browser/lib.es6.d.ts at pos 513616
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSSiteModeEvent")
public class MSSiteModeEvent extends Event 
{

    /*
        Constructors
    */
    public MSSiteModeEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String actionURL;

    public Number buttonID;

    /*
        Methods
    */
    @JsProperty(name = "actionURL")
    public native String getActionURL();
    @JsProperty(name = "buttonID")
    public native Number getButtonID();
    @JsProperty(name = "actionURL")
    public native void setActionURL(String value);
    @JsProperty(name = "buttonID")
    public native void setButtonID(@DoNotAutobox Number value);
}
