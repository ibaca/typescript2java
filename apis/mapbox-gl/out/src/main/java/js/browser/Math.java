package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Math
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 21078
  * declared in: tsd/browser/lib.es6.d.ts at pos 25081
  * declared in: tsd/browser/lib.es6.d.ts at pos 198677
  * declared in: tsd/browser/lib.es6.d.ts at pos 248440

  * An intrinsic object that provides basic mathematics functionality and constants. 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Math
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@22070
      * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
      * For example, the absolute value of -5 is the same as the absolute value of 5.
     */
    Number abs(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@22218
      * Returns the arc cosine (or inverse cosine) of a number.
     */
    Number acos(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@200576
      * Returns the inverse hyperbolic cosine of a number.
     */
    Number acosh(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@22344
      * Returns the arcsine of a number.
     */
    Number asin(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@200763
      * Returns the inverse hyperbolic sine of a number.
     */
    Number asinh(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@22508
      * Returns the arctangent of a number.
     */
    Number atan(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@22779
      * Returns the angle (in radians) from the X axis to a point.
     */
    Number atan2(@DoNotAutobox Number y, @DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@200953
      * Returns the inverse hyperbolic tangent of a number.
     */
    Number atanh(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@202061
      * Returns an implementation-dependent approximation to the cube root of number.
     */
    Number cbrt(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@22959
      * Returns the smallest number greater than or equal to its numeric argument.
     */
    Number ceil(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@198853
      * Returns the number of leading zero bits in the 32-bit binary representation of a number.
     */
    Number clz32(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@23127
      * Returns the cosine of a number.
     */
    Number cos(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@200029
      * Returns the hyperbolic cosine of a number.
     */
    Number cosh(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@23309
      * Returns e (the base of natural logarithms) raised to a power.
     */
    Number exp(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@199848
      * Returns the result of (e^x - 1) of x (e raised to the power of x, where e is the base of
      * the natural logarithms).
     */
    Number expm1(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@23473
      * Returns the greatest number less than or equal to its numeric argument.
     */
    Number floor(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@201887
      * Returns the nearest single precision float representation of a number.
     */
    Number fround(@DoNotAutobox Number x);
    @JsProperty(name = "E")
    Number getE();
    @JsProperty(name = "LN10")
    Number getLN10();
    @JsProperty(name = "LN2")
    Number getLN2();
    @JsProperty(name = "LOG10E")
    Number getLOG10E();
    @JsProperty(name = "LOG2E")
    Number getLOG2E();
    @JsProperty(name = "PI")
    Number getPI();
    @JsProperty(name = "SQRT1_2")
    Number getSQRT1_2();
    @JsProperty(name = "SQRT2")
    Number getSQRT2();
    // skipped method get___at_toStringTag
    Number hypot();
    /** 
      * tsd/browser/lib.es6.d.ts@201472
      * Returns the square root of the sum of squares of its arguments.
     */
    Number hypot(@DoNotAutobox Number...  values);
    /** 
      * tsd/browser/lib.es6.d.ts@199030
      * Returns the result of 32-bit multiplication of two numbers.
     */
    Number imul(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@23619
      * Returns the natural logarithm (base e) of a number.
     */
    Number log(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@199360
      * Returns the base 10 logarithm of a number.
     */
    Number log10(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@199631
      * Returns the natural logarithm of 1 + x.
     */
    Number log1p(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@199497
      * Returns the base 2 logarithm of a number.
     */
    Number log2(@DoNotAutobox Number x);
    Number max();
    /** 
      * tsd/browser/lib.es6.d.ts@23792
      * Returns the larger of a set of supplied numeric expressions.
     */
    Number max(@DoNotAutobox Number...  values);
    Number min();
    /** 
      * tsd/browser/lib.es6.d.ts@23976
      * Returns the smaller of a set of supplied numeric expressions.
     */
    Number min(@DoNotAutobox Number...  values);
    /** 
      * tsd/browser/lib.es6.d.ts@24212
      * Returns the value of a base expression taken to a specified power.
     */
    Number pow(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@24309
      * Returns a pseudorandom number between 0 and 1. 
     */
    Number random();
    /** 
      * tsd/browser/lib.es6.d.ts@24489
      * Returns a supplied numeric expression rounded to the nearest number.
     */
    Number round(@DoNotAutobox Number x);
    @JsProperty(name = "E")
    void setE(@DoNotAutobox Number value);
    @JsProperty(name = "LN10")
    void setLN10(@DoNotAutobox Number value);
    @JsProperty(name = "LN2")
    void setLN2(@DoNotAutobox Number value);
    @JsProperty(name = "LOG10E")
    void setLOG10E(@DoNotAutobox Number value);
    @JsProperty(name = "LOG2E")
    void setLOG2E(@DoNotAutobox Number value);
    @JsProperty(name = "PI")
    void setPI(@DoNotAutobox Number value);
    @JsProperty(name = "SQRT1_2")
    void setSQRT1_2(@DoNotAutobox Number value);
    @JsProperty(name = "SQRT2")
    void setSQRT2(@DoNotAutobox Number value);
    // skipped method set___at_toStringTag
    /** 
      * tsd/browser/lib.es6.d.ts@199223
      * Returns the sign of the x, indicating whether x is positive, negative or zero.
     */
    Number sign(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@24656
      * Returns the sine of a number.
     */
    Number sin(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@200207
      * Returns the hyperbolic sine of a number.
     */
    Number sinh(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@24785
      * Returns the square root of a number.
     */
    Number sqrt(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@24954
      * Returns the tangent of a number.
     */
    Number tan(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@200388
      * Returns the hyperbolic tangent of a number.
     */
    Number tanh(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@201721
      * Returns the integral part of the a numeric expression, x, removing any fractional digits.
      * If x is already an integer, the result is x.
     */
    Number trunc(@DoNotAutobox Number x);
}
