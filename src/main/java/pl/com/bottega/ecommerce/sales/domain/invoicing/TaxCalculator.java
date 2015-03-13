package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class TaxCalculator {

    static Tax calculate(ProductType type, Money netValue){
        BigDecimal ratio = type.getTaxValue();
        String desc = type.getTaxDesc();
        Money taxValue = netValue.multiplyBy(ratio);
        return new Tax(taxValue, desc);
    }
}
