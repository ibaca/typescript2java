package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ANGLE_instanced_arrays
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 282230
  * declared in: tsd/browser/lib.es6.d.ts at pos 282620
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ANGLE_instanced_arrays")
public class ANGLE_instanced_arrays
{

    /*
        Constructors
    */
    public ANGLE_instanced_arrays () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="ANGLE_instanced_arrays", name="VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE")
    public static Number VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE;

    /*
        Properties
    */

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@282271
     */
    public native void drawArraysInstancedANGLE(@DoNotAutobox Number mode, @DoNotAutobox Number first, @DoNotAutobox Number count, @DoNotAutobox Number primcount);
    /** 
      * tsd/browser/lib.es6.d.ts@282370
     */
    public native void drawElementsInstancedANGLE(@DoNotAutobox Number mode, @DoNotAutobox Number count, @DoNotAutobox Number type, @DoNotAutobox Number offset, @DoNotAutobox Number primcount);
    @JsProperty(name = "VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE")
    public native Number getVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE();
    @JsProperty(name = "VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE")
    public native void setVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@282486
     */
    public native void vertexAttribDivisorANGLE(@DoNotAutobox Number index, @DoNotAutobox Number divisor);
}
