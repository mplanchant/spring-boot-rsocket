package uk.co.logiccache.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarketData {

    private String stock;
    private int currentPrice;

    public static MarketData fromException(Exception e) {
        return MarketData.builder().stock(e.getMessage()).build();
    }
}
