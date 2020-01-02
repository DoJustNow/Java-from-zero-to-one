package ZeroToOne.FlashOfLightning.DTO;

import ZeroToOne.FlashOfLightning.DistanceUnit;

import java.util.Objects;

public class DistanceDTO {
    private long value;
    private DistanceUnit unit;

    public DistanceDTO(long value, DistanceUnit unit) {
        this.value = value;
        this.unit = Objects.requireNonNull(unit);
    }

    public long getValue() {
        return value;
    }

    public DistanceUnit getUnit() {
        return unit;
    }
}
