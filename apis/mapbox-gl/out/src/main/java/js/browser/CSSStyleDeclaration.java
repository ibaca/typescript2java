package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: CSSStyleDeclaration
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 296812
  * declared in: tsd/browser/lib.es6.d.ts at pos 308974
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSStyleDeclaration")
public class CSSStyleDeclaration
{

    /*
        Constructors
    */
    public CSSStyleDeclaration () {
    } 

    @JsOverlay
    public final void setByIndex(int index, String value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final String getByIndex(int index) {
        return (String) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public String alignContent;

    public String alignItems;

    public String alignSelf;

    public String alignmentBaseline;

    public String animation;

    public String animationDelay;

    public String animationDirection;

    public String animationDuration;

    public String animationFillMode;

    public String animationIterationCount;

    public String animationName;

    public String animationPlayState;

    public String animationTimingFunction;

    public String backfaceVisibility;

    public String background;

    public String backgroundAttachment;

    public String backgroundClip;

    public String backgroundColor;

    public String backgroundImage;

    public String backgroundOrigin;

    public String backgroundPosition;

    public String backgroundPositionX;

    public String backgroundPositionY;

    public String backgroundRepeat;

    public String backgroundSize;

    public String baselineShift;

    public String border;

    public String borderBottom;

    public String borderBottomColor;

    public String borderBottomLeftRadius;

    public String borderBottomRightRadius;

    public String borderBottomStyle;

    public String borderBottomWidth;

    public String borderCollapse;

    public String borderColor;

    public String borderImage;

    public String borderImageOutset;

    public String borderImageRepeat;

    public String borderImageSlice;

    public String borderImageSource;

    public String borderImageWidth;

    public String borderLeft;

    public String borderLeftColor;

    public String borderLeftStyle;

    public String borderLeftWidth;

    public String borderRadius;

    public String borderRight;

    public String borderRightColor;

    public String borderRightStyle;

    public String borderRightWidth;

    public String borderSpacing;

    public String borderStyle;

    public String borderTop;

    public String borderTopColor;

    public String borderTopLeftRadius;

    public String borderTopRightRadius;

    public String borderTopStyle;

    public String borderTopWidth;

    public String borderWidth;

    public String bottom;

    public String boxShadow;

    public String boxSizing;

    public String breakAfter;

    public String breakBefore;

    public String breakInside;

    public String captionSide;

    public String clear;

    public String clip;

    public String clipPath;

    public String clipRule;

    public String color;

    public String colorInterpolationFilters;

    public Object columnCount;

    public String columnFill;

    public Object columnGap;

    public String columnRule;

    public Object columnRuleColor;

    public String columnRuleStyle;

    public Object columnRuleWidth;

    public String columnSpan;

    public Object columnWidth;

    public String columns;

    public String content;

    public String counterIncrement;

    public String counterReset;

    public String cssFloat;

    public String cssText;

    public String cursor;

    public String direction;

    public String display;

    public String dominantBaseline;

    public String emptyCells;

    public String enableBackground;

    public String fill;

    public String fillOpacity;

    public String fillRule;

    public String filter;

    public String flex;

    public String flexBasis;

    public String flexDirection;

    public String flexFlow;

    public String flexGrow;

    public String flexShrink;

    public String flexWrap;

    public String floodColor;

    public String floodOpacity;

    public String font;

    public String fontFamily;

    public String fontFeatureSettings;

    public String fontSize;

    public String fontSizeAdjust;

    public String fontStretch;

    public String fontStyle;

    public String fontVariant;

    public String fontWeight;

    public String glyphOrientationHorizontal;

    public String glyphOrientationVertical;

    public String height;

    public String imeMode;

    public String justifyContent;

    public String kerning;

    public String layoutGrid;

    public String layoutGridChar;

    public String layoutGridLine;

    public String layoutGridMode;

    public String layoutGridType;

    public String left;

    public int length;

    public String letterSpacing;

    public String lightingColor;

    public String lineBreak;

    public String lineHeight;

    public String listStyle;

    public String listStyleImage;

    public String listStylePosition;

    public String listStyleType;

    public String margin;

    public String marginBottom;

    public String marginLeft;

    public String marginRight;

    public String marginTop;

    public String marker;

    public String markerEnd;

    public String markerMid;

    public String markerStart;

    public String mask;

    public String maxHeight;

    public String maxWidth;

    public String minHeight;

    public String minWidth;

    public String msContentZoomChaining;

    public String msContentZoomLimit;

    public Object msContentZoomLimitMax;

    public Object msContentZoomLimitMin;

    public String msContentZoomSnap;

    public String msContentZoomSnapPoints;

    public String msContentZoomSnapType;

    public String msContentZooming;

    public String msFlowFrom;

    public String msFlowInto;

    public String msFontFeatureSettings;

    public Object msGridColumn;

    public String msGridColumnAlign;

    public Object msGridColumnSpan;

    public String msGridColumns;

    public Object msGridRow;

    public String msGridRowAlign;

    public Object msGridRowSpan;

    public String msGridRows;

    public String msHighContrastAdjust;

    public String msHyphenateLimitChars;

    public Object msHyphenateLimitLines;

    public Object msHyphenateLimitZone;

    public String msHyphens;

    public String msImeAlign;

    public String msOverflowStyle;

    public String msScrollChaining;

    public String msScrollLimit;

    public Object msScrollLimitXMax;

    public Object msScrollLimitXMin;

    public Object msScrollLimitYMax;

    public Object msScrollLimitYMin;

    public String msScrollRails;

    public String msScrollSnapPointsX;

    public String msScrollSnapPointsY;

    public String msScrollSnapType;

    public String msScrollSnapX;

    public String msScrollSnapY;

    public String msScrollTranslation;

    public String msTextCombineHorizontal;

    public Object msTextSizeAdjust;

    public String msTouchAction;

    public String msTouchSelect;

    public String msUserSelect;

    public String msWrapFlow;

    public Object msWrapMargin;

    public String msWrapThrough;

    public String opacity;

    public String order;

    public String orphans;

    public String outline;

    public String outlineColor;

    public String outlineOffset;

    public String outlineStyle;

    public String outlineWidth;

    public String overflow;

    public String overflowX;

    public String overflowY;

    public String padding;

    public String paddingBottom;

    public String paddingLeft;

    public String paddingRight;

    public String paddingTop;

    public String pageBreakAfter;

    public String pageBreakBefore;

    public String pageBreakInside;

    public CSSRule parentRule;

    public String perspective;

    public String perspectiveOrigin;

    public String pointerEvents;

    public String position;

    public String quotes;

    public String resize;

    public String right;

    public String rotate;

    public String rubyAlign;

    public String rubyOverhang;

    public String rubyPosition;

    public String scale;

    public String stopColor;

    public String stopOpacity;

    public String stroke;

    public String strokeDasharray;

    public String strokeDashoffset;

    public String strokeLinecap;

    public String strokeLinejoin;

    public String strokeMiterlimit;

    public String strokeOpacity;

    public String strokeWidth;

    public String tableLayout;

    public String textAlign;

    public String textAlignLast;

    public String textAnchor;

    public String textDecoration;

    public String textIndent;

    public String textJustify;

    public String textKashida;

    public String textKashidaSpace;

    public String textOverflow;

    public String textShadow;

    public String textTransform;

    public String textUnderlinePosition;

    public String top;

    public String touchAction;

    public String transform;

    public String transformOrigin;

    public String transformStyle;

    public String transition;

    public String transitionDelay;

    public String transitionDuration;

    public String transitionProperty;

    public String transitionTimingFunction;

    public String translate;

    public String unicodeBidi;

    public String userSelect;

    public String verticalAlign;

    public String visibility;

    public String webkitAlignContent;

    public String webkitAlignItems;

    public String webkitAlignSelf;

    public String webkitAnimation;

    public String webkitAnimationDelay;

    public String webkitAnimationDirection;

    public String webkitAnimationDuration;

    public String webkitAnimationFillMode;

    public String webkitAnimationIterationCount;

    public String webkitAnimationName;

    public String webkitAnimationPlayState;

    public String webkitAnimationTimingFunction;

    public String webkitAppearance;

    public String webkitBackfaceVisibility;

    public String webkitBackgroundClip;

    public String webkitBackgroundOrigin;

    public String webkitBackgroundSize;

    public String webkitBorderBottomLeftRadius;

    public String webkitBorderBottomRightRadius;

    public String webkitBorderImage;

    public String webkitBorderRadius;

    public String webkitBorderTopLeftRadius;

    public String webkitBorderTopRightRadius;

    public String webkitBoxAlign;

    public String webkitBoxDirection;

    public String webkitBoxFlex;

    public String webkitBoxOrdinalGroup;

    public String webkitBoxOrient;

    public String webkitBoxPack;

    public String webkitBoxSizing;

    public String webkitColumnBreakAfter;

    public String webkitColumnBreakBefore;

    public String webkitColumnBreakInside;

    public Object webkitColumnCount;

    public Object webkitColumnGap;

    public String webkitColumnRule;

    public Object webkitColumnRuleColor;

    public String webkitColumnRuleStyle;

    public Object webkitColumnRuleWidth;

    public String webkitColumnSpan;

    public Object webkitColumnWidth;

    public String webkitColumns;

    public String webkitFilter;

    public String webkitFlex;

    public String webkitFlexBasis;

    public String webkitFlexDirection;

    public String webkitFlexFlow;

    public String webkitFlexGrow;

    public String webkitFlexShrink;

    public String webkitFlexWrap;

    public String webkitJustifyContent;

    public String webkitOrder;

    public String webkitPerspective;

    public String webkitPerspectiveOrigin;

    public String webkitTapHighlightColor;

    public String webkitTextFillColor;

    public Object webkitTextSizeAdjust;

    public String webkitTextStroke;

    public String webkitTextStrokeColor;

    public String webkitTextStrokeWidth;

    public String webkitTransform;

    public String webkitTransformOrigin;

    public String webkitTransformStyle;

    public String webkitTransition;

    public String webkitTransitionDelay;

    public String webkitTransitionDuration;

    public String webkitTransitionProperty;

    public String webkitTransitionTimingFunction;

    public String webkitUserModify;

    public String webkitUserSelect;

    public String webkitWritingMode;

    public String whiteSpace;

    public String widows;

    public String width;

    public String wordBreak;

    public String wordSpacing;

    public String wordWrap;

    public String writingMode;

    public String zIndex;

    public String zoom;

    /*
        Methods
    */
    @JsProperty(name = "alignContent")
    public native String getAlignContent();
    @JsProperty(name = "alignItems")
    public native String getAlignItems();
    @JsProperty(name = "alignSelf")
    public native String getAlignSelf();
    @JsProperty(name = "alignmentBaseline")
    public native String getAlignmentBaseline();
    @JsProperty(name = "animation")
    public native String getAnimation();
    @JsProperty(name = "animationDelay")
    public native String getAnimationDelay();
    @JsProperty(name = "animationDirection")
    public native String getAnimationDirection();
    @JsProperty(name = "animationDuration")
    public native String getAnimationDuration();
    @JsProperty(name = "animationFillMode")
    public native String getAnimationFillMode();
    @JsProperty(name = "animationIterationCount")
    public native String getAnimationIterationCount();
    @JsProperty(name = "animationName")
    public native String getAnimationName();
    @JsProperty(name = "animationPlayState")
    public native String getAnimationPlayState();
    @JsProperty(name = "animationTimingFunction")
    public native String getAnimationTimingFunction();
    @JsProperty(name = "backfaceVisibility")
    public native String getBackfaceVisibility();
    @JsProperty(name = "background")
    public native String getBackground();
    @JsProperty(name = "backgroundAttachment")
    public native String getBackgroundAttachment();
    @JsProperty(name = "backgroundClip")
    public native String getBackgroundClip();
    @JsProperty(name = "backgroundColor")
    public native String getBackgroundColor();
    @JsProperty(name = "backgroundImage")
    public native String getBackgroundImage();
    @JsProperty(name = "backgroundOrigin")
    public native String getBackgroundOrigin();
    @JsProperty(name = "backgroundPosition")
    public native String getBackgroundPosition();
    @JsProperty(name = "backgroundPositionX")
    public native String getBackgroundPositionX();
    @JsProperty(name = "backgroundPositionY")
    public native String getBackgroundPositionY();
    @JsProperty(name = "backgroundRepeat")
    public native String getBackgroundRepeat();
    @JsProperty(name = "backgroundSize")
    public native String getBackgroundSize();
    @JsProperty(name = "baselineShift")
    public native String getBaselineShift();
    @JsProperty(name = "border")
    public native String getBorder();
    @JsProperty(name = "borderBottom")
    public native String getBorderBottom();
    @JsProperty(name = "borderBottomColor")
    public native String getBorderBottomColor();
    @JsProperty(name = "borderBottomLeftRadius")
    public native String getBorderBottomLeftRadius();
    @JsProperty(name = "borderBottomRightRadius")
    public native String getBorderBottomRightRadius();
    @JsProperty(name = "borderBottomStyle")
    public native String getBorderBottomStyle();
    @JsProperty(name = "borderBottomWidth")
    public native String getBorderBottomWidth();
    @JsProperty(name = "borderCollapse")
    public native String getBorderCollapse();
    @JsProperty(name = "borderColor")
    public native String getBorderColor();
    @JsProperty(name = "borderImage")
    public native String getBorderImage();
    @JsProperty(name = "borderImageOutset")
    public native String getBorderImageOutset();
    @JsProperty(name = "borderImageRepeat")
    public native String getBorderImageRepeat();
    @JsProperty(name = "borderImageSlice")
    public native String getBorderImageSlice();
    @JsProperty(name = "borderImageSource")
    public native String getBorderImageSource();
    @JsProperty(name = "borderImageWidth")
    public native String getBorderImageWidth();
    @JsProperty(name = "borderLeft")
    public native String getBorderLeft();
    @JsProperty(name = "borderLeftColor")
    public native String getBorderLeftColor();
    @JsProperty(name = "borderLeftStyle")
    public native String getBorderLeftStyle();
    @JsProperty(name = "borderLeftWidth")
    public native String getBorderLeftWidth();
    @JsProperty(name = "borderRadius")
    public native String getBorderRadius();
    @JsProperty(name = "borderRight")
    public native String getBorderRight();
    @JsProperty(name = "borderRightColor")
    public native String getBorderRightColor();
    @JsProperty(name = "borderRightStyle")
    public native String getBorderRightStyle();
    @JsProperty(name = "borderRightWidth")
    public native String getBorderRightWidth();
    @JsProperty(name = "borderSpacing")
    public native String getBorderSpacing();
    @JsProperty(name = "borderStyle")
    public native String getBorderStyle();
    @JsProperty(name = "borderTop")
    public native String getBorderTop();
    @JsProperty(name = "borderTopColor")
    public native String getBorderTopColor();
    @JsProperty(name = "borderTopLeftRadius")
    public native String getBorderTopLeftRadius();
    @JsProperty(name = "borderTopRightRadius")
    public native String getBorderTopRightRadius();
    @JsProperty(name = "borderTopStyle")
    public native String getBorderTopStyle();
    @JsProperty(name = "borderTopWidth")
    public native String getBorderTopWidth();
    @JsProperty(name = "borderWidth")
    public native String getBorderWidth();
    @JsProperty(name = "bottom")
    public native String getBottom();
    @JsProperty(name = "boxShadow")
    public native String getBoxShadow();
    @JsProperty(name = "boxSizing")
    public native String getBoxSizing();
    @JsProperty(name = "breakAfter")
    public native String getBreakAfter();
    @JsProperty(name = "breakBefore")
    public native String getBreakBefore();
    @JsProperty(name = "breakInside")
    public native String getBreakInside();
    @JsProperty(name = "captionSide")
    public native String getCaptionSide();
    @JsProperty(name = "clear")
    public native String getClear();
    @JsProperty(name = "clip")
    public native String getClip();
    @JsProperty(name = "clipPath")
    public native String getClipPath();
    @JsProperty(name = "clipRule")
    public native String getClipRule();
    @JsProperty(name = "color")
    public native String getColor();
    @JsProperty(name = "colorInterpolationFilters")
    public native String getColorInterpolationFilters();
    @JsProperty(name = "columnCount")
    public native Object getColumnCount();
    @JsProperty(name = "columnFill")
    public native String getColumnFill();
    @JsProperty(name = "columnGap")
    public native Object getColumnGap();
    @JsProperty(name = "columnRule")
    public native String getColumnRule();
    @JsProperty(name = "columnRuleColor")
    public native Object getColumnRuleColor();
    @JsProperty(name = "columnRuleStyle")
    public native String getColumnRuleStyle();
    @JsProperty(name = "columnRuleWidth")
    public native Object getColumnRuleWidth();
    @JsProperty(name = "columnSpan")
    public native String getColumnSpan();
    @JsProperty(name = "columnWidth")
    public native Object getColumnWidth();
    @JsProperty(name = "columns")
    public native String getColumns();
    @JsProperty(name = "content")
    public native String getContent();
    @JsProperty(name = "counterIncrement")
    public native String getCounterIncrement();
    @JsProperty(name = "counterReset")
    public native String getCounterReset();
    @JsProperty(name = "cssFloat")
    public native String getCssFloat();
    @JsProperty(name = "cssText")
    public native String getCssText();
    @JsProperty(name = "cursor")
    public native String getCursor();
    @JsProperty(name = "direction")
    public native String getDirection();
    @JsProperty(name = "display")
    public native String getDisplay();
    @JsProperty(name = "dominantBaseline")
    public native String getDominantBaseline();
    @JsProperty(name = "emptyCells")
    public native String getEmptyCells();
    @JsProperty(name = "enableBackground")
    public native String getEnableBackground();
    @JsProperty(name = "fill")
    public native String getFill();
    @JsProperty(name = "fillOpacity")
    public native String getFillOpacity();
    @JsProperty(name = "fillRule")
    public native String getFillRule();
    @JsProperty(name = "filter")
    public native String getFilter();
    @JsProperty(name = "flex")
    public native String getFlex();
    @JsProperty(name = "flexBasis")
    public native String getFlexBasis();
    @JsProperty(name = "flexDirection")
    public native String getFlexDirection();
    @JsProperty(name = "flexFlow")
    public native String getFlexFlow();
    @JsProperty(name = "flexGrow")
    public native String getFlexGrow();
    @JsProperty(name = "flexShrink")
    public native String getFlexShrink();
    @JsProperty(name = "flexWrap")
    public native String getFlexWrap();
    @JsProperty(name = "floodColor")
    public native String getFloodColor();
    @JsProperty(name = "floodOpacity")
    public native String getFloodOpacity();
    @JsProperty(name = "font")
    public native String getFont();
    @JsProperty(name = "fontFamily")
    public native String getFontFamily();
    @JsProperty(name = "fontFeatureSettings")
    public native String getFontFeatureSettings();
    @JsProperty(name = "fontSize")
    public native String getFontSize();
    @JsProperty(name = "fontSizeAdjust")
    public native String getFontSizeAdjust();
    @JsProperty(name = "fontStretch")
    public native String getFontStretch();
    @JsProperty(name = "fontStyle")
    public native String getFontStyle();
    @JsProperty(name = "fontVariant")
    public native String getFontVariant();
    @JsProperty(name = "fontWeight")
    public native String getFontWeight();
    @JsProperty(name = "glyphOrientationHorizontal")
    public native String getGlyphOrientationHorizontal();
    @JsProperty(name = "glyphOrientationVertical")
    public native String getGlyphOrientationVertical();
    @JsProperty(name = "height")
    public native String getHeight();
    @JsProperty(name = "imeMode")
    public native String getImeMode();
    @JsProperty(name = "justifyContent")
    public native String getJustifyContent();
    @JsProperty(name = "kerning")
    public native String getKerning();
    @JsProperty(name = "layoutGrid")
    public native String getLayoutGrid();
    @JsProperty(name = "layoutGridChar")
    public native String getLayoutGridChar();
    @JsProperty(name = "layoutGridLine")
    public native String getLayoutGridLine();
    @JsProperty(name = "layoutGridMode")
    public native String getLayoutGridMode();
    @JsProperty(name = "layoutGridType")
    public native String getLayoutGridType();
    @JsProperty(name = "left")
    public native String getLeft();
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "letterSpacing")
    public native String getLetterSpacing();
    @JsProperty(name = "lightingColor")
    public native String getLightingColor();
    @JsProperty(name = "lineBreak")
    public native String getLineBreak();
    @JsProperty(name = "lineHeight")
    public native String getLineHeight();
    @JsProperty(name = "listStyle")
    public native String getListStyle();
    @JsProperty(name = "listStyleImage")
    public native String getListStyleImage();
    @JsProperty(name = "listStylePosition")
    public native String getListStylePosition();
    @JsProperty(name = "listStyleType")
    public native String getListStyleType();
    @JsProperty(name = "margin")
    public native String getMargin();
    @JsProperty(name = "marginBottom")
    public native String getMarginBottom();
    @JsProperty(name = "marginLeft")
    public native String getMarginLeft();
    @JsProperty(name = "marginRight")
    public native String getMarginRight();
    @JsProperty(name = "marginTop")
    public native String getMarginTop();
    @JsProperty(name = "marker")
    public native String getMarker();
    @JsProperty(name = "markerEnd")
    public native String getMarkerEnd();
    @JsProperty(name = "markerMid")
    public native String getMarkerMid();
    @JsProperty(name = "markerStart")
    public native String getMarkerStart();
    @JsProperty(name = "mask")
    public native String getMask();
    @JsProperty(name = "maxHeight")
    public native String getMaxHeight();
    @JsProperty(name = "maxWidth")
    public native String getMaxWidth();
    @JsProperty(name = "minHeight")
    public native String getMinHeight();
    @JsProperty(name = "minWidth")
    public native String getMinWidth();
    @JsProperty(name = "msContentZoomChaining")
    public native String getMsContentZoomChaining();
    @JsProperty(name = "msContentZoomLimit")
    public native String getMsContentZoomLimit();
    @JsProperty(name = "msContentZoomLimitMax")
    public native Object getMsContentZoomLimitMax();
    @JsProperty(name = "msContentZoomLimitMin")
    public native Object getMsContentZoomLimitMin();
    @JsProperty(name = "msContentZoomSnap")
    public native String getMsContentZoomSnap();
    @JsProperty(name = "msContentZoomSnapPoints")
    public native String getMsContentZoomSnapPoints();
    @JsProperty(name = "msContentZoomSnapType")
    public native String getMsContentZoomSnapType();
    @JsProperty(name = "msContentZooming")
    public native String getMsContentZooming();
    @JsProperty(name = "msFlowFrom")
    public native String getMsFlowFrom();
    @JsProperty(name = "msFlowInto")
    public native String getMsFlowInto();
    @JsProperty(name = "msFontFeatureSettings")
    public native String getMsFontFeatureSettings();
    @JsProperty(name = "msGridColumn")
    public native Object getMsGridColumn();
    @JsProperty(name = "msGridColumnAlign")
    public native String getMsGridColumnAlign();
    @JsProperty(name = "msGridColumnSpan")
    public native Object getMsGridColumnSpan();
    @JsProperty(name = "msGridColumns")
    public native String getMsGridColumns();
    @JsProperty(name = "msGridRow")
    public native Object getMsGridRow();
    @JsProperty(name = "msGridRowAlign")
    public native String getMsGridRowAlign();
    @JsProperty(name = "msGridRowSpan")
    public native Object getMsGridRowSpan();
    @JsProperty(name = "msGridRows")
    public native String getMsGridRows();
    @JsProperty(name = "msHighContrastAdjust")
    public native String getMsHighContrastAdjust();
    @JsProperty(name = "msHyphenateLimitChars")
    public native String getMsHyphenateLimitChars();
    @JsProperty(name = "msHyphenateLimitLines")
    public native Object getMsHyphenateLimitLines();
    @JsProperty(name = "msHyphenateLimitZone")
    public native Object getMsHyphenateLimitZone();
    @JsProperty(name = "msHyphens")
    public native String getMsHyphens();
    @JsProperty(name = "msImeAlign")
    public native String getMsImeAlign();
    @JsProperty(name = "msOverflowStyle")
    public native String getMsOverflowStyle();
    @JsProperty(name = "msScrollChaining")
    public native String getMsScrollChaining();
    @JsProperty(name = "msScrollLimit")
    public native String getMsScrollLimit();
    @JsProperty(name = "msScrollLimitXMax")
    public native Object getMsScrollLimitXMax();
    @JsProperty(name = "msScrollLimitXMin")
    public native Object getMsScrollLimitXMin();
    @JsProperty(name = "msScrollLimitYMax")
    public native Object getMsScrollLimitYMax();
    @JsProperty(name = "msScrollLimitYMin")
    public native Object getMsScrollLimitYMin();
    @JsProperty(name = "msScrollRails")
    public native String getMsScrollRails();
    @JsProperty(name = "msScrollSnapPointsX")
    public native String getMsScrollSnapPointsX();
    @JsProperty(name = "msScrollSnapPointsY")
    public native String getMsScrollSnapPointsY();
    @JsProperty(name = "msScrollSnapType")
    public native String getMsScrollSnapType();
    @JsProperty(name = "msScrollSnapX")
    public native String getMsScrollSnapX();
    @JsProperty(name = "msScrollSnapY")
    public native String getMsScrollSnapY();
    @JsProperty(name = "msScrollTranslation")
    public native String getMsScrollTranslation();
    @JsProperty(name = "msTextCombineHorizontal")
    public native String getMsTextCombineHorizontal();
    @JsProperty(name = "msTextSizeAdjust")
    public native Object getMsTextSizeAdjust();
    @JsProperty(name = "msTouchAction")
    public native String getMsTouchAction();
    @JsProperty(name = "msTouchSelect")
    public native String getMsTouchSelect();
    @JsProperty(name = "msUserSelect")
    public native String getMsUserSelect();
    @JsProperty(name = "msWrapFlow")
    public native String getMsWrapFlow();
    @JsProperty(name = "msWrapMargin")
    public native Object getMsWrapMargin();
    @JsProperty(name = "msWrapThrough")
    public native String getMsWrapThrough();
    @JsProperty(name = "opacity")
    public native String getOpacity();
    @JsProperty(name = "order")
    public native String getOrder();
    @JsProperty(name = "orphans")
    public native String getOrphans();
    @JsProperty(name = "outline")
    public native String getOutline();
    @JsProperty(name = "outlineColor")
    public native String getOutlineColor();
    @JsProperty(name = "outlineOffset")
    public native String getOutlineOffset();
    @JsProperty(name = "outlineStyle")
    public native String getOutlineStyle();
    @JsProperty(name = "outlineWidth")
    public native String getOutlineWidth();
    @JsProperty(name = "overflow")
    public native String getOverflow();
    @JsProperty(name = "overflowX")
    public native String getOverflowX();
    @JsProperty(name = "overflowY")
    public native String getOverflowY();
    @JsProperty(name = "padding")
    public native String getPadding();
    @JsProperty(name = "paddingBottom")
    public native String getPaddingBottom();
    @JsProperty(name = "paddingLeft")
    public native String getPaddingLeft();
    @JsProperty(name = "paddingRight")
    public native String getPaddingRight();
    @JsProperty(name = "paddingTop")
    public native String getPaddingTop();
    @JsProperty(name = "pageBreakAfter")
    public native String getPageBreakAfter();
    @JsProperty(name = "pageBreakBefore")
    public native String getPageBreakBefore();
    @JsProperty(name = "pageBreakInside")
    public native String getPageBreakInside();
    @JsProperty(name = "parentRule")
    public native CSSRule getParentRule();
    @JsProperty(name = "perspective")
    public native String getPerspective();
    @JsProperty(name = "perspectiveOrigin")
    public native String getPerspectiveOrigin();
    @JsProperty(name = "pointerEvents")
    public native String getPointerEvents();
    @JsProperty(name = "position")
    public native String getPosition();
    /** 
      * tsd/browser/lib.es6.d.ts@308659
     */
    public native String getPropertyPriority(String propertyName);
    /** 
      * tsd/browser/lib.es6.d.ts@308714
     */
    public native String getPropertyValue(String propertyName);
    @JsProperty(name = "quotes")
    public native String getQuotes();
    @JsProperty(name = "resize")
    public native String getResize();
    @JsProperty(name = "right")
    public native String getRight();
    @JsProperty(name = "rotate")
    public native String getRotate();
    @JsProperty(name = "rubyAlign")
    public native String getRubyAlign();
    @JsProperty(name = "rubyOverhang")
    public native String getRubyOverhang();
    @JsProperty(name = "rubyPosition")
    public native String getRubyPosition();
    @JsProperty(name = "scale")
    public native String getScale();
    @JsProperty(name = "stopColor")
    public native String getStopColor();
    @JsProperty(name = "stopOpacity")
    public native String getStopOpacity();
    @JsProperty(name = "stroke")
    public native String getStroke();
    @JsProperty(name = "strokeDasharray")
    public native String getStrokeDasharray();
    @JsProperty(name = "strokeDashoffset")
    public native String getStrokeDashoffset();
    @JsProperty(name = "strokeLinecap")
    public native String getStrokeLinecap();
    @JsProperty(name = "strokeLinejoin")
    public native String getStrokeLinejoin();
    @JsProperty(name = "strokeMiterlimit")
    public native String getStrokeMiterlimit();
    @JsProperty(name = "strokeOpacity")
    public native String getStrokeOpacity();
    @JsProperty(name = "strokeWidth")
    public native String getStrokeWidth();
    @JsProperty(name = "tableLayout")
    public native String getTableLayout();
    @JsProperty(name = "textAlign")
    public native String getTextAlign();
    @JsProperty(name = "textAlignLast")
    public native String getTextAlignLast();
    @JsProperty(name = "textAnchor")
    public native String getTextAnchor();
    @JsProperty(name = "textDecoration")
    public native String getTextDecoration();
    @JsProperty(name = "textIndent")
    public native String getTextIndent();
    @JsProperty(name = "textJustify")
    public native String getTextJustify();
    @JsProperty(name = "textKashida")
    public native String getTextKashida();
    @JsProperty(name = "textKashidaSpace")
    public native String getTextKashidaSpace();
    @JsProperty(name = "textOverflow")
    public native String getTextOverflow();
    @JsProperty(name = "textShadow")
    public native String getTextShadow();
    @JsProperty(name = "textTransform")
    public native String getTextTransform();
    @JsProperty(name = "textUnderlinePosition")
    public native String getTextUnderlinePosition();
    @JsProperty(name = "top")
    public native String getTop();
    @JsProperty(name = "touchAction")
    public native String getTouchAction();
    @JsProperty(name = "transform")
    public native String getTransform();
    @JsProperty(name = "transformOrigin")
    public native String getTransformOrigin();
    @JsProperty(name = "transformStyle")
    public native String getTransformStyle();
    @JsProperty(name = "transition")
    public native String getTransition();
    @JsProperty(name = "transitionDelay")
    public native String getTransitionDelay();
    @JsProperty(name = "transitionDuration")
    public native String getTransitionDuration();
    @JsProperty(name = "transitionProperty")
    public native String getTransitionProperty();
    @JsProperty(name = "transitionTimingFunction")
    public native String getTransitionTimingFunction();
    @JsProperty(name = "translate")
    public native String getTranslate();
    @JsProperty(name = "unicodeBidi")
    public native String getUnicodeBidi();
    @JsProperty(name = "userSelect")
    public native String getUserSelect();
    @JsProperty(name = "verticalAlign")
    public native String getVerticalAlign();
    @JsProperty(name = "visibility")
    public native String getVisibility();
    @JsProperty(name = "webkitAlignContent")
    public native String getWebkitAlignContent();
    @JsProperty(name = "webkitAlignItems")
    public native String getWebkitAlignItems();
    @JsProperty(name = "webkitAlignSelf")
    public native String getWebkitAlignSelf();
    @JsProperty(name = "webkitAnimation")
    public native String getWebkitAnimation();
    @JsProperty(name = "webkitAnimationDelay")
    public native String getWebkitAnimationDelay();
    @JsProperty(name = "webkitAnimationDirection")
    public native String getWebkitAnimationDirection();
    @JsProperty(name = "webkitAnimationDuration")
    public native String getWebkitAnimationDuration();
    @JsProperty(name = "webkitAnimationFillMode")
    public native String getWebkitAnimationFillMode();
    @JsProperty(name = "webkitAnimationIterationCount")
    public native String getWebkitAnimationIterationCount();
    @JsProperty(name = "webkitAnimationName")
    public native String getWebkitAnimationName();
    @JsProperty(name = "webkitAnimationPlayState")
    public native String getWebkitAnimationPlayState();
    @JsProperty(name = "webkitAnimationTimingFunction")
    public native String getWebkitAnimationTimingFunction();
    @JsProperty(name = "webkitAppearance")
    public native String getWebkitAppearance();
    @JsProperty(name = "webkitBackfaceVisibility")
    public native String getWebkitBackfaceVisibility();
    @JsProperty(name = "webkitBackgroundClip")
    public native String getWebkitBackgroundClip();
    @JsProperty(name = "webkitBackgroundOrigin")
    public native String getWebkitBackgroundOrigin();
    @JsProperty(name = "webkitBackgroundSize")
    public native String getWebkitBackgroundSize();
    @JsProperty(name = "webkitBorderBottomLeftRadius")
    public native String getWebkitBorderBottomLeftRadius();
    @JsProperty(name = "webkitBorderBottomRightRadius")
    public native String getWebkitBorderBottomRightRadius();
    @JsProperty(name = "webkitBorderImage")
    public native String getWebkitBorderImage();
    @JsProperty(name = "webkitBorderRadius")
    public native String getWebkitBorderRadius();
    @JsProperty(name = "webkitBorderTopLeftRadius")
    public native String getWebkitBorderTopLeftRadius();
    @JsProperty(name = "webkitBorderTopRightRadius")
    public native String getWebkitBorderTopRightRadius();
    @JsProperty(name = "webkitBoxAlign")
    public native String getWebkitBoxAlign();
    @JsProperty(name = "webkitBoxDirection")
    public native String getWebkitBoxDirection();
    @JsProperty(name = "webkitBoxFlex")
    public native String getWebkitBoxFlex();
    @JsProperty(name = "webkitBoxOrdinalGroup")
    public native String getWebkitBoxOrdinalGroup();
    @JsProperty(name = "webkitBoxOrient")
    public native String getWebkitBoxOrient();
    @JsProperty(name = "webkitBoxPack")
    public native String getWebkitBoxPack();
    @JsProperty(name = "webkitBoxSizing")
    public native String getWebkitBoxSizing();
    @JsProperty(name = "webkitColumnBreakAfter")
    public native String getWebkitColumnBreakAfter();
    @JsProperty(name = "webkitColumnBreakBefore")
    public native String getWebkitColumnBreakBefore();
    @JsProperty(name = "webkitColumnBreakInside")
    public native String getWebkitColumnBreakInside();
    @JsProperty(name = "webkitColumnCount")
    public native Object getWebkitColumnCount();
    @JsProperty(name = "webkitColumnGap")
    public native Object getWebkitColumnGap();
    @JsProperty(name = "webkitColumnRule")
    public native String getWebkitColumnRule();
    @JsProperty(name = "webkitColumnRuleColor")
    public native Object getWebkitColumnRuleColor();
    @JsProperty(name = "webkitColumnRuleStyle")
    public native String getWebkitColumnRuleStyle();
    @JsProperty(name = "webkitColumnRuleWidth")
    public native Object getWebkitColumnRuleWidth();
    @JsProperty(name = "webkitColumnSpan")
    public native String getWebkitColumnSpan();
    @JsProperty(name = "webkitColumnWidth")
    public native Object getWebkitColumnWidth();
    @JsProperty(name = "webkitColumns")
    public native String getWebkitColumns();
    @JsProperty(name = "webkitFilter")
    public native String getWebkitFilter();
    @JsProperty(name = "webkitFlex")
    public native String getWebkitFlex();
    @JsProperty(name = "webkitFlexBasis")
    public native String getWebkitFlexBasis();
    @JsProperty(name = "webkitFlexDirection")
    public native String getWebkitFlexDirection();
    @JsProperty(name = "webkitFlexFlow")
    public native String getWebkitFlexFlow();
    @JsProperty(name = "webkitFlexGrow")
    public native String getWebkitFlexGrow();
    @JsProperty(name = "webkitFlexShrink")
    public native String getWebkitFlexShrink();
    @JsProperty(name = "webkitFlexWrap")
    public native String getWebkitFlexWrap();
    @JsProperty(name = "webkitJustifyContent")
    public native String getWebkitJustifyContent();
    @JsProperty(name = "webkitOrder")
    public native String getWebkitOrder();
    @JsProperty(name = "webkitPerspective")
    public native String getWebkitPerspective();
    @JsProperty(name = "webkitPerspectiveOrigin")
    public native String getWebkitPerspectiveOrigin();
    @JsProperty(name = "webkitTapHighlightColor")
    public native String getWebkitTapHighlightColor();
    @JsProperty(name = "webkitTextFillColor")
    public native String getWebkitTextFillColor();
    @JsProperty(name = "webkitTextSizeAdjust")
    public native Object getWebkitTextSizeAdjust();
    @JsProperty(name = "webkitTextStroke")
    public native String getWebkitTextStroke();
    @JsProperty(name = "webkitTextStrokeColor")
    public native String getWebkitTextStrokeColor();
    @JsProperty(name = "webkitTextStrokeWidth")
    public native String getWebkitTextStrokeWidth();
    @JsProperty(name = "webkitTransform")
    public native String getWebkitTransform();
    @JsProperty(name = "webkitTransformOrigin")
    public native String getWebkitTransformOrigin();
    @JsProperty(name = "webkitTransformStyle")
    public native String getWebkitTransformStyle();
    @JsProperty(name = "webkitTransition")
    public native String getWebkitTransition();
    @JsProperty(name = "webkitTransitionDelay")
    public native String getWebkitTransitionDelay();
    @JsProperty(name = "webkitTransitionDuration")
    public native String getWebkitTransitionDuration();
    @JsProperty(name = "webkitTransitionProperty")
    public native String getWebkitTransitionProperty();
    @JsProperty(name = "webkitTransitionTimingFunction")
    public native String getWebkitTransitionTimingFunction();
    @JsProperty(name = "webkitUserModify")
    public native String getWebkitUserModify();
    @JsProperty(name = "webkitUserSelect")
    public native String getWebkitUserSelect();
    @JsProperty(name = "webkitWritingMode")
    public native String getWebkitWritingMode();
    @JsProperty(name = "whiteSpace")
    public native String getWhiteSpace();
    @JsProperty(name = "widows")
    public native String getWidows();
    @JsProperty(name = "width")
    public native String getWidth();
    @JsProperty(name = "wordBreak")
    public native String getWordBreak();
    @JsProperty(name = "wordSpacing")
    public native String getWordSpacing();
    @JsProperty(name = "wordWrap")
    public native String getWordWrap();
    @JsProperty(name = "writingMode")
    public native String getWritingMode();
    @JsProperty(name = "zIndex")
    public native String getZIndex();
    @JsProperty(name = "zoom")
    public native String getZoom();
    /** 
      * tsd/browser/lib.es6.d.ts@308766
     */
    public native String item(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@308799
     */
    public native String removeProperty(String propertyName);
    @JsProperty(name = "alignContent")
    public native void setAlignContent(String value);
    @JsProperty(name = "alignItems")
    public native void setAlignItems(String value);
    @JsProperty(name = "alignSelf")
    public native void setAlignSelf(String value);
    @JsProperty(name = "alignmentBaseline")
    public native void setAlignmentBaseline(String value);
    @JsProperty(name = "animation")
    public native void setAnimation(String value);
    @JsProperty(name = "animationDelay")
    public native void setAnimationDelay(String value);
    @JsProperty(name = "animationDirection")
    public native void setAnimationDirection(String value);
    @JsProperty(name = "animationDuration")
    public native void setAnimationDuration(String value);
    @JsProperty(name = "animationFillMode")
    public native void setAnimationFillMode(String value);
    @JsProperty(name = "animationIterationCount")
    public native void setAnimationIterationCount(String value);
    @JsProperty(name = "animationName")
    public native void setAnimationName(String value);
    @JsProperty(name = "animationPlayState")
    public native void setAnimationPlayState(String value);
    @JsProperty(name = "animationTimingFunction")
    public native void setAnimationTimingFunction(String value);
    @JsProperty(name = "backfaceVisibility")
    public native void setBackfaceVisibility(String value);
    @JsProperty(name = "background")
    public native void setBackground(String value);
    @JsProperty(name = "backgroundAttachment")
    public native void setBackgroundAttachment(String value);
    @JsProperty(name = "backgroundClip")
    public native void setBackgroundClip(String value);
    @JsProperty(name = "backgroundColor")
    public native void setBackgroundColor(String value);
    @JsProperty(name = "backgroundImage")
    public native void setBackgroundImage(String value);
    @JsProperty(name = "backgroundOrigin")
    public native void setBackgroundOrigin(String value);
    @JsProperty(name = "backgroundPosition")
    public native void setBackgroundPosition(String value);
    @JsProperty(name = "backgroundPositionX")
    public native void setBackgroundPositionX(String value);
    @JsProperty(name = "backgroundPositionY")
    public native void setBackgroundPositionY(String value);
    @JsProperty(name = "backgroundRepeat")
    public native void setBackgroundRepeat(String value);
    @JsProperty(name = "backgroundSize")
    public native void setBackgroundSize(String value);
    @JsProperty(name = "baselineShift")
    public native void setBaselineShift(String value);
    @JsProperty(name = "border")
    public native void setBorder(String value);
    @JsProperty(name = "borderBottom")
    public native void setBorderBottom(String value);
    @JsProperty(name = "borderBottomColor")
    public native void setBorderBottomColor(String value);
    @JsProperty(name = "borderBottomLeftRadius")
    public native void setBorderBottomLeftRadius(String value);
    @JsProperty(name = "borderBottomRightRadius")
    public native void setBorderBottomRightRadius(String value);
    @JsProperty(name = "borderBottomStyle")
    public native void setBorderBottomStyle(String value);
    @JsProperty(name = "borderBottomWidth")
    public native void setBorderBottomWidth(String value);
    @JsProperty(name = "borderCollapse")
    public native void setBorderCollapse(String value);
    @JsProperty(name = "borderColor")
    public native void setBorderColor(String value);
    @JsProperty(name = "borderImage")
    public native void setBorderImage(String value);
    @JsProperty(name = "borderImageOutset")
    public native void setBorderImageOutset(String value);
    @JsProperty(name = "borderImageRepeat")
    public native void setBorderImageRepeat(String value);
    @JsProperty(name = "borderImageSlice")
    public native void setBorderImageSlice(String value);
    @JsProperty(name = "borderImageSource")
    public native void setBorderImageSource(String value);
    @JsProperty(name = "borderImageWidth")
    public native void setBorderImageWidth(String value);
    @JsProperty(name = "borderLeft")
    public native void setBorderLeft(String value);
    @JsProperty(name = "borderLeftColor")
    public native void setBorderLeftColor(String value);
    @JsProperty(name = "borderLeftStyle")
    public native void setBorderLeftStyle(String value);
    @JsProperty(name = "borderLeftWidth")
    public native void setBorderLeftWidth(String value);
    @JsProperty(name = "borderRadius")
    public native void setBorderRadius(String value);
    @JsProperty(name = "borderRight")
    public native void setBorderRight(String value);
    @JsProperty(name = "borderRightColor")
    public native void setBorderRightColor(String value);
    @JsProperty(name = "borderRightStyle")
    public native void setBorderRightStyle(String value);
    @JsProperty(name = "borderRightWidth")
    public native void setBorderRightWidth(String value);
    @JsProperty(name = "borderSpacing")
    public native void setBorderSpacing(String value);
    @JsProperty(name = "borderStyle")
    public native void setBorderStyle(String value);
    @JsProperty(name = "borderTop")
    public native void setBorderTop(String value);
    @JsProperty(name = "borderTopColor")
    public native void setBorderTopColor(String value);
    @JsProperty(name = "borderTopLeftRadius")
    public native void setBorderTopLeftRadius(String value);
    @JsProperty(name = "borderTopRightRadius")
    public native void setBorderTopRightRadius(String value);
    @JsProperty(name = "borderTopStyle")
    public native void setBorderTopStyle(String value);
    @JsProperty(name = "borderTopWidth")
    public native void setBorderTopWidth(String value);
    @JsProperty(name = "borderWidth")
    public native void setBorderWidth(String value);
    @JsProperty(name = "bottom")
    public native void setBottom(String value);
    @JsProperty(name = "boxShadow")
    public native void setBoxShadow(String value);
    @JsProperty(name = "boxSizing")
    public native void setBoxSizing(String value);
    @JsProperty(name = "breakAfter")
    public native void setBreakAfter(String value);
    @JsProperty(name = "breakBefore")
    public native void setBreakBefore(String value);
    @JsProperty(name = "breakInside")
    public native void setBreakInside(String value);
    @JsProperty(name = "captionSide")
    public native void setCaptionSide(String value);
    @JsProperty(name = "clear")
    public native void setClear(String value);
    @JsProperty(name = "clip")
    public native void setClip(String value);
    @JsProperty(name = "clipPath")
    public native void setClipPath(String value);
    @JsProperty(name = "clipRule")
    public native void setClipRule(String value);
    @JsProperty(name = "color")
    public native void setColor(String value);
    @JsProperty(name = "colorInterpolationFilters")
    public native void setColorInterpolationFilters(String value);
    @JsProperty(name = "columnCount")
    public native void setColumnCount(Object value);
    @JsProperty(name = "columnFill")
    public native void setColumnFill(String value);
    @JsProperty(name = "columnGap")
    public native void setColumnGap(Object value);
    @JsProperty(name = "columnRule")
    public native void setColumnRule(String value);
    @JsProperty(name = "columnRuleColor")
    public native void setColumnRuleColor(Object value);
    @JsProperty(name = "columnRuleStyle")
    public native void setColumnRuleStyle(String value);
    @JsProperty(name = "columnRuleWidth")
    public native void setColumnRuleWidth(Object value);
    @JsProperty(name = "columnSpan")
    public native void setColumnSpan(String value);
    @JsProperty(name = "columnWidth")
    public native void setColumnWidth(Object value);
    @JsProperty(name = "columns")
    public native void setColumns(String value);
    @JsProperty(name = "content")
    public native void setContent(String value);
    @JsProperty(name = "counterIncrement")
    public native void setCounterIncrement(String value);
    @JsProperty(name = "counterReset")
    public native void setCounterReset(String value);
    @JsProperty(name = "cssFloat")
    public native void setCssFloat(String value);
    @JsProperty(name = "cssText")
    public native void setCssText(String value);
    @JsProperty(name = "cursor")
    public native void setCursor(String value);
    @JsProperty(name = "direction")
    public native void setDirection(String value);
    @JsProperty(name = "display")
    public native void setDisplay(String value);
    @JsProperty(name = "dominantBaseline")
    public native void setDominantBaseline(String value);
    @JsProperty(name = "emptyCells")
    public native void setEmptyCells(String value);
    @JsProperty(name = "enableBackground")
    public native void setEnableBackground(String value);
    @JsProperty(name = "fill")
    public native void setFill(String value);
    @JsProperty(name = "fillOpacity")
    public native void setFillOpacity(String value);
    @JsProperty(name = "fillRule")
    public native void setFillRule(String value);
    @JsProperty(name = "filter")
    public native void setFilter(String value);
    @JsProperty(name = "flex")
    public native void setFlex(String value);
    @JsProperty(name = "flexBasis")
    public native void setFlexBasis(String value);
    @JsProperty(name = "flexDirection")
    public native void setFlexDirection(String value);
    @JsProperty(name = "flexFlow")
    public native void setFlexFlow(String value);
    @JsProperty(name = "flexGrow")
    public native void setFlexGrow(String value);
    @JsProperty(name = "flexShrink")
    public native void setFlexShrink(String value);
    @JsProperty(name = "flexWrap")
    public native void setFlexWrap(String value);
    @JsProperty(name = "floodColor")
    public native void setFloodColor(String value);
    @JsProperty(name = "floodOpacity")
    public native void setFloodOpacity(String value);
    @JsProperty(name = "font")
    public native void setFont(String value);
    @JsProperty(name = "fontFamily")
    public native void setFontFamily(String value);
    @JsProperty(name = "fontFeatureSettings")
    public native void setFontFeatureSettings(String value);
    @JsProperty(name = "fontSize")
    public native void setFontSize(String value);
    @JsProperty(name = "fontSizeAdjust")
    public native void setFontSizeAdjust(String value);
    @JsProperty(name = "fontStretch")
    public native void setFontStretch(String value);
    @JsProperty(name = "fontStyle")
    public native void setFontStyle(String value);
    @JsProperty(name = "fontVariant")
    public native void setFontVariant(String value);
    @JsProperty(name = "fontWeight")
    public native void setFontWeight(String value);
    @JsProperty(name = "glyphOrientationHorizontal")
    public native void setGlyphOrientationHorizontal(String value);
    @JsProperty(name = "glyphOrientationVertical")
    public native void setGlyphOrientationVertical(String value);
    @JsProperty(name = "height")
    public native void setHeight(String value);
    @JsProperty(name = "imeMode")
    public native void setImeMode(String value);
    @JsProperty(name = "justifyContent")
    public native void setJustifyContent(String value);
    @JsProperty(name = "kerning")
    public native void setKerning(String value);
    @JsProperty(name = "layoutGrid")
    public native void setLayoutGrid(String value);
    @JsProperty(name = "layoutGridChar")
    public native void setLayoutGridChar(String value);
    @JsProperty(name = "layoutGridLine")
    public native void setLayoutGridLine(String value);
    @JsProperty(name = "layoutGridMode")
    public native void setLayoutGridMode(String value);
    @JsProperty(name = "layoutGridType")
    public native void setLayoutGridType(String value);
    @JsProperty(name = "left")
    public native void setLeft(String value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "letterSpacing")
    public native void setLetterSpacing(String value);
    @JsProperty(name = "lightingColor")
    public native void setLightingColor(String value);
    @JsProperty(name = "lineBreak")
    public native void setLineBreak(String value);
    @JsProperty(name = "lineHeight")
    public native void setLineHeight(String value);
    @JsProperty(name = "listStyle")
    public native void setListStyle(String value);
    @JsProperty(name = "listStyleImage")
    public native void setListStyleImage(String value);
    @JsProperty(name = "listStylePosition")
    public native void setListStylePosition(String value);
    @JsProperty(name = "listStyleType")
    public native void setListStyleType(String value);
    @JsProperty(name = "margin")
    public native void setMargin(String value);
    @JsProperty(name = "marginBottom")
    public native void setMarginBottom(String value);
    @JsProperty(name = "marginLeft")
    public native void setMarginLeft(String value);
    @JsProperty(name = "marginRight")
    public native void setMarginRight(String value);
    @JsProperty(name = "marginTop")
    public native void setMarginTop(String value);
    @JsProperty(name = "marker")
    public native void setMarker(String value);
    @JsProperty(name = "markerEnd")
    public native void setMarkerEnd(String value);
    @JsProperty(name = "markerMid")
    public native void setMarkerMid(String value);
    @JsProperty(name = "markerStart")
    public native void setMarkerStart(String value);
    @JsProperty(name = "mask")
    public native void setMask(String value);
    @JsProperty(name = "maxHeight")
    public native void setMaxHeight(String value);
    @JsProperty(name = "maxWidth")
    public native void setMaxWidth(String value);
    @JsProperty(name = "minHeight")
    public native void setMinHeight(String value);
    @JsProperty(name = "minWidth")
    public native void setMinWidth(String value);
    @JsProperty(name = "msContentZoomChaining")
    public native void setMsContentZoomChaining(String value);
    @JsProperty(name = "msContentZoomLimit")
    public native void setMsContentZoomLimit(String value);
    @JsProperty(name = "msContentZoomLimitMax")
    public native void setMsContentZoomLimitMax(Object value);
    @JsProperty(name = "msContentZoomLimitMin")
    public native void setMsContentZoomLimitMin(Object value);
    @JsProperty(name = "msContentZoomSnap")
    public native void setMsContentZoomSnap(String value);
    @JsProperty(name = "msContentZoomSnapPoints")
    public native void setMsContentZoomSnapPoints(String value);
    @JsProperty(name = "msContentZoomSnapType")
    public native void setMsContentZoomSnapType(String value);
    @JsProperty(name = "msContentZooming")
    public native void setMsContentZooming(String value);
    @JsProperty(name = "msFlowFrom")
    public native void setMsFlowFrom(String value);
    @JsProperty(name = "msFlowInto")
    public native void setMsFlowInto(String value);
    @JsProperty(name = "msFontFeatureSettings")
    public native void setMsFontFeatureSettings(String value);
    @JsProperty(name = "msGridColumn")
    public native void setMsGridColumn(Object value);
    @JsProperty(name = "msGridColumnAlign")
    public native void setMsGridColumnAlign(String value);
    @JsProperty(name = "msGridColumnSpan")
    public native void setMsGridColumnSpan(Object value);
    @JsProperty(name = "msGridColumns")
    public native void setMsGridColumns(String value);
    @JsProperty(name = "msGridRow")
    public native void setMsGridRow(Object value);
    @JsProperty(name = "msGridRowAlign")
    public native void setMsGridRowAlign(String value);
    @JsProperty(name = "msGridRowSpan")
    public native void setMsGridRowSpan(Object value);
    @JsProperty(name = "msGridRows")
    public native void setMsGridRows(String value);
    @JsProperty(name = "msHighContrastAdjust")
    public native void setMsHighContrastAdjust(String value);
    @JsProperty(name = "msHyphenateLimitChars")
    public native void setMsHyphenateLimitChars(String value);
    @JsProperty(name = "msHyphenateLimitLines")
    public native void setMsHyphenateLimitLines(Object value);
    @JsProperty(name = "msHyphenateLimitZone")
    public native void setMsHyphenateLimitZone(Object value);
    @JsProperty(name = "msHyphens")
    public native void setMsHyphens(String value);
    @JsProperty(name = "msImeAlign")
    public native void setMsImeAlign(String value);
    @JsProperty(name = "msOverflowStyle")
    public native void setMsOverflowStyle(String value);
    @JsProperty(name = "msScrollChaining")
    public native void setMsScrollChaining(String value);
    @JsProperty(name = "msScrollLimit")
    public native void setMsScrollLimit(String value);
    @JsProperty(name = "msScrollLimitXMax")
    public native void setMsScrollLimitXMax(Object value);
    @JsProperty(name = "msScrollLimitXMin")
    public native void setMsScrollLimitXMin(Object value);
    @JsProperty(name = "msScrollLimitYMax")
    public native void setMsScrollLimitYMax(Object value);
    @JsProperty(name = "msScrollLimitYMin")
    public native void setMsScrollLimitYMin(Object value);
    @JsProperty(name = "msScrollRails")
    public native void setMsScrollRails(String value);
    @JsProperty(name = "msScrollSnapPointsX")
    public native void setMsScrollSnapPointsX(String value);
    @JsProperty(name = "msScrollSnapPointsY")
    public native void setMsScrollSnapPointsY(String value);
    @JsProperty(name = "msScrollSnapType")
    public native void setMsScrollSnapType(String value);
    @JsProperty(name = "msScrollSnapX")
    public native void setMsScrollSnapX(String value);
    @JsProperty(name = "msScrollSnapY")
    public native void setMsScrollSnapY(String value);
    @JsProperty(name = "msScrollTranslation")
    public native void setMsScrollTranslation(String value);
    @JsProperty(name = "msTextCombineHorizontal")
    public native void setMsTextCombineHorizontal(String value);
    @JsProperty(name = "msTextSizeAdjust")
    public native void setMsTextSizeAdjust(Object value);
    @JsProperty(name = "msTouchAction")
    public native void setMsTouchAction(String value);
    @JsProperty(name = "msTouchSelect")
    public native void setMsTouchSelect(String value);
    @JsProperty(name = "msUserSelect")
    public native void setMsUserSelect(String value);
    @JsProperty(name = "msWrapFlow")
    public native void setMsWrapFlow(String value);
    @JsProperty(name = "msWrapMargin")
    public native void setMsWrapMargin(Object value);
    @JsProperty(name = "msWrapThrough")
    public native void setMsWrapThrough(String value);
    @JsProperty(name = "opacity")
    public native void setOpacity(String value);
    @JsProperty(name = "order")
    public native void setOrder(String value);
    @JsProperty(name = "orphans")
    public native void setOrphans(String value);
    @JsProperty(name = "outline")
    public native void setOutline(String value);
    @JsProperty(name = "outlineColor")
    public native void setOutlineColor(String value);
    @JsProperty(name = "outlineOffset")
    public native void setOutlineOffset(String value);
    @JsProperty(name = "outlineStyle")
    public native void setOutlineStyle(String value);
    @JsProperty(name = "outlineWidth")
    public native void setOutlineWidth(String value);
    @JsProperty(name = "overflow")
    public native void setOverflow(String value);
    @JsProperty(name = "overflowX")
    public native void setOverflowX(String value);
    @JsProperty(name = "overflowY")
    public native void setOverflowY(String value);
    @JsProperty(name = "padding")
    public native void setPadding(String value);
    @JsProperty(name = "paddingBottom")
    public native void setPaddingBottom(String value);
    @JsProperty(name = "paddingLeft")
    public native void setPaddingLeft(String value);
    @JsProperty(name = "paddingRight")
    public native void setPaddingRight(String value);
    @JsProperty(name = "paddingTop")
    public native void setPaddingTop(String value);
    @JsProperty(name = "pageBreakAfter")
    public native void setPageBreakAfter(String value);
    @JsProperty(name = "pageBreakBefore")
    public native void setPageBreakBefore(String value);
    @JsProperty(name = "pageBreakInside")
    public native void setPageBreakInside(String value);
    @JsProperty(name = "parentRule")
    public native void setParentRule(CSSRule value);
    @JsProperty(name = "perspective")
    public native void setPerspective(String value);
    @JsProperty(name = "perspectiveOrigin")
    public native void setPerspectiveOrigin(String value);
    @JsProperty(name = "pointerEvents")
    public native void setPointerEvents(String value);
    @JsProperty(name = "position")
    public native void setPosition(String value);
    public native void setProperty(String propertyName, String value);
    /** 
      * tsd/browser/lib.es6.d.ts@308849
     */
    public native void setProperty(String propertyName, String value, String priority /* optional */);
    @JsProperty(name = "quotes")
    public native void setQuotes(String value);
    @JsProperty(name = "resize")
    public native void setResize(String value);
    @JsProperty(name = "right")
    public native void setRight(String value);
    @JsProperty(name = "rotate")
    public native void setRotate(String value);
    @JsProperty(name = "rubyAlign")
    public native void setRubyAlign(String value);
    @JsProperty(name = "rubyOverhang")
    public native void setRubyOverhang(String value);
    @JsProperty(name = "rubyPosition")
    public native void setRubyPosition(String value);
    @JsProperty(name = "scale")
    public native void setScale(String value);
    @JsProperty(name = "stopColor")
    public native void setStopColor(String value);
    @JsProperty(name = "stopOpacity")
    public native void setStopOpacity(String value);
    @JsProperty(name = "stroke")
    public native void setStroke(String value);
    @JsProperty(name = "strokeDasharray")
    public native void setStrokeDasharray(String value);
    @JsProperty(name = "strokeDashoffset")
    public native void setStrokeDashoffset(String value);
    @JsProperty(name = "strokeLinecap")
    public native void setStrokeLinecap(String value);
    @JsProperty(name = "strokeLinejoin")
    public native void setStrokeLinejoin(String value);
    @JsProperty(name = "strokeMiterlimit")
    public native void setStrokeMiterlimit(String value);
    @JsProperty(name = "strokeOpacity")
    public native void setStrokeOpacity(String value);
    @JsProperty(name = "strokeWidth")
    public native void setStrokeWidth(String value);
    @JsProperty(name = "tableLayout")
    public native void setTableLayout(String value);
    @JsProperty(name = "textAlign")
    public native void setTextAlign(String value);
    @JsProperty(name = "textAlignLast")
    public native void setTextAlignLast(String value);
    @JsProperty(name = "textAnchor")
    public native void setTextAnchor(String value);
    @JsProperty(name = "textDecoration")
    public native void setTextDecoration(String value);
    @JsProperty(name = "textIndent")
    public native void setTextIndent(String value);
    @JsProperty(name = "textJustify")
    public native void setTextJustify(String value);
    @JsProperty(name = "textKashida")
    public native void setTextKashida(String value);
    @JsProperty(name = "textKashidaSpace")
    public native void setTextKashidaSpace(String value);
    @JsProperty(name = "textOverflow")
    public native void setTextOverflow(String value);
    @JsProperty(name = "textShadow")
    public native void setTextShadow(String value);
    @JsProperty(name = "textTransform")
    public native void setTextTransform(String value);
    @JsProperty(name = "textUnderlinePosition")
    public native void setTextUnderlinePosition(String value);
    @JsProperty(name = "top")
    public native void setTop(String value);
    @JsProperty(name = "touchAction")
    public native void setTouchAction(String value);
    @JsProperty(name = "transform")
    public native void setTransform(String value);
    @JsProperty(name = "transformOrigin")
    public native void setTransformOrigin(String value);
    @JsProperty(name = "transformStyle")
    public native void setTransformStyle(String value);
    @JsProperty(name = "transition")
    public native void setTransition(String value);
    @JsProperty(name = "transitionDelay")
    public native void setTransitionDelay(String value);
    @JsProperty(name = "transitionDuration")
    public native void setTransitionDuration(String value);
    @JsProperty(name = "transitionProperty")
    public native void setTransitionProperty(String value);
    @JsProperty(name = "transitionTimingFunction")
    public native void setTransitionTimingFunction(String value);
    @JsProperty(name = "translate")
    public native void setTranslate(String value);
    @JsProperty(name = "unicodeBidi")
    public native void setUnicodeBidi(String value);
    @JsProperty(name = "userSelect")
    public native void setUserSelect(String value);
    @JsProperty(name = "verticalAlign")
    public native void setVerticalAlign(String value);
    @JsProperty(name = "visibility")
    public native void setVisibility(String value);
    @JsProperty(name = "webkitAlignContent")
    public native void setWebkitAlignContent(String value);
    @JsProperty(name = "webkitAlignItems")
    public native void setWebkitAlignItems(String value);
    @JsProperty(name = "webkitAlignSelf")
    public native void setWebkitAlignSelf(String value);
    @JsProperty(name = "webkitAnimation")
    public native void setWebkitAnimation(String value);
    @JsProperty(name = "webkitAnimationDelay")
    public native void setWebkitAnimationDelay(String value);
    @JsProperty(name = "webkitAnimationDirection")
    public native void setWebkitAnimationDirection(String value);
    @JsProperty(name = "webkitAnimationDuration")
    public native void setWebkitAnimationDuration(String value);
    @JsProperty(name = "webkitAnimationFillMode")
    public native void setWebkitAnimationFillMode(String value);
    @JsProperty(name = "webkitAnimationIterationCount")
    public native void setWebkitAnimationIterationCount(String value);
    @JsProperty(name = "webkitAnimationName")
    public native void setWebkitAnimationName(String value);
    @JsProperty(name = "webkitAnimationPlayState")
    public native void setWebkitAnimationPlayState(String value);
    @JsProperty(name = "webkitAnimationTimingFunction")
    public native void setWebkitAnimationTimingFunction(String value);
    @JsProperty(name = "webkitAppearance")
    public native void setWebkitAppearance(String value);
    @JsProperty(name = "webkitBackfaceVisibility")
    public native void setWebkitBackfaceVisibility(String value);
    @JsProperty(name = "webkitBackgroundClip")
    public native void setWebkitBackgroundClip(String value);
    @JsProperty(name = "webkitBackgroundOrigin")
    public native void setWebkitBackgroundOrigin(String value);
    @JsProperty(name = "webkitBackgroundSize")
    public native void setWebkitBackgroundSize(String value);
    @JsProperty(name = "webkitBorderBottomLeftRadius")
    public native void setWebkitBorderBottomLeftRadius(String value);
    @JsProperty(name = "webkitBorderBottomRightRadius")
    public native void setWebkitBorderBottomRightRadius(String value);
    @JsProperty(name = "webkitBorderImage")
    public native void setWebkitBorderImage(String value);
    @JsProperty(name = "webkitBorderRadius")
    public native void setWebkitBorderRadius(String value);
    @JsProperty(name = "webkitBorderTopLeftRadius")
    public native void setWebkitBorderTopLeftRadius(String value);
    @JsProperty(name = "webkitBorderTopRightRadius")
    public native void setWebkitBorderTopRightRadius(String value);
    @JsProperty(name = "webkitBoxAlign")
    public native void setWebkitBoxAlign(String value);
    @JsProperty(name = "webkitBoxDirection")
    public native void setWebkitBoxDirection(String value);
    @JsProperty(name = "webkitBoxFlex")
    public native void setWebkitBoxFlex(String value);
    @JsProperty(name = "webkitBoxOrdinalGroup")
    public native void setWebkitBoxOrdinalGroup(String value);
    @JsProperty(name = "webkitBoxOrient")
    public native void setWebkitBoxOrient(String value);
    @JsProperty(name = "webkitBoxPack")
    public native void setWebkitBoxPack(String value);
    @JsProperty(name = "webkitBoxSizing")
    public native void setWebkitBoxSizing(String value);
    @JsProperty(name = "webkitColumnBreakAfter")
    public native void setWebkitColumnBreakAfter(String value);
    @JsProperty(name = "webkitColumnBreakBefore")
    public native void setWebkitColumnBreakBefore(String value);
    @JsProperty(name = "webkitColumnBreakInside")
    public native void setWebkitColumnBreakInside(String value);
    @JsProperty(name = "webkitColumnCount")
    public native void setWebkitColumnCount(Object value);
    @JsProperty(name = "webkitColumnGap")
    public native void setWebkitColumnGap(Object value);
    @JsProperty(name = "webkitColumnRule")
    public native void setWebkitColumnRule(String value);
    @JsProperty(name = "webkitColumnRuleColor")
    public native void setWebkitColumnRuleColor(Object value);
    @JsProperty(name = "webkitColumnRuleStyle")
    public native void setWebkitColumnRuleStyle(String value);
    @JsProperty(name = "webkitColumnRuleWidth")
    public native void setWebkitColumnRuleWidth(Object value);
    @JsProperty(name = "webkitColumnSpan")
    public native void setWebkitColumnSpan(String value);
    @JsProperty(name = "webkitColumnWidth")
    public native void setWebkitColumnWidth(Object value);
    @JsProperty(name = "webkitColumns")
    public native void setWebkitColumns(String value);
    @JsProperty(name = "webkitFilter")
    public native void setWebkitFilter(String value);
    @JsProperty(name = "webkitFlex")
    public native void setWebkitFlex(String value);
    @JsProperty(name = "webkitFlexBasis")
    public native void setWebkitFlexBasis(String value);
    @JsProperty(name = "webkitFlexDirection")
    public native void setWebkitFlexDirection(String value);
    @JsProperty(name = "webkitFlexFlow")
    public native void setWebkitFlexFlow(String value);
    @JsProperty(name = "webkitFlexGrow")
    public native void setWebkitFlexGrow(String value);
    @JsProperty(name = "webkitFlexShrink")
    public native void setWebkitFlexShrink(String value);
    @JsProperty(name = "webkitFlexWrap")
    public native void setWebkitFlexWrap(String value);
    @JsProperty(name = "webkitJustifyContent")
    public native void setWebkitJustifyContent(String value);
    @JsProperty(name = "webkitOrder")
    public native void setWebkitOrder(String value);
    @JsProperty(name = "webkitPerspective")
    public native void setWebkitPerspective(String value);
    @JsProperty(name = "webkitPerspectiveOrigin")
    public native void setWebkitPerspectiveOrigin(String value);
    @JsProperty(name = "webkitTapHighlightColor")
    public native void setWebkitTapHighlightColor(String value);
    @JsProperty(name = "webkitTextFillColor")
    public native void setWebkitTextFillColor(String value);
    @JsProperty(name = "webkitTextSizeAdjust")
    public native void setWebkitTextSizeAdjust(Object value);
    @JsProperty(name = "webkitTextStroke")
    public native void setWebkitTextStroke(String value);
    @JsProperty(name = "webkitTextStrokeColor")
    public native void setWebkitTextStrokeColor(String value);
    @JsProperty(name = "webkitTextStrokeWidth")
    public native void setWebkitTextStrokeWidth(String value);
    @JsProperty(name = "webkitTransform")
    public native void setWebkitTransform(String value);
    @JsProperty(name = "webkitTransformOrigin")
    public native void setWebkitTransformOrigin(String value);
    @JsProperty(name = "webkitTransformStyle")
    public native void setWebkitTransformStyle(String value);
    @JsProperty(name = "webkitTransition")
    public native void setWebkitTransition(String value);
    @JsProperty(name = "webkitTransitionDelay")
    public native void setWebkitTransitionDelay(String value);
    @JsProperty(name = "webkitTransitionDuration")
    public native void setWebkitTransitionDuration(String value);
    @JsProperty(name = "webkitTransitionProperty")
    public native void setWebkitTransitionProperty(String value);
    @JsProperty(name = "webkitTransitionTimingFunction")
    public native void setWebkitTransitionTimingFunction(String value);
    @JsProperty(name = "webkitUserModify")
    public native void setWebkitUserModify(String value);
    @JsProperty(name = "webkitUserSelect")
    public native void setWebkitUserSelect(String value);
    @JsProperty(name = "webkitWritingMode")
    public native void setWebkitWritingMode(String value);
    @JsProperty(name = "whiteSpace")
    public native void setWhiteSpace(String value);
    @JsProperty(name = "widows")
    public native void setWidows(String value);
    @JsProperty(name = "width")
    public native void setWidth(String value);
    @JsProperty(name = "wordBreak")
    public native void setWordBreak(String value);
    @JsProperty(name = "wordSpacing")
    public native void setWordSpacing(String value);
    @JsProperty(name = "wordWrap")
    public native void setWordWrap(String value);
    @JsProperty(name = "writingMode")
    public native void setWritingMode(String value);
    @JsProperty(name = "zIndex")
    public native void setZIndex(String value);
    @JsProperty(name = "zoom")
    public native void setZoom(String value);
}
