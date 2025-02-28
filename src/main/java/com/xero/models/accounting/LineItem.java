/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** LineItem */
public class LineItem {
  StringUtil util = new StringUtil();

  @JsonProperty("LineItemID")
  private UUID lineItemID;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("Quantity")
  private Double quantity;

  @JsonProperty("UnitAmount")
  private Double unitAmount;

  @JsonProperty("ItemCode")
  private String itemCode;

  @JsonProperty("AccountCode")
  private String accountCode;

  @JsonProperty("TaxType")
  private String taxType;

  @JsonProperty("TaxAmount")
  private Double taxAmount;

  @JsonProperty("LineAmount")
  private Double lineAmount;

  @JsonProperty("Tracking")
  private List<LineItemTracking> tracking = new ArrayList<LineItemTracking>();

  @JsonProperty("DiscountRate")
  private Double discountRate;

  @JsonProperty("DiscountAmount")
  private Double discountAmount;

  @JsonProperty("RepeatingInvoiceID")
  private UUID repeatingInvoiceID;
  /**
   * LineItem unique ID
   *
   * @param lineItemID UUID
   * @return LineItem
   */
  public LineItem lineItemID(UUID lineItemID) {
    this.lineItemID = lineItemID;
    return this;
  }

  /**
   * LineItem unique ID
   *
   * @return lineItemID
   */
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "LineItem unique ID")
  /**
   * LineItem unique ID
   *
   * @return lineItemID UUID
   */
  public UUID getLineItemID() {
    return lineItemID;
  }

  /**
   * LineItem unique ID
   *
   * @param lineItemID UUID
   */
  public void setLineItemID(UUID lineItemID) {
    this.lineItemID = lineItemID;
  }

  /**
   * Description needs to be at least 1 char long. A line item with just a description (i.e no unit
   * amount or quantity) can be created by specifying just a &lt;Description&gt; element that
   * contains at least 1 character
   *
   * @param description String
   * @return LineItem
   */
  public LineItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description needs to be at least 1 char long. A line item with just a description (i.e no unit
   * amount or quantity) can be created by specifying just a &lt;Description&gt; element that
   * contains at least 1 character
   *
   * @return description
   */
  @ApiModelProperty(
      value =
          "Description needs to be at least 1 char long. A line item with just a description (i.e"
              + " no unit amount or quantity) can be created by specifying just a <Description>"
              + " element that contains at least 1 character")
  /**
   * Description needs to be at least 1 char long. A line item with just a description (i.e no unit
   * amount or quantity) can be created by specifying just a &lt;Description&gt; element that
   * contains at least 1 character
   *
   * @return description String
   */
  public String getDescription() {
    return description;
  }

  /**
   * Description needs to be at least 1 char long. A line item with just a description (i.e no unit
   * amount or quantity) can be created by specifying just a &lt;Description&gt; element that
   * contains at least 1 character
   *
   * @param description String
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * LineItem Quantity
   *
   * @param quantity Double
   * @return LineItem
   */
  public LineItem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * LineItem Quantity
   *
   * @return quantity
   */
  @ApiModelProperty(value = "LineItem Quantity")
  /**
   * LineItem Quantity
   *
   * @return quantity Double
   */
  public Double getQuantity() {
    return quantity;
  }

  /**
   * LineItem Quantity
   *
   * @param quantity Double
   */
  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  /**
   * LineItem Unit Amount
   *
   * @param unitAmount Double
   * @return LineItem
   */
  public LineItem unitAmount(Double unitAmount) {
    this.unitAmount = unitAmount;
    return this;
  }

  /**
   * LineItem Unit Amount
   *
   * @return unitAmount
   */
  @ApiModelProperty(value = "LineItem Unit Amount")
  /**
   * LineItem Unit Amount
   *
   * @return unitAmount Double
   */
  public Double getUnitAmount() {
    return unitAmount;
  }

  /**
   * LineItem Unit Amount
   *
   * @param unitAmount Double
   */
  public void setUnitAmount(Double unitAmount) {
    this.unitAmount = unitAmount;
  }

  /**
   * See Items
   *
   * @param itemCode String
   * @return LineItem
   */
  public LineItem itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

  /**
   * See Items
   *
   * @return itemCode
   */
  @ApiModelProperty(value = "See Items")
  /**
   * See Items
   *
   * @return itemCode String
   */
  public String getItemCode() {
    return itemCode;
  }

  /**
   * See Items
   *
   * @param itemCode String
   */
  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  /**
   * See Accounts
   *
   * @param accountCode String
   * @return LineItem
   */
  public LineItem accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * See Accounts
   *
   * @return accountCode
   */
  @ApiModelProperty(value = "See Accounts")
  /**
   * See Accounts
   *
   * @return accountCode String
   */
  public String getAccountCode() {
    return accountCode;
  }

  /**
   * See Accounts
   *
   * @param accountCode String
   */
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  /**
   * The tax type from TaxRates
   *
   * @param taxType String
   * @return LineItem
   */
  public LineItem taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * The tax type from TaxRates
   *
   * @return taxType
   */
  @ApiModelProperty(value = "The tax type from TaxRates")
  /**
   * The tax type from TaxRates
   *
   * @return taxType String
   */
  public String getTaxType() {
    return taxType;
  }

  /**
   * The tax type from TaxRates
   *
   * @param taxType String
   */
  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  /**
   * The tax amount is auto calculated as a percentage of the line amount (see below) based on the
   * tax rate. This value can be overriden if the calculated &lt;TaxAmount&gt; is not correct.
   *
   * @param taxAmount Double
   * @return LineItem
   */
  public LineItem taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * The tax amount is auto calculated as a percentage of the line amount (see below) based on the
   * tax rate. This value can be overriden if the calculated &lt;TaxAmount&gt; is not correct.
   *
   * @return taxAmount
   */
  @ApiModelProperty(
      value =
          "The tax amount is auto calculated as a percentage of the line amount (see below) based"
              + " on the tax rate. This value can be overriden if the calculated <TaxAmount> is"
              + " not correct.")
  /**
   * The tax amount is auto calculated as a percentage of the line amount (see below) based on the
   * tax rate. This value can be overriden if the calculated &lt;TaxAmount&gt; is not correct.
   *
   * @return taxAmount Double
   */
  public Double getTaxAmount() {
    return taxAmount;
  }

  /**
   * The tax amount is auto calculated as a percentage of the line amount (see below) based on the
   * tax rate. This value can be overriden if the calculated &lt;TaxAmount&gt; is not correct.
   *
   * @param taxAmount Double
   */
  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  /**
   * If you wish to omit either of the &lt;Quantity&gt; or &lt;UnitAmount&gt; you can provide a
   * LineAmount and Xero will calculate the missing amount for you. The line amount reflects the
   * discounted price if a DiscountRate has been used . i.e LineAmount &#x3D; Quantity * Unit Amount
   * * ((100 – DiscountRate)/100)
   *
   * @param lineAmount Double
   * @return LineItem
   */
  public LineItem lineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
    return this;
  }

  /**
   * If you wish to omit either of the &lt;Quantity&gt; or &lt;UnitAmount&gt; you can provide a
   * LineAmount and Xero will calculate the missing amount for you. The line amount reflects the
   * discounted price if a DiscountRate has been used . i.e LineAmount &#x3D; Quantity * Unit Amount
   * * ((100 – DiscountRate)/100)
   *
   * @return lineAmount
   */
  @ApiModelProperty(
      value =
          "If you wish to omit either of the <Quantity> or <UnitAmount> you can provide a"
              + " LineAmount and Xero will calculate the missing amount for you. The line amount"
              + " reflects the discounted price if a DiscountRate has been used . i.e LineAmount ="
              + " Quantity * Unit Amount * ((100 – DiscountRate)/100)")
  /**
   * If you wish to omit either of the &lt;Quantity&gt; or &lt;UnitAmount&gt; you can provide a
   * LineAmount and Xero will calculate the missing amount for you. The line amount reflects the
   * discounted price if a DiscountRate has been used . i.e LineAmount &#x3D; Quantity * Unit Amount
   * * ((100 – DiscountRate)/100)
   *
   * @return lineAmount Double
   */
  public Double getLineAmount() {
    return lineAmount;
  }

  /**
   * If you wish to omit either of the &lt;Quantity&gt; or &lt;UnitAmount&gt; you can provide a
   * LineAmount and Xero will calculate the missing amount for you. The line amount reflects the
   * discounted price if a DiscountRate has been used . i.e LineAmount &#x3D; Quantity * Unit Amount
   * * ((100 – DiscountRate)/100)
   *
   * @param lineAmount Double
   */
  public void setLineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
  }

  /**
   * Optional Tracking Category – see Tracking. Any LineItem can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @param tracking List&lt;LineItemTracking&gt;
   * @return LineItem
   */
  public LineItem tracking(List<LineItemTracking> tracking) {
    this.tracking = tracking;
    return this;
  }

  /**
   * Optional Tracking Category – see Tracking. Any LineItem can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @param trackingItem LineItemTracking
   * @return LineItem
   */
  public LineItem addTrackingItem(LineItemTracking trackingItem) {
    if (this.tracking == null) {
      this.tracking = new ArrayList<LineItemTracking>();
    }
    this.tracking.add(trackingItem);
    return this;
  }

  /**
   * Optional Tracking Category – see Tracking. Any LineItem can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @return tracking
   */
  @ApiModelProperty(
      value =
          "Optional Tracking Category – see Tracking.  Any LineItem can have a  maximum of 2"
              + " <TrackingCategory> elements.")
  /**
   * Optional Tracking Category – see Tracking. Any LineItem can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @return tracking List<LineItemTracking>
   */
  public List<LineItemTracking> getTracking() {
    return tracking;
  }

  /**
   * Optional Tracking Category – see Tracking. Any LineItem can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @param tracking List&lt;LineItemTracking&gt;
   */
  public void setTracking(List<LineItemTracking> tracking) {
    this.tracking = tracking;
  }

  /**
   * Percentage discount being applied to a line item (only supported on ACCREC invoices – ACC PAY
   * invoices and credit notes in Xero do not support discounts
   *
   * @param discountRate Double
   * @return LineItem
   */
  public LineItem discountRate(Double discountRate) {
    this.discountRate = discountRate;
    return this;
  }

  /**
   * Percentage discount being applied to a line item (only supported on ACCREC invoices – ACC PAY
   * invoices and credit notes in Xero do not support discounts
   *
   * @return discountRate
   */
  @ApiModelProperty(
      value =
          "Percentage discount being applied to a line item (only supported on  ACCREC invoices –"
              + " ACC PAY invoices and credit notes in Xero do not support discounts")
  /**
   * Percentage discount being applied to a line item (only supported on ACCREC invoices – ACC PAY
   * invoices and credit notes in Xero do not support discounts
   *
   * @return discountRate Double
   */
  public Double getDiscountRate() {
    return discountRate;
  }

  /**
   * Percentage discount being applied to a line item (only supported on ACCREC invoices – ACC PAY
   * invoices and credit notes in Xero do not support discounts
   *
   * @param discountRate Double
   */
  public void setDiscountRate(Double discountRate) {
    this.discountRate = discountRate;
  }

  /**
   * Discount amount being applied to a line item. Only supported on ACCREC invoices - ACCPAY
   * invoices and credit notes in Xero do not support discounts.
   *
   * @param discountAmount Double
   * @return LineItem
   */
  public LineItem discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Discount amount being applied to a line item. Only supported on ACCREC invoices - ACCPAY
   * invoices and credit notes in Xero do not support discounts.
   *
   * @return discountAmount
   */
  @ApiModelProperty(
      value =
          "Discount amount being applied to a line item. Only supported on ACCREC invoices -"
              + " ACCPAY invoices and credit notes in Xero do not support discounts.")
  /**
   * Discount amount being applied to a line item. Only supported on ACCREC invoices - ACCPAY
   * invoices and credit notes in Xero do not support discounts.
   *
   * @return discountAmount Double
   */
  public Double getDiscountAmount() {
    return discountAmount;
  }

  /**
   * Discount amount being applied to a line item. Only supported on ACCREC invoices - ACCPAY
   * invoices and credit notes in Xero do not support discounts.
   *
   * @param discountAmount Double
   */
  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  /**
   * The Xero identifier for a Repeating Invoice
   *
   * @param repeatingInvoiceID UUID
   * @return LineItem
   */
  public LineItem repeatingInvoiceID(UUID repeatingInvoiceID) {
    this.repeatingInvoiceID = repeatingInvoiceID;
    return this;
  }

  /**
   * The Xero identifier for a Repeating Invoice
   *
   * @return repeatingInvoiceID
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value = "The Xero identifier for a Repeating Invoice")
  /**
   * The Xero identifier for a Repeating Invoice
   *
   * @return repeatingInvoiceID UUID
   */
  public UUID getRepeatingInvoiceID() {
    return repeatingInvoiceID;
  }

  /**
   * The Xero identifier for a Repeating Invoice
   *
   * @param repeatingInvoiceID UUID
   */
  public void setRepeatingInvoiceID(UUID repeatingInvoiceID) {
    this.repeatingInvoiceID = repeatingInvoiceID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.lineItemID, lineItem.lineItemID)
        && Objects.equals(this.description, lineItem.description)
        && Objects.equals(this.quantity, lineItem.quantity)
        && Objects.equals(this.unitAmount, lineItem.unitAmount)
        && Objects.equals(this.itemCode, lineItem.itemCode)
        && Objects.equals(this.accountCode, lineItem.accountCode)
        && Objects.equals(this.taxType, lineItem.taxType)
        && Objects.equals(this.taxAmount, lineItem.taxAmount)
        && Objects.equals(this.lineAmount, lineItem.lineAmount)
        && Objects.equals(this.tracking, lineItem.tracking)
        && Objects.equals(this.discountRate, lineItem.discountRate)
        && Objects.equals(this.discountAmount, lineItem.discountAmount)
        && Objects.equals(this.repeatingInvoiceID, lineItem.repeatingInvoiceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lineItemID,
        description,
        quantity,
        unitAmount,
        itemCode,
        accountCode,
        taxType,
        taxAmount,
        lineAmount,
        tracking,
        discountRate,
        discountAmount,
        repeatingInvoiceID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    sb.append("    lineItemID: ").append(toIndentedString(lineItemID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    lineAmount: ").append(toIndentedString(lineAmount)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    repeatingInvoiceID: ").append(toIndentedString(repeatingInvoiceID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
