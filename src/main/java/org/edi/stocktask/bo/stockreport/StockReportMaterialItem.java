package org.edi.stocktask.bo.stockreport;

import org.edi.freamwork.bo.DocumentBOLine;

public class StockReportMaterialItem extends DocumentBOLine implements IStockReportMaterialItem {


    private Integer docEntry;
    private Integer lineId;
    private String objectCode;
    private String itemCode;
    private String batchNumber;
    private String serialNumber;
    private String barCode;
    private Double quantity;

    @Override
    public Integer getDocEntry() {
        return docEntry;
    }

    @Override
    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }

    @Override
    public Integer getLineId() {
        return lineId;
    }

    @Override
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    @Override
    public String getObjectCode() {
        return objectCode;
    }

    @Override
    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    @Override
    public String getItemCode() {
        return itemCode;
    }

    @Override
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }


    @Override
    public String getBatchNumber() {
        return batchNumber;
    }

    @Override
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String getBarCode() {
        return barCode;
    }

    @Override
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public Double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }


    public StockReportMaterialItem() {
    }

    public StockReportMaterialItem(Integer docEntry, Integer lineId, String objectCode, String itemCode, String batchNumber, String serialNumber, String barCode, Double quantity) {
        this.docEntry = docEntry;
        this.lineId = lineId;
        this.objectCode = objectCode;
        this.itemCode = itemCode;
        this.batchNumber = batchNumber;
        this.serialNumber = serialNumber;
        this.barCode = barCode;
        this.quantity = quantity;
    }
}