package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGTransform
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 634183
  * declared in: tsd/browser/lib.es6.d.ts at pos 634875
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGTransform")
public class SVGTransform
{

    /*
        Constructors
    */
    public SVGTransform () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_MATRIX")
    public static Number SVG_TRANSFORM_MATRIX;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_ROTATE")
    public static Number SVG_TRANSFORM_ROTATE;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_SCALE")
    public static Number SVG_TRANSFORM_SCALE;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_SKEWX")
    public static Number SVG_TRANSFORM_SKEWX;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_SKEWY")
    public static Number SVG_TRANSFORM_SKEWY;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_TRANSLATE")
    public static Number SVG_TRANSFORM_TRANSLATE;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_UNKNOWN")
    public static Number SVG_TRANSFORM_UNKNOWN;

    /*
        Properties
    */

    public Number angle;

    public SVGMatrix matrix;

    public Number type;

    /*
        Methods
    */
    @JsProperty(name = "angle")
    public native Number getAngle();
    @JsProperty(name = "matrix")
    public native SVGMatrix getMatrix();
    @JsProperty(name = "SVG_TRANSFORM_MATRIX")
    public native Number getSVG_TRANSFORM_MATRIX();
    @JsProperty(name = "SVG_TRANSFORM_ROTATE")
    public native Number getSVG_TRANSFORM_ROTATE();
    @JsProperty(name = "SVG_TRANSFORM_SCALE")
    public native Number getSVG_TRANSFORM_SCALE();
    @JsProperty(name = "SVG_TRANSFORM_SKEWX")
    public native Number getSVG_TRANSFORM_SKEWX();
    @JsProperty(name = "SVG_TRANSFORM_SKEWY")
    public native Number getSVG_TRANSFORM_SKEWY();
    @JsProperty(name = "SVG_TRANSFORM_TRANSLATE")
    public native Number getSVG_TRANSFORM_TRANSLATE();
    @JsProperty(name = "SVG_TRANSFORM_UNKNOWN")
    public native Number getSVG_TRANSFORM_UNKNOWN();
    @JsProperty(name = "type")
    public native Number getType();
    @JsProperty(name = "angle")
    public native void setAngle(@DoNotAutobox Number value);
    @JsProperty(name = "matrix")
    public native void setMatrix(SVGMatrix value);
    /** 
      * tsd/browser/lib.es6.d.ts@634341
     */
    public native void setRotate(@DoNotAutobox Number angle, @DoNotAutobox Number cx, @DoNotAutobox Number cy);
    @JsProperty(name = "SVG_TRANSFORM_MATRIX")
    public native void setSVG_TRANSFORM_MATRIX(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TRANSFORM_ROTATE")
    public native void setSVG_TRANSFORM_ROTATE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TRANSFORM_SCALE")
    public native void setSVG_TRANSFORM_SCALE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TRANSFORM_SKEWX")
    public native void setSVG_TRANSFORM_SKEWX(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TRANSFORM_SKEWY")
    public native void setSVG_TRANSFORM_SKEWY(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TRANSFORM_TRANSLATE")
    public native void setSVG_TRANSFORM_TRANSLATE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TRANSFORM_UNKNOWN")
    public native void setSVG_TRANSFORM_UNKNOWN(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@634401
     */
    public native void setScale(@DoNotAutobox Number sx, @DoNotAutobox Number sy);
    /** 
      * tsd/browser/lib.es6.d.ts@634445
     */
    public native void setSkewX(@DoNotAutobox Number angle);
    /** 
      * tsd/browser/lib.es6.d.ts@634480
     */
    public native void setSkewY(@DoNotAutobox Number angle);
    /** 
      * tsd/browser/lib.es6.d.ts@634515
     */
    public native void setTranslate(@DoNotAutobox Number tx, @DoNotAutobox Number ty);
    @JsProperty(name = "type")
    public native void setType(@DoNotAutobox Number value);
}
