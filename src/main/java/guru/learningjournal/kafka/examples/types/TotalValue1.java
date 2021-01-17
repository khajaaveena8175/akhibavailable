
package guru.learningjournal.kafka.examples.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ItemCode1",
    "ItemDescription1",
    "ItemPrice1",
    "ItemQty1"
})
public class TotalValue1 {

    @JsonProperty("ItemCode1")
    private String itemCode1;
    @JsonProperty("ItemDescription1")
    private String itemDescription1;
    @JsonProperty("ItemPrice1")
    private Double itemPrice1;
    @JsonProperty("ItemQty1")
    private Integer itemQty1;

    @JsonProperty("ItemCode1")
    public String getItemCode1() {
        return itemCode1;
    }

    @JsonProperty("ItemCode1")
    public void setItemCode1(String itemCode1) {
        this.itemCode1 = itemCode1;
    }

    public TotalValue1 withItemCode1(String itemCode1) {
        this.itemCode1 = itemCode1;
        return this;
    }

    @JsonProperty("ItemDescription1")
    public String getItemDescription1() {
        return itemDescription1;
    }

    @JsonProperty("ItemDescription1")
    public void setItemDescription1(String itemDescription1) {
        this.itemDescription1 = itemDescription1;
    }

    public TotalValue1 withItemDescription1(String itemDescription1) {
        this.itemDescription1 = itemDescription1;
        return this;
    }

    @JsonProperty("ItemPrice1")
    public Double getItemPrice1() {
        return itemPrice1;
    }

    @JsonProperty("ItemPrice1")
    public void setItemPrice1(Double itemPrice1) {
        this.itemPrice1 = itemPrice1;
    }

    public TotalValue1 withItemPrice1(Double itemPrice1) {
        this.itemPrice1 = itemPrice1;
        return this;
    }

    @JsonProperty("ItemQty1")
    public Integer getItemQty1() {
        return itemQty1;
    }

    @JsonProperty("ItemQty1")
    public void setItemQty1(Integer itemQty1) {
        this.itemQty1 = itemQty1;
    }

    public TotalValue1 withItemQty1(Integer itemQty1) {
        this.itemQty1 = itemQty1;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("itemCode1", itemCode1).append("itemDescription1", itemDescription1).append("itemPrice1", itemPrice1).append("itemQty1", itemQty1).toString();
    }

}
