package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Range
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 566080
  * declared in: tsd/browser/lib.es6.d.ts at pos 567350
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Range")
public class Range
{

    /*
        Constructors
    */
    public Range () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="Range", name="END_TO_END")
    public static Number END_TO_END;

    @JsProperty(namespace="Range", name="END_TO_START")
    public static Number END_TO_START;

    @JsProperty(namespace="Range", name="START_TO_END")
    public static Number START_TO_END;

    @JsProperty(namespace="Range", name="START_TO_START")
    public static Number START_TO_START;

    /*
        Properties
    */

    public Boolean collapsed;

    public Node commonAncestorContainer;

    public Node endContainer;

    public Number endOffset;

    public Node startContainer;

    public Number startOffset;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@566315
     */
    public native DocumentFragment cloneContents();
    /** 
      * tsd/browser/lib.es6.d.ts@566354
     */
    public native Range cloneRange();
    /** 
      * tsd/browser/lib.es6.d.ts@566379
     */
    public native void collapse(Boolean toStart);
    /** 
      * tsd/browser/lib.es6.d.ts@566417
     */
    public native Number compareBoundaryPoints(@DoNotAutobox Number how, Range sourceRange);
    /** 
      * tsd/browser/lib.es6.d.ts@566485
     */
    public native DocumentFragment createContextualFragment(String fragment);
    /** 
      * tsd/browser/lib.es6.d.ts@566551
     */
    public native void deleteContents();
    /** 
      * tsd/browser/lib.es6.d.ts@566579
     */
    public native void detach();
    /** 
      * tsd/browser/lib.es6.d.ts@566599
     */
    public native Boolean expand(String Unit);
    /** 
      * tsd/browser/lib.es6.d.ts@566634
     */
    public native DocumentFragment extractContents();
    /** 
      * tsd/browser/lib.es6.d.ts@566675
     */
    public native ClientRect getBoundingClientRect();
    /** 
      * tsd/browser/lib.es6.d.ts@566716
     */
    public native ClientRectList getClientRects();
    @JsProperty(name = "collapsed")
    public native Boolean getCollapsed();
    @JsProperty(name = "commonAncestorContainer")
    public native Node getCommonAncestorContainer();
    @JsProperty(name = "END_TO_END")
    public native Number getEND_TO_END();
    @JsProperty(name = "END_TO_START")
    public native Number getEND_TO_START();
    @JsProperty(name = "endContainer")
    public native Node getEndContainer();
    @JsProperty(name = "endOffset")
    public native Number getEndOffset();
    @JsProperty(name = "START_TO_END")
    public native Number getSTART_TO_END();
    @JsProperty(name = "START_TO_START")
    public native Number getSTART_TO_START();
    @JsProperty(name = "startContainer")
    public native Node getStartContainer();
    @JsProperty(name = "startOffset")
    public native Number getStartOffset();
    /** 
      * tsd/browser/lib.es6.d.ts@566754
     */
    public native void insertNode(Node newNode);
    /** 
      * tsd/browser/lib.es6.d.ts@566791
     */
    public native void selectNode(Node refNode);
    /** 
      * tsd/browser/lib.es6.d.ts@566828
     */
    public native void selectNodeContents(Node refNode);
    @JsProperty(name = "collapsed")
    public native void setCollapsed(Boolean value);
    @JsProperty(name = "commonAncestorContainer")
    public native void setCommonAncestorContainer(Node value);
    @JsProperty(name = "END_TO_END")
    public native void setEND_TO_END(@DoNotAutobox Number value);
    @JsProperty(name = "END_TO_START")
    public native void setEND_TO_START(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@566873
     */
    public native void setEnd(Node refNode, @DoNotAutobox Number offset);
    /** 
      * tsd/browser/lib.es6.d.ts@566922
     */
    public native void setEndAfter(Node refNode);
    /** 
      * tsd/browser/lib.es6.d.ts@566960
     */
    public native void setEndBefore(Node refNode);
    @JsProperty(name = "endContainer")
    public native void setEndContainer(Node value);
    @JsProperty(name = "endOffset")
    public native void setEndOffset(@DoNotAutobox Number value);
    @JsProperty(name = "START_TO_END")
    public native void setSTART_TO_END(@DoNotAutobox Number value);
    @JsProperty(name = "START_TO_START")
    public native void setSTART_TO_START(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@566999
     */
    public native void setStart(Node refNode, @DoNotAutobox Number offset);
    /** 
      * tsd/browser/lib.es6.d.ts@567050
     */
    public native void setStartAfter(Node refNode);
    /** 
      * tsd/browser/lib.es6.d.ts@567090
     */
    public native void setStartBefore(Node refNode);
    @JsProperty(name = "startContainer")
    public native void setStartContainer(Node value);
    @JsProperty(name = "startOffset")
    public native void setStartOffset(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@567131
     */
    public native void surroundContents(Node newParent);
}
