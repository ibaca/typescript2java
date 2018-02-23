package js.browser;

import js.PointLike_UnionOfArrayOfNumberAndPoint;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: __type
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 12606

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType716
{

    @JsOverlay
    public final void setByIndex(String index, PointLike_UnionOfArrayOfNumberAndPoint value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final PointLike_UnionOfArrayOfNumberAndPoint getByIndex(String index) {
        return (PointLike_UnionOfArrayOfNumberAndPoint) Js.asPropertyMap(this).get(index);
    }
}
