package ru.grinn.diadocsoap.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class UniversalTransferDocument {

    private Date documentDate;
    private String documentNumber;

    private String buyerINN = "";
    private List<UniversalTransferDocumentItem> items;

    public UniversalTransferDocument() {
        items = new ArrayList<>();
    }

    public void addItem(UniversalTransferDocumentItem item) {
        items.add(item);
    }

}
