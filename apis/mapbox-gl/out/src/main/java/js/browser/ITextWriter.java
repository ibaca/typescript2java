package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: ITextWriter
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 776480

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ITextWriter
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@776570
     */
    public native void Close();
    /** 
      * tsd/browser/lib.es6.d.ts@776510
     */
    public native void Write(String s);
    /** 
      * tsd/browser/lib.es6.d.ts@776538
     */
    public native void WriteLine(String s);
}
