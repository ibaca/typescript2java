package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TouchEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 658441
  * declared in: tsd/browser/lib.es6.d.ts at pos 658821
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TouchEvent")
public class TouchEvent extends UIEvent 
{

    /*
        Constructors
    */
    public TouchEvent () {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Properties
    */

    public Boolean altKey;

    public TouchList changedTouches;

    public Number charCode;

    public Boolean ctrlKey;

    public Number keyCode;

    public Boolean metaKey;

    public Boolean shiftKey;

    public TouchList targetTouches;

    public TouchList touches;

    public Number which;

    /*
        Methods
    */
    @JsProperty(name = "altKey")
    public native Boolean getAltKey();
    @JsProperty(name = "changedTouches")
    public native TouchList getChangedTouches();
    @JsProperty(name = "charCode")
    public native Number getCharCode();
    @JsProperty(name = "ctrlKey")
    public native Boolean getCtrlKey();
    @JsProperty(name = "keyCode")
    public native Number getKeyCode();
    @JsProperty(name = "metaKey")
    public native Boolean getMetaKey();
    @JsProperty(name = "shiftKey")
    public native Boolean getShiftKey();
    @JsProperty(name = "targetTouches")
    public native TouchList getTargetTouches();
    @JsProperty(name = "touches")
    public native TouchList getTouches();
    @JsProperty(name = "which")
    public native Number getWhich();
    @JsProperty(name = "altKey")
    public native void setAltKey(Boolean value);
    @JsProperty(name = "changedTouches")
    public native void setChangedTouches(TouchList value);
    @JsProperty(name = "charCode")
    public native void setCharCode(@DoNotAutobox Number value);
    @JsProperty(name = "ctrlKey")
    public native void setCtrlKey(Boolean value);
    @JsProperty(name = "keyCode")
    public native void setKeyCode(@DoNotAutobox Number value);
    @JsProperty(name = "metaKey")
    public native void setMetaKey(Boolean value);
    @JsProperty(name = "shiftKey")
    public native void setShiftKey(Boolean value);
    @JsProperty(name = "targetTouches")
    public native void setTargetTouches(TouchList value);
    @JsProperty(name = "touches")
    public native void setTouches(TouchList value);
    @JsProperty(name = "which")
    public native void setWhich(@DoNotAutobox Number value);
}
