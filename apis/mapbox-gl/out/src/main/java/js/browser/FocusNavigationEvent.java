package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: FocusNavigationEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 375823
  * declared in: tsd/browser/lib.es6.d.ts at pos 376085
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FocusNavigationEvent")
public class FocusNavigationEvent extends Event 
{

    /*
        Constructors
    */
    public FocusNavigationEvent (String type, FocusNavigationEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public FocusNavigationEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String navigationReason;

    public Number originHeight;

    public Number originLeft;

    public Number originTop;

    public Number originWidth;

    /*
        Methods
    */
    @JsProperty(name = "navigationReason")
    public native String getNavigationReason();
    @JsProperty(name = "originHeight")
    public native Number getOriginHeight();
    @JsProperty(name = "originLeft")
    public native Number getOriginLeft();
    @JsProperty(name = "originTop")
    public native Number getOriginTop();
    @JsProperty(name = "originWidth")
    public native Number getOriginWidth();
    /** 
      * tsd/browser/lib.es6.d.ts@376049
     */
    public native void requestFocus();
    @JsProperty(name = "navigationReason")
    public native void setNavigationReason(String value);
    @JsProperty(name = "originHeight")
    public native void setOriginHeight(@DoNotAutobox Number value);
    @JsProperty(name = "originLeft")
    public native void setOriginLeft(@DoNotAutobox Number value);
    @JsProperty(name = "originTop")
    public native void setOriginTop(@DoNotAutobox Number value);
    @JsProperty(name = "originWidth")
    public native void setOriginWidth(@DoNotAutobox Number value);
}
