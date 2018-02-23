package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint;
import js.browser.AnonymousType716;
import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".PopupOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 12351

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PopupOptions
{

    /*
        Properties
    */

    public String anchor;

    public Boolean closeButton;

    public Boolean closeOnClick;

    public UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint offset;

    /*
        Methods
    */
    @JsProperty(name = "anchor")
    public native String getAnchor();
    @JsProperty(name = "closeButton")
    public native Boolean getCloseButton();
    @JsProperty(name = "closeOnClick")
    public native Boolean getCloseOnClick();
    @JsProperty(name = "offset")
    public native UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint getOffset();
    @JsProperty(name = "anchor")
    public native void setAnchor(String value);
    @JsProperty(name = "closeButton")
    public native void setCloseButton(Boolean value);
    @JsProperty(name = "closeOnClick")
    public native void setCloseOnClick(Boolean value);
    @JsProperty(name = "offset")
    public native void setOffset(@DoNotAutobox Number value);
    @JsProperty(name = "offset")
    public native void setOffset(Point value);
    @JsProperty(name = "offset")
    public native void setOffset(Array<Number> value);
    @JsProperty(name = "offset")
    public native void setOffset(AnonymousType716 value);
    @JsProperty(name = "offset")
    public native void setOffset(UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint value);
}
