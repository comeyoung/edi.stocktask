package org.edi.stocktask.data;

import org.edi.freamwork.data.operation.OpResultCode;

/**
 * @author Fancy
 * @date 2018/7/31
 */
public class StockOpResultCode extends OpResultCode{

    /**
     * 对象为空
     */

    public static final String STOCK_DATABASE_ERROR = "3202000";

    public static final String STOCK_OBJECT_DETAIL_IS_EMPTY = "5102001";

    public static final String STOCK_OBJECT_BASETYPE_IS_NULL = "5102002";

    public static final String STOCK_OBJECT_BASEENTRY_IS_NULL = "5102003";

    public static final String STOCK_OBJECT_BASELINEID_IS_NULL = "5102004";

    public static final String STOCK_OBJECT_DOCSTATUS_IS_NULL = "5102005";

    public static final String STOCK_OBJECT_LINESTATUS_IS_NULL = "5102006";

    public static final String STOCK_OBJECT_OBJECTCODE_IS_NULL = "5102007";

    public static final String STOCK_CODEBAR_IS_NULL = "5102101";

    public static final String STOCK_OBJECT_ITEMCODE_IS_NULL = "5102102";

    public static final String STOCK_OBJECT_BASEENTRY_IS_INVALID = "5102103";

    public static final String STOCK_OBJECT_BASELINE_IS_NULL = "5102104";

    public static final String STOCK_OBJECT_QUANTITY_IS_INVALID = "5102105";

    public static final String STOCK_OBJECT_TOWAREHOUSE_IS_NULL = "5102106";

    public static final String STOCK_BASETYPE_IS_NULL = "5102107";

    public static final String STOCK_BASEENTRY_IS_NULL = "5102108";

    public static final String STOCK_BASELINE_IS_NULL = "5102109";

    public static final String BARCODE_PARSE_RESULT_IS_ERROR = "5102110";

    public static final String B1DOCENTRY_IS_EXISTENT = "1101007";

    public static final String PARAMETER_IS_NULL= "1101108";

    public static final String CODEBAR_IS_NULL= "1101009";

    public static final String DOCTYPE_IS_NULL= "1101010";

    public static final String DETAIL_IS_NULL= "1101011";

    public static final String REPORTTASK_IS_EMPTY= "1101012";

    public static final String REPORT_IS_EMPTY= "1101013";

    public static final String TASK_IS_EMPTY= "1101014";

    public static final String MATERIALITEM_IS_NULL= "1101015";

    public static final String CODEBAR_IS_REPEAT= "1101016";

    public static final String BARCODE_ANALYSIS_IS_FAIL = "1101020";

    public static final String STOCK_OBJECT_TargetDocumentType_IS_NULL = "1101021";





}
