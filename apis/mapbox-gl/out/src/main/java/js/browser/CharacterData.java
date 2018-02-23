package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CharacterData
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 314696
  * declared in: tsd/browser/lib.es6.d.ts at pos 315073
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CharacterData")
public class CharacterData extends Node  implements ChildNode 
{

    /*
        Constructors
    */
    public CharacterData () {
    } 

    /*
        Properties
    */

    public String data;

    public int length;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@314799
     */
    public native void appendData(String arg);
    /** 
      * tsd/browser/lib.es6.d.ts@314834
     */
    public native void deleteData(@DoNotAutobox Number offset, @DoNotAutobox Number count);
    @JsProperty(name = "data")
    public native String getData();
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@314887
     */
    public native void insertData(@DoNotAutobox Number offset, String arg);
    /** 
      * tsd/browser/lib.es6.d.ts@723950
      * inherited from (js.browser.ChildNode)
      * inherited from (js.browser.ChildNode)
      * inherited from (js.browser.ChildNode)
     */
    public native void remove();
    /** 
      * tsd/browser/lib.es6.d.ts@314938
     */
    public native void replaceData(@DoNotAutobox Number offset, @DoNotAutobox Number count, String arg);
    @JsProperty(name = "data")
    public native void setData(String value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@315005
     */
    public native String substringData(@DoNotAutobox Number offset, @DoNotAutobox Number count);
}
