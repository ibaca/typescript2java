package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IntersectionObserverEntryInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 259479

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IntersectionObserverEntryInit
{

    /*
        Properties
    */

    public DOMRectInit boundingClientRect;

    public DOMRectInit intersectionRect;

    public DOMRectInit rootBounds;

    public Element target;

    public Number time;

    /*
        Methods
    */
    @JsProperty(name = "boundingClientRect")
    public native DOMRectInit getBoundingClientRect();
    @JsProperty(name = "intersectionRect")
    public native DOMRectInit getIntersectionRect();
    @JsProperty(name = "rootBounds")
    public native DOMRectInit getRootBounds();
    @JsProperty(name = "target")
    public native Element getTarget();
    @JsProperty(name = "time")
    public native Number getTime();
    @JsProperty(name = "boundingClientRect")
    public native void setBoundingClientRect(DOMRectInit value);
    @JsProperty(name = "intersectionRect")
    public native void setIntersectionRect(DOMRectInit value);
    @JsProperty(name = "rootBounds")
    public native void setRootBounds(DOMRectInit value);
    @JsProperty(name = "target")
    public native void setTarget(Element value);
    @JsProperty(name = "time")
    public native void setTime(@DoNotAutobox Number value);
}
