package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextStreamBase
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 776586
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface TextStreamBase
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@777081
      * Closes a text stream.
      * It is not necessary to close standard streams; they close automatically when the process ends. If 
      * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    void Close();
    /** 
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    @JsProperty(name = "Column")
    Number getColumn();
    /** 
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    @JsProperty(name = "Line")
    Number getLine();
    /** 
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    @JsProperty(name = "Column")
    void setColumn(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    @JsProperty(name = "Line")
    void setLine(@DoNotAutobox Number value);
}
