package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IntersectionObserverEntry
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 497794
  * declared in: tsd/browser/lib.es6.d.ts at pos 498070
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IntersectionObserverEntry")
public class IntersectionObserverEntry
{

    /*
        Constructors
    */
    public IntersectionObserverEntry (IntersectionObserverEntryInit intersectionObserverEntryInit) {
    } 

    /*
        Properties
    */

    public ClientRect boundingClientRect;

    public Number intersectionRatio;

    public ClientRect intersectionRect;

    public ClientRect rootBounds;

    public Element target;

    public Number time;

    /*
        Methods
    */
    @JsProperty(name = "boundingClientRect")
    public native ClientRect getBoundingClientRect();
    @JsProperty(name = "intersectionRatio")
    public native Number getIntersectionRatio();
    @JsProperty(name = "intersectionRect")
    public native ClientRect getIntersectionRect();
    @JsProperty(name = "rootBounds")
    public native ClientRect getRootBounds();
    @JsProperty(name = "target")
    public native Element getTarget();
    @JsProperty(name = "time")
    public native Number getTime();
    @JsProperty(name = "boundingClientRect")
    public native void setBoundingClientRect(ClientRect value);
    @JsProperty(name = "intersectionRatio")
    public native void setIntersectionRatio(@DoNotAutobox Number value);
    @JsProperty(name = "intersectionRect")
    public native void setIntersectionRect(ClientRect value);
    @JsProperty(name = "rootBounds")
    public native void setRootBounds(ClientRect value);
    @JsProperty(name = "target")
    public native void setTarget(Element value);
    @JsProperty(name = "time")
    public native void setTime(@DoNotAutobox Number value);
}
