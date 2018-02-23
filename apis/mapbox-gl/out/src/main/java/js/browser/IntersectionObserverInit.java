package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IntersectionObserverInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 259669

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IntersectionObserverInit
{

    /*
        Properties
    */

    public Element root;

    public String rootMargin;

    public UnionOfArrayOfNumberAndNumber threshold;

    /*
        Methods
    */
    @JsProperty(name = "root")
    public native Element getRoot();
    @JsProperty(name = "rootMargin")
    public native String getRootMargin();
    @JsProperty(name = "threshold")
    public native UnionOfArrayOfNumberAndNumber getThreshold();
    @JsProperty(name = "root")
    public native void setRoot(Element value);
    @JsProperty(name = "rootMargin")
    public native void setRootMargin(String value);
    @JsProperty(name = "threshold")
    public native void setThreshold(@DoNotAutobox Number value);
    @JsProperty(name = "threshold")
    public native void setThreshold(Array<Number> value);
    @JsProperty(name = "threshold")
    public native void setThreshold(UnionOfArrayOfNumberAndNumber value);
}
