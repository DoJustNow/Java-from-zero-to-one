package ZeroToOne.FlashOfLightning;

public enum DistanceUnit {
    METERS {
        public long toMeters(long value) {
            return value;
        }

        public long toKilometers(long value) {
            return toMeters(value) / METERS_IN_KILOMETERS;
        }

        public long toInches(long value) {
            return (long) (value * INCHES_IN_METERS);
        }

        public long toFeet(long value) {
            return toInches(value) / INCHES_IN_FEET;
        }
    },
    KILOMETERS {
        public long toMeters(long value) {
            return value * METERS_IN_KILOMETERS;
        }

        public long toKilometers(long value) {
            return value;
        }

        public long toInches(long value) {
            return (long) (value * INCHES_IN_METERS * METERS_IN_KILOMETERS);
        }

        public long toFeet(long value) {
            return toInches(value) / INCHES_IN_FEET;
        }
    },
    INCHES {
        public long toMeters(long value) {
            return (long) (value / INCHES_IN_METERS);
        }

        public long toKilometers(long value) {
            return toMeters(value) / METERS_IN_KILOMETERS;
        }

        public long toInches(long value) {
            return value;
        }

        public long toFeet(long value) {
            return toInches(value) / INCHES_IN_FEET;
        }
    },
    FEET {
        public long toMeters(long value) {
            return (long) (value / INCHES_IN_METERS * INCHES_IN_FEET);
        }

        public long toKilometers(long value) {
            return toMeters(value) / METERS_IN_KILOMETERS;
        }

        public long toInches(long value) {
            return value * INCHES_IN_FEET;
        }

        public long toFeet(long value) {
            return value;
        }
    };

    private static final long METERS_IN_KILOMETERS = 1000;
    private static final double INCHES_IN_METERS = 39.370078740157;
    private static final int INCHES_IN_FEET = 12;

    public long toMeters(long value) {
        throw new AbstractMethodError();
    }

    public long toKilometers(long value) {
        throw new AbstractMethodError();
    }

    public long toInches(long value) {
        throw new AbstractMethodError();
    }

    public long toFeet(long value) {
        throw new AbstractMethodError();
    }
}
