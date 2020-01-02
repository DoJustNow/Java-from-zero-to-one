package ZeroToOne.FlashOfLightning;

import ZeroToOne.FlashOfLightning.DTO.DistanceDTO;
import ZeroToOne.FlashOfLightning.DTO.DurationDTO;
import com.sun.istack.internal.NotNull;

/**
 * Calculate distance to light
 */
public class DistanceCalculator {

    /**
     * Sound speed<br>
     * Units of measurement: one of <i>{@link DistanceUnit}  per second</i>
     */
    private final static DistanceDTO SOUND_SPEED = new DistanceDTO(331, DistanceUnit.METERS);

    /**
     * @param soundWaveDuration time between flash and sound
     * @return Distance to light
     */
    public DistanceDTO distanceToFlash(DurationDTO soundWaveDuration) {
        long distance;
        long time;

        time = soundWaveDuration.getUnit().toSeconds(soundWaveDuration.getValue());

        distance = time * SOUND_SPEED.getUnit().toMeters(SOUND_SPEED.getValue());

        return new DistanceDTO(distance, DistanceUnit.METERS);
    }
}
