package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: OverflowEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 539694
  * declared in: tsd/browser/lib.es6.d.ts at pos 539954
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OverflowEvent")
public class OverflowEvent extends UIEvent 
{

    /*
        Constructors
    */
    public OverflowEvent () {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="OverflowEvent", name="BOTH")
    public static Number BOTH;

    @JsProperty(namespace="OverflowEvent", name="HORIZONTAL")
    public static Number HORIZONTAL;

    @JsProperty(namespace="OverflowEvent", name="VERTICAL")
    public static Number VERTICAL;

    /*
        Properties
    */

    public Boolean horizontalOverflow;

    public Number orient;

    public Boolean verticalOverflow;

    /*
        Methods
    */
    @JsProperty(name = "BOTH")
    public native Number getBOTH();
    @JsProperty(name = "HORIZONTAL")
    public native Number getHORIZONTAL();
    @JsProperty(name = "horizontalOverflow")
    public native Boolean getHorizontalOverflow();
    @JsProperty(name = "orient")
    public native Number getOrient();
    @JsProperty(name = "VERTICAL")
    public native Number getVERTICAL();
    @JsProperty(name = "verticalOverflow")
    public native Boolean getVerticalOverflow();
    @JsProperty(name = "BOTH")
    public native void setBOTH(@DoNotAutobox Number value);
    @JsProperty(name = "HORIZONTAL")
    public native void setHORIZONTAL(@DoNotAutobox Number value);
    @JsProperty(name = "horizontalOverflow")
    public native void setHorizontalOverflow(Boolean value);
    @JsProperty(name = "orient")
    public native void setOrient(@DoNotAutobox Number value);
    @JsProperty(name = "VERTICAL")
    public native void setVERTICAL(@DoNotAutobox Number value);
    @JsProperty(name = "verticalOverflow")
    public native void setVerticalOverflow(Boolean value);
}
