package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CanvasRenderingContext2D
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 311571
  * declared in: tsd/browser/lib.es6.d.ts at pos 314278
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CanvasRenderingContext2D")
public class CanvasRenderingContext2D implements CanvasPathMethods 
{

    /*
        Constructors
    */
    public CanvasRenderingContext2D () {
    } 

    /*
        Properties
    */

    public HTMLCanvasElement canvas;

    public UnionOfCanvasGradientAndCanvasPatternAndString fillStyle;

    public String font;

    public Number globalAlpha;

    public String globalCompositeOperation;

    public Boolean imageSmoothingEnabled;

    public String lineCap;

    public Number lineDashOffset;

    public String lineJoin;

    public Number lineWidth;

    public Number miterLimit;

    public Boolean mozImageSmoothingEnabled;

    public String msFillRule;

    public Boolean oImageSmoothingEnabled;

    public Number shadowBlur;

    public String shadowColor;

    public Number shadowOffsetX;

    public Number shadowOffsetY;

    public UnionOfCanvasGradientAndCanvasPatternAndString strokeStyle;

    public String textAlign;

    public String textBaseline;

    public Boolean webkitImageSmoothingEnabled;

    /*
        Methods
    */
    public native void arc(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number radius, @DoNotAutobox Number startAngle, @DoNotAutobox Number endAngle);
    /** 
      * tsd/browser/lib.es6.d.ts@723230
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void arc(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number radius, @DoNotAutobox Number startAngle, @DoNotAutobox Number endAngle, Boolean anticlockwise /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@723346
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void arcTo(@DoNotAutobox Number x1, @DoNotAutobox Number y1, @DoNotAutobox Number x2, @DoNotAutobox Number y2, @DoNotAutobox Number radius);
    /** 
      * tsd/browser/lib.es6.d.ts@312331
     */
    public native void beginPath();
    /** 
      * tsd/browser/lib.es6.d.ts@723427
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void bezierCurveTo(@DoNotAutobox Number cp1x, @DoNotAutobox Number cp1y, @DoNotAutobox Number cp2x, @DoNotAutobox Number cp2y, @DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@312354
     */
    public native void clearRect(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number w, @DoNotAutobox Number h);
    public native void clip();
    /** 
      * tsd/browser/lib.es6.d.ts@312419
     */
    public native void clip(String fillRule /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@723530
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void closePath();
    public native ImageData createImageData(@DoNotAutobox Number imageDataOrSw);
    public native ImageData createImageData(@DoNotAutobox Number imageDataOrSw, @DoNotAutobox Number sh /* optional */);
    public native ImageData createImageData(ImageData imageDataOrSw);
    public native ImageData createImageData(ImageData imageDataOrSw, @DoNotAutobox Number sh /* optional */);
    public native ImageData createImageData(UnionOfImageDataAndNumber imageDataOrSw);
    /** 
      * tsd/browser/lib.es6.d.ts@312454
     */
    public native ImageData createImageData(UnionOfImageDataAndNumber imageDataOrSw, @DoNotAutobox Number sh /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@312534
     */
    public native CanvasGradient createLinearGradient(@DoNotAutobox Number x0, @DoNotAutobox Number y0, @DoNotAutobox Number x1, @DoNotAutobox Number y1);
    public native CanvasPattern createPattern(HTMLCanvasElement image, String repetition);
    public native CanvasPattern createPattern(HTMLImageElement image, String repetition);
    public native CanvasPattern createPattern(HTMLVideoElement image, String repetition);
    /** 
      * tsd/browser/lib.es6.d.ts@312624
     */
    public native CanvasPattern createPattern(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, String repetition);
    /** 
      * tsd/browser/lib.es6.d.ts@312742
     */
    public native CanvasGradient createRadialGradient(@DoNotAutobox Number x0, @DoNotAutobox Number y0, @DoNotAutobox Number r0, @DoNotAutobox Number x1, @DoNotAutobox Number y1, @DoNotAutobox Number r1);
    /** 
      * tsd/browser/lib.es6.d.ts@312856
     */
    public native void drawFocusIfNeeded(Element element);
    public native void drawImage(HTMLCanvasElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY);
    public native void drawImage(HTMLCanvasElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */);
    public native void drawImage(HTMLCanvasElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */);
    public native void drawImage(HTMLCanvasElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */);
    public native void drawImage(HTMLCanvasElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */);
    public native void drawImage(HTMLCanvasElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */, @DoNotAutobox Number canvasImageWidth /* optional */);
    public native void drawImage(HTMLCanvasElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */, @DoNotAutobox Number canvasImageWidth /* optional */, @DoNotAutobox Number canvasImageHeight /* optional */);
    public native void drawImage(HTMLImageElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY);
    public native void drawImage(HTMLImageElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */);
    public native void drawImage(HTMLImageElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */);
    public native void drawImage(HTMLImageElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */);
    public native void drawImage(HTMLImageElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */);
    public native void drawImage(HTMLImageElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */, @DoNotAutobox Number canvasImageWidth /* optional */);
    public native void drawImage(HTMLImageElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */, @DoNotAutobox Number canvasImageWidth /* optional */, @DoNotAutobox Number canvasImageHeight /* optional */);
    public native void drawImage(HTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY);
    public native void drawImage(HTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */);
    public native void drawImage(HTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */);
    public native void drawImage(HTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */);
    public native void drawImage(HTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */);
    public native void drawImage(HTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */, @DoNotAutobox Number canvasImageWidth /* optional */);
    public native void drawImage(HTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */, @DoNotAutobox Number canvasImageWidth /* optional */, @DoNotAutobox Number canvasImageHeight /* optional */);
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY);
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */);
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */);
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */);
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */);
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */, @DoNotAutobox Number canvasImageWidth /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@312903
     */
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, @DoNotAutobox Number offsetX, @DoNotAutobox Number offsetY, @DoNotAutobox Number width /* optional */, @DoNotAutobox Number height /* optional */, @DoNotAutobox Number canvasOffsetX /* optional */, @DoNotAutobox Number canvasOffsetY /* optional */, @DoNotAutobox Number canvasImageWidth /* optional */, @DoNotAutobox Number canvasImageHeight /* optional */);
    public native void ellipse(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number radiusX, @DoNotAutobox Number radiusY, @DoNotAutobox Number rotation, @DoNotAutobox Number startAngle, @DoNotAutobox Number endAngle);
    /** 
      * tsd/browser/lib.es6.d.ts@723553
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void ellipse(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number radiusX, @DoNotAutobox Number radiusY, @DoNotAutobox Number rotation, @DoNotAutobox Number startAngle, @DoNotAutobox Number endAngle, Boolean anticlockwise /* optional */);
    public native void fill();
    /** 
      * tsd/browser/lib.es6.d.ts@313158
     */
    public native void fill(String fillRule /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@313193
     */
    public native void fillRect(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number w, @DoNotAutobox Number h);
    public native void fillText(String text, @DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@313257
     */
    public native void fillText(String text, @DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number maxWidth /* optional */);
    @JsProperty(name = "canvas")
    public native HTMLCanvasElement getCanvas();
    @JsProperty(name = "fillStyle")
    public native UnionOfCanvasGradientAndCanvasPatternAndString getFillStyle();
    @JsProperty(name = "font")
    public native String getFont();
    @JsProperty(name = "globalAlpha")
    public native Number getGlobalAlpha();
    @JsProperty(name = "globalCompositeOperation")
    public native String getGlobalCompositeOperation();
    /** 
      * tsd/browser/lib.es6.d.ts@313332
     */
    public native ImageData getImageData(@DoNotAutobox Number sx, @DoNotAutobox Number sy, @DoNotAutobox Number sw, @DoNotAutobox Number sh);
    @JsProperty(name = "imageSmoothingEnabled")
    public native Boolean getImageSmoothingEnabled();
    @JsProperty(name = "lineCap")
    public native String getLineCap();
    /** 
      * tsd/browser/lib.es6.d.ts@313409
     */
    public native Array<Number> getLineDash();
    @JsProperty(name = "lineDashOffset")
    public native Number getLineDashOffset();
    @JsProperty(name = "lineJoin")
    public native String getLineJoin();
    @JsProperty(name = "lineWidth")
    public native Number getLineWidth();
    @JsProperty(name = "miterLimit")
    public native Number getMiterLimit();
    @JsProperty(name = "mozImageSmoothingEnabled")
    public native Boolean getMozImageSmoothingEnabled();
    @JsProperty(name = "msFillRule")
    public native String getMsFillRule();
    @JsProperty(name = "oImageSmoothingEnabled")
    public native Boolean getOImageSmoothingEnabled();
    @JsProperty(name = "shadowBlur")
    public native Number getShadowBlur();
    @JsProperty(name = "shadowColor")
    public native String getShadowColor();
    @JsProperty(name = "shadowOffsetX")
    public native Number getShadowOffsetX();
    @JsProperty(name = "shadowOffsetY")
    public native Number getShadowOffsetY();
    @JsProperty(name = "strokeStyle")
    public native UnionOfCanvasGradientAndCanvasPatternAndString getStrokeStyle();
    @JsProperty(name = "textAlign")
    public native String getTextAlign();
    @JsProperty(name = "textBaseline")
    public native String getTextBaseline();
    @JsProperty(name = "webkitImageSmoothingEnabled")
    public native Boolean getWebkitImageSmoothingEnabled();
    public native Boolean isPointInPath(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@313438
     */
    public native Boolean isPointInPath(@DoNotAutobox Number x, @DoNotAutobox Number y, String fillRule /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@723709
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void lineTo(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@313507
     */
    public native TextMetrics measureText(String text);
    /** 
      * tsd/browser/lib.es6.d.ts@723749
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void moveTo(@DoNotAutobox Number x, @DoNotAutobox Number y);
    public native void putImageData(ImageData imagedata, @DoNotAutobox Number dx, @DoNotAutobox Number dy);
    public native void putImageData(ImageData imagedata, @DoNotAutobox Number dx, @DoNotAutobox Number dy, @DoNotAutobox Number dirtyX /* optional */);
    public native void putImageData(ImageData imagedata, @DoNotAutobox Number dx, @DoNotAutobox Number dy, @DoNotAutobox Number dirtyX /* optional */, @DoNotAutobox Number dirtyY /* optional */);
    public native void putImageData(ImageData imagedata, @DoNotAutobox Number dx, @DoNotAutobox Number dy, @DoNotAutobox Number dirtyX /* optional */, @DoNotAutobox Number dirtyY /* optional */, @DoNotAutobox Number dirtyWidth /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@313551
     */
    public native void putImageData(ImageData imagedata, @DoNotAutobox Number dx, @DoNotAutobox Number dy, @DoNotAutobox Number dirtyX /* optional */, @DoNotAutobox Number dirtyY /* optional */, @DoNotAutobox Number dirtyWidth /* optional */, @DoNotAutobox Number dirtyHeight /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@723789
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void quadraticCurveTo(@DoNotAutobox Number cpx, @DoNotAutobox Number cpy, @DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@723865
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    public native void rect(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number w, @DoNotAutobox Number h);
    /** 
      * tsd/browser/lib.es6.d.ts@313698
     */
    public native void restore();
    /** 
      * tsd/browser/lib.es6.d.ts@313719
     */
    public native void rotate(@DoNotAutobox Number angle);
    /** 
      * tsd/browser/lib.es6.d.ts@313752
     */
    public native void save();
    /** 
      * tsd/browser/lib.es6.d.ts@313770
     */
    public native void scale(@DoNotAutobox Number x, @DoNotAutobox Number y);
    @JsProperty(name = "canvas")
    public native void setCanvas(HTMLCanvasElement value);
    @JsProperty(name = "fillStyle")
    public native void setFillStyle(String value);
    @JsProperty(name = "fillStyle")
    public native void setFillStyle(CanvasGradient value);
    @JsProperty(name = "fillStyle")
    public native void setFillStyle(CanvasPattern value);
    @JsProperty(name = "fillStyle")
    public native void setFillStyle(UnionOfCanvasGradientAndCanvasPatternAndString value);
    @JsProperty(name = "font")
    public native void setFont(String value);
    @JsProperty(name = "globalAlpha")
    public native void setGlobalAlpha(@DoNotAutobox Number value);
    @JsProperty(name = "globalCompositeOperation")
    public native void setGlobalCompositeOperation(String value);
    @JsProperty(name = "imageSmoothingEnabled")
    public native void setImageSmoothingEnabled(Boolean value);
    @JsProperty(name = "lineCap")
    public native void setLineCap(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@313809
     */
    public native void setLineDash(Array<Number> segments);
    @JsProperty(name = "lineDashOffset")
    public native void setLineDashOffset(@DoNotAutobox Number value);
    @JsProperty(name = "lineJoin")
    public native void setLineJoin(String value);
    @JsProperty(name = "lineWidth")
    public native void setLineWidth(@DoNotAutobox Number value);
    @JsProperty(name = "miterLimit")
    public native void setMiterLimit(@DoNotAutobox Number value);
    @JsProperty(name = "mozImageSmoothingEnabled")
    public native void setMozImageSmoothingEnabled(Boolean value);
    @JsProperty(name = "msFillRule")
    public native void setMsFillRule(String value);
    @JsProperty(name = "oImageSmoothingEnabled")
    public native void setOImageSmoothingEnabled(Boolean value);
    @JsProperty(name = "shadowBlur")
    public native void setShadowBlur(@DoNotAutobox Number value);
    @JsProperty(name = "shadowColor")
    public native void setShadowColor(String value);
    @JsProperty(name = "shadowOffsetX")
    public native void setShadowOffsetX(@DoNotAutobox Number value);
    @JsProperty(name = "shadowOffsetY")
    public native void setShadowOffsetY(@DoNotAutobox Number value);
    @JsProperty(name = "strokeStyle")
    public native void setStrokeStyle(String value);
    @JsProperty(name = "strokeStyle")
    public native void setStrokeStyle(CanvasGradient value);
    @JsProperty(name = "strokeStyle")
    public native void setStrokeStyle(CanvasPattern value);
    @JsProperty(name = "strokeStyle")
    public native void setStrokeStyle(UnionOfCanvasGradientAndCanvasPatternAndString value);
    @JsProperty(name = "textAlign")
    public native void setTextAlign(String value);
    @JsProperty(name = "textBaseline")
    public native void setTextBaseline(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@313852
     */
    public native void setTransform(@DoNotAutobox Number m11, @DoNotAutobox Number m12, @DoNotAutobox Number m21, @DoNotAutobox Number m22, @DoNotAutobox Number dx, @DoNotAutobox Number dy);
    @JsProperty(name = "webkitImageSmoothingEnabled")
    public native void setWebkitImageSmoothingEnabled(Boolean value);
    public native void stroke();
    /** 
      * tsd/browser/lib.es6.d.ts@313952
     */
    public native void stroke(Path2D path /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@313985
     */
    public native void strokeRect(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number w, @DoNotAutobox Number h);
    public native void strokeText(String text, @DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@314051
     */
    public native void strokeText(String text, @DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number maxWidth /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@314128
     */
    public native void transform(@DoNotAutobox Number m11, @DoNotAutobox Number m12, @DoNotAutobox Number m21, @DoNotAutobox Number m22, @DoNotAutobox Number dx, @DoNotAutobox Number dy);
    /** 
      * tsd/browser/lib.es6.d.ts@314225
     */
    public native void translate(@DoNotAutobox Number x, @DoNotAutobox Number y);
}
