package mx.com.telcel.sipab.dto.response;

import java.util.List;

import lombok.Data;
import mx.com.telcel.sipab.client.interfaces.InvoiceItemDetailInfoQueryUnpaidType;
import mx.com.telcel.sipab.client.interfaces.InvoicePaymentInfoQueryUnpaidType;

public @Data class DetalleOrden {

	private Long invoiceItemId;
    private String payMode;
    private String feeType;
    private String payDirection;
    private String chargeCode;
    private String chargeName;
    private Long unitPrice;
    private Long quantity;
    private long amount;
    private String includedTax;
    private Long taxAmount;
    private Long discountAmount;
    private InvoiceItemDetailInfoQueryUnpaidType invoiceItemDetailInfo;
    private String remark;
    private List<InvoicePaymentInfoQueryUnpaidType> metodosDePago;
    
}
