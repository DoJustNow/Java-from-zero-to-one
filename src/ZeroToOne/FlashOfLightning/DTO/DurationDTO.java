package ZeroToOne.FlashOfLightning.DTO;

import com.sun.istack.internal.NotNull;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class DurationDTO {
    private long value;
    private TimeUnit unit;

    /**
     * Constructor
     * @param duration time in {@link DurationDTO#unit}'s
     * @param unit required not null
     */
    public DurationDTO(long duration,@NotNull TimeUnit unit) {
        this.value = duration;
        this.unit = Objects.requireNonNull(unit);
    }

    @NotNull
    public long getValue() {
        return value;
    }

    @NotNull
    public TimeUnit getUnit() {
        return unit;
    }
}
