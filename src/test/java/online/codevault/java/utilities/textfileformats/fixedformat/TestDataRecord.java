package online.codevault.java.utilities.textfileformats.fixedformat;

import lombok.Getter;
import lombok.Setter;
import online.codevault.java.utilities.textfileformats.fixedformat.annotations.FixedWidthField;
import online.codevault.java.utilities.textfileformats.fixedformat.annotations.FixedWidthRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@FixedWidthRecord(
        length = 70,
        description = "Test Data Record"
)
@Getter
@Setter
public final class TestDataRecord {

    @FixedWidthField(
            ordinal = 1,
            startPosition = 1,
            endPosition = 8,
            length = 8
    )
    public Integer testInteger;

    @FixedWidthField(
            ordinal = 2,
            startPosition = 9,
            endPosition = 14,
            length = 6
    )
    public String testString;

    @FixedWidthField(
            ordinal = 3,
            startPosition = 15,
            endPosition = 15,
            length = 1
    )
    public String testBoolean_Y_N;

    @FixedWidthField(
            ordinal = 4,
            startPosition = 16,
            endPosition = 23,
            length = 8,
            dateFormat = "yyyyMMdd"
    )
    public LocalDate testDate;

    @FixedWidthField(
            ordinal = 5,
            startPosition = 24,
            endPosition = 29,
            length = 6,
            dateFormat = "HHmmss"
    )
    public LocalTime testTime;

    @FixedWidthField(
            ordinal = 6,
            startPosition = 30,
            endPosition = 42,
            length = 13,
            scale = 2,
            signedValueIndicator = FieldDefinition.SignedValueIndicator.RIGHT
    )
    public BigDecimal testBigDecimal1;

    @FixedWidthField(
            ordinal = 7,
            startPosition = 43,
            endPosition = 55,
            length = 13,
            scale = 2,
            signedValueIndicator = FieldDefinition.SignedValueIndicator.RIGHT
    )
    public BigDecimal testBigDecimal2;

    @FixedWidthField(
            ordinal = 8,
            startPosition = 56,
            endPosition = 70,
            length = 14,
            filler = true
    )
    public String filler;
}
