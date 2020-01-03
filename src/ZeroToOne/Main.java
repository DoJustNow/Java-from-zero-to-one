package ZeroToOne;

import ZeroToOne.FlashOfLightning.DTO.DistanceDTO;
import ZeroToOne.FlashOfLightning.DTO.DurationDTO;
import ZeroToOne.FlashOfLightning.DistanceCalculator;
import ZeroToOne.ObjectManager.ObjectManager;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        DistanceCalculator distanceCalculator = ObjectManager.get(DistanceCalculator.class);

        DurationDTO durationDTO = new DurationDTO(12, TimeUnit.SECONDS);
        DistanceDTO result = distanceCalculator.distanceToFlash(durationDTO);

        System.out.println("Растояние до молнии: " + result.getValue() + "(" + result.getUnit() + ")");
    }
}

