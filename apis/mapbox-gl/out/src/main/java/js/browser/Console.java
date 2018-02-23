package js.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: Console
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 316764
  * declared in: tsd/browser/lib.es6.d.ts at pos 317801
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Console")
public class Console
{

    /*
        Constructors
    */
    public Console () {
    } 

    /*
        Methods
    */
    @JsMethod(name = "assert")
    public native void assert_();
    @JsMethod(name = "assert")
    public native void assert_(Boolean test /* optional */);
    @JsMethod(name = "assert")
    public native void assert_(Boolean test /* optional */, String message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@316790
     */
    @JsMethod(name = "assert")
    public native void assert_(Boolean test /* optional */, String message /* optional */, Object...  optionalParams);
    /** 
      * tsd/browser/lib.es6.d.ts@316868
     */
    public native void clear();
    public native void count();
    /** 
      * tsd/browser/lib.es6.d.ts@316887
     */
    public native void count(String countTitle /* optional */);
    public native void debug();
    public native void debug(Object message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@316925
     */
    public native void debug(Object message /* optional */, Object...  optionalParams);
    public native void dir();
    public native void dir(Object value /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@316983
     */
    public native void dir(Object value /* optional */, Object...  optionalParams);
    /** 
      * tsd/browser/lib.es6.d.ts@317037
     */
    public native void dirxml(Object value);
    public native void error();
    public native void error(Object message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@317067
     */
    public native void error(Object message /* optional */, Object...  optionalParams);
    public native void exception();
    public native void exception(String message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@317125
     */
    public native void exception(String message /* optional */, Object...  optionalParams);
    public native void group();
    /** 
      * tsd/browser/lib.es6.d.ts@317190
     */
    public native void group(String groupTitle /* optional */);
    public native void groupCollapsed();
    /** 
      * tsd/browser/lib.es6.d.ts@317228
     */
    public native void groupCollapsed(String groupTitle /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@317275
     */
    public native void groupEnd();
    public native void info();
    public native void info(Object message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@317297
     */
    public native void info(Object message /* optional */, Object...  optionalParams);
    public native void log();
    public native void log(Object message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@317354
     */
    public native void log(Object message /* optional */, Object...  optionalParams);
    /** 
      * tsd/browser/lib.es6.d.ts@317410
     */
    public native Boolean msIsIndependentlyComposed(Element element);
    public native void profile();
    /** 
      * tsd/browser/lib.es6.d.ts@317468
     */
    public native void profile(String reportName /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@317508
     */
    public native void profileEnd();
    /** 
      * tsd/browser/lib.es6.d.ts@317532
     */
    public native void select(Element element);
    public native void table();
    /** 
      * tsd/browser/lib.es6.d.ts@317568
     */
    public native void table(Object...  data);
    public native void time();
    /** 
      * tsd/browser/lib.es6.d.ts@317601
     */
    public native void time(String timerName /* optional */);
    public native void timeEnd();
    /** 
      * tsd/browser/lib.es6.d.ts@317637
     */
    public native void timeEnd(String timerName /* optional */);
    public native void trace();
    public native void trace(Object message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@317676
     */
    public native void trace(Object message /* optional */, Object...  optionalParams);
    public native void warn();
    public native void warn(Object message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@317734
     */
    public native void warn(Object message /* optional */, Object...  optionalParams);
}
